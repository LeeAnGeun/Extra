
public class ChangNumberClass {

	public static void main(String[] args) {
		
		int number10 = 345;
		String number16 = "";
		String number2 = "";
		
		number2 = changeNumber10To2(number10);				
		System.out.println(number10 + "의 2진수는 " + number2 + "입니다");
				
		number10 = changeNumber2To10(number2);				
		System.out.println(number2 + "의 10진수는 " + number10 + "입니다");	
				
		number16 = changeNumber10To16(number10);		
		System.out.println(number10 + "의 16진수는 0x" + number16 + "입니다");
		
		
		number10 = changeNumber16To10(number16);			
		System.out.println("0x" + number16 + "의 10진수는 " + number10 + "입니다");
	}
	
	static String changeNumber10To2(int num) {
		String number2 = "";
		int tag;
		
		while(true) {
			tag = num % 2;
			number2 = tag + number2;	// 1010
			if(num / 2 == 0) {
				break;
			}
			num = num / 2;	// 5 2
		}
		return number2;		
	}
	
	static int changeNumber2To10(String num2) {
		int len = num2.length();
		int n, n1;	// n:숫자   n1:승수
		
		int num10 = 0;
		
		for (int i = 0; i < num2.length(); i++) {
			char c = num2.charAt(i);			
			n = Integer.parseInt(c + "");		// 1	// Inteber.parseInt(c + "") 는 String형을 입력받아야 하므로 c + ""를 사용		
			n1 = (int)Math.pow(2, len - 1);		// 2의 3승			
			n = n * n1;							// 1 * 2의 3승 
			len--;								// 3승 -> 2승
			num10 = num10 + n;					// 결과에 포함	
		}
		
		return num10;		
	}
	
	static String changeNumber10To16(int num) {
		String number16 = "";
		String str = "";
		int tag16;
		
		while(true) {
			tag16 = num % 16;
			
			switch (tag16) {
				case 10:
					str = "A";
					break;
				case 11:
					str = "B";
					break;
				case 12:
					str = "C";
					break;
				case 13:
					str = "D";
					break;
				case 14:
					str = "E";
					break;
				case 15:
					str = "F";
					break;
				default:
					str = tag16 + ""; // int형 tag16을 String형으로 저장하기 위한 코드
			}
			
			number16 = str + number16;
			if(num / 16 == 0) {
				break;
			}
			num = num / 16;
		}
		return number16;
	}
	
	static int changeNumber16To10(String num16) {
		int len16 = num16.length();
		
		String c16;
		int temp = 0;
		int n16;
		int number = 0;
		
		for (int i = 0; i < num16.length(); i++) {
			
			c16 = num16.charAt(i) + "";

			if(c16.equals("A") || c16.equals("a")) {
				c16 = "10";
			}
			else if(c16.equals("B") || c16.equals("b")) {
				c16 = "11";
			}
			else if(c16.equals("C") || c16.equals("c")) {
				c16 = "12";
			}
			else if(c16.equals("D") || c16.equals("d")) {
				c16 = "13";
			}
			else if(c16.equals("E") || c16.equals("e")) {
				c16 = "14";
			}
			else if(c16.equals("F") || c16.equals("f")) {
				c16 = "15";
			}
			
			temp = (int)Math.pow(16, len16 - 1);
			n16 = Integer.parseInt(c16) * temp;
			
			number = number + n16;
			len16--;
		}
		
		return number;
	}
	}

}
