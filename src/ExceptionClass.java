
public class ExceptionClass {

	public static void main(String[] args) {
		/*
		   Exception : 예외
		   
		    baseball - > 1 ~ 10 
		    
		    예)
		    number -> format A B C
		    			A B C      -> 65 66 67
			array -> index 범위초과[5] -> [0] ~ [4] -> [5]로 범위초과에 경우
			class -> 없는 경우
			file 경로가 틀린경우
			
			형식:
			
				try{
					// 예외가 밸생될 가능성이 있는 코드
				 
				}catch(예외클래스1 e){    // e는 변수
					예외클래스1 메시지 출력
				}catch(예외클래스2 e){
					예외클래스2 메시지 출력
				}...  -> 예외클래스는 계속 붙일 수 있다.
				...
				}finally{   // 뒷처리 코드
					무조건 실행!
					undo/rollback(복구)
				}
				
				static void method() throws 예외클래스{
				}
				
		 */
		
		int array[] = { 1, 2, 3};
		
		System.out.println("start");
		
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}
			
			System.out.println("proc"); // exception이 발생한 이후 코드는 처리가 안된다.
			
		}catch(ArrayIndexOutOfBoundsException e) {
		//	System.out.println("배열범위 초과");
			e.printStackTrace();
		//	System.out.println(e.getMessage());  // exception 위치인 3이 출력된다
			
		//	return ; // return으로 탈출을 해도 finally은 실행된다.
			
		}catch (Exception e) { // Exception은 가장 상위코드
			e.printStackTrace();
		}finally { // 무조건 실행
			System.out.println("finally 부분");
			
		}
		
		System.out.println("end");
		
	//	method(); // 에러가 안나온다
	
		// 클래스 밖에서 예외처리를 한 경우
		
		try {
			callClass(); // 에러가 발생한다.
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
		}                                           
		
		// 클래스 안에서 예외처리를 한 경우
		 callClass1();
	}

	static void method() throws IndexOutOfBoundsException {
		int num[] = {11,22,33};
		
	
			for (int i = 0; i < 4; i++) {
				System.out.println(num[i]);
			}
	}
	
	
	static void callClass() throws ClassNotFoundException{  // 외부에서 예외처리를 해주어야 하는 Exception이다.
		Class.forName("myclass"); // myclass이름의  class를 찾는 코드
		System.out.println("callClass end");
	}
	
	
	static void callClass1(){  // 외부에서 예외처리를 해주어야 하는 Exception이다.
		try {
			Class.forName("myclass"); // myclass이름의  class를 찾는 코드
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾울 수 없습니다");
		}
		System.out.println("callClass end");
	}
	}

}
