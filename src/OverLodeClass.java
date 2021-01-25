
public class OverLodeClass {

	public static void main(String[] args) {
		/*
		   Over Lode : 함수(method) 명은 같고
		   			   매개변수(parameter)의 자료형이나 갯수가 다른것을 의미
		   
		   print() 				: 이미지를 Drawing
		   print(int x, int y)  : 이미지 위에 이미지 Drawing
		   print(char c)        :
		   print(int i)
		   print(char c, int y)
		   print(int y, char c) 
		   -> 함수의 이름은 같으나 매개변수의 갯수나 자료형이 다르기 때문에 다른 함수이다
		   
		   대신 print(int y, int x)는 위 에 print(int x, int y)가 있기때문에 허용되지 않는다
		 */
		
		method();
		
		method('a');
		
		method(123);
		
		method('b', 123.4567);
	
		method(123.4567, 'b');
		
		// 가변인수 -> 인수값을 유동적으로 바꿀 수 있다.
		int sum = sumProc(1, 3, 4, 5, 7, 10);
		System.out.println("sum = " + sum);
		
		sum = sumProc(1, 3, 4, 5, 7, 10, 54, 52, 76);
		System.out.println("sum = " + sum);
		
		double avg = avg("hello", 1, 2,3, 4,5);
		System.out.println("avg = " + avg);
		
		int array[] = {11, 22, 33, 302};
		avg = avg("hello", array);
		System.out.println("avg = " + avg);		// TODO Auto-generated method stub

	}

	
	// method의 이름은 같지만 매개변수의 자료형이 다른 경우
	static void method() {
		System.out.println("method() 호출");
	}

	static void method(char c) {
		System.out.println("method(char c) 호출");
	}
	
	static void method(int i) {
		System.out.println("method(int i) 호출");
	}
	
	// method의 이름은 같지만 매개변수의 갯수가 다른 경우
	static void method(char c, double d) {
		System.out.println("method(char c, double d) 호출");
	}
	
	// 위에 methode와 같아 보이지만 매개변수의 위치가 바뀌어도 허용 된다.
	static void method(double d, char c) {
		System.out.println("method(double d, char c) 호출");
	}
	
	// 허용이 안되는 경우
	// 가인수가 다르다고 허용이 되지 않는다. 
	/*
	static void method(double e, char a) {
		System.out.println("method(double d, char c) 호출");
	}
	*/
	
	// 반환형이 다르더라도 method의 이름이 같으면 허용 되지 않는다
	/*
	static int method() {
		
	}
	*/
	
	// 가변인수
	static int sumProc(int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		return sum;
	}
	
	// 가변인수는 매개변수에서 가장 뒤에서 사용해야 한다.
	static double avg(String str, int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		double avg = sum / num.length;
		
		return avg;
	}
}
