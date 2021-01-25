import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionClass2 {

	public static void main(String[] args) {
		
		// NullPointerException   예외보다는 에러에 가깝다.
		String str = null; // 주소값이 없다
		String str1 = ""; // 주소값은 있다.
		
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		// ArrayIndexOutOfBoundsException
		int arr[] = {1,2,3};
		try {
			arr[2] = 'A';  // char형의 문자를 자동으로 ASCII코드 값으로 변환되어 저장되기 때문에 예외가 발생하지 않는다.
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileNotFoundException   파일을 찾지 못했을때의 예외
		File file = new File("d:\\xxx");
		FileInputStream is;
		
		try {
		is = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// StringIndexOutBondsException // 초기화된 String의 범위를 초과하였을 때 
		String str2 = "java";
		
		try {
			str1.charAt(4);
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// NumberFormatException   ex) 65입력에 'A'를 입력한경우
		try {
			int i = Integer.parseInt("12a3");
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
	}

}
