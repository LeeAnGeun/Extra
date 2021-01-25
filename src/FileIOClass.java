import java.io.File;
import java.io.IOException;

public class FileIOClass {

	public static void main(String[] args) {
		/*
	    file : 저장 매체 == 기능
	    	   Database(결국 file로 되어있다.)
	    
	    *.txt -> 2진수  dll, lib로 나눠짐
	    	          DLL(동적) -> Dnamic Link Library
	    	          LIB(정적) -> Library
	 */
	
	File file = new File("c:\\");
	
	// 파일(+폴더) 조사
	/*
	String filelist[] = file.list();
	
	for (int i = 0; i < filelist.length; i++) {
		System.out.println(filelist[i]);
	}
	*/
	
	// 파일명과 폴더명을 조사
	/*
	File filelist[] = file.listFiles();
	
	for (int i = 0; i < filelist.length; i++) {
		if(filelist[i].isFile()) {  // file 일때 true
			System.out.println("[파일]" + filelist[i].getName());
		}
		else if(filelist[i].isDirectory()) {  // 폴더 일때 true
			System.out.println("[폴더]" + filelist[i].getName());
		}
		else { // 둘다 아닐때
			System.out.println("[?]" + filelist[i].getName());
		}
	}
	*/
	
	// 파일 포인터 생성
	File newFile = new File("d:\\tmp\\newfile.txt");
	
	// 파일생성
	try {
		if(newFile.createNewFile()) {
			System.out.println("파일 생성 성공");
		}else {
			System.out.println("파일 생성 실패");
	}
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	// 폴더생성
	File newDir = new File("d:\\tmp1\\sub"); // 폴더 2개 생성
	
	// mkdir - 1개 생성, mkdirs - 2개 생성
	if(newDir.mkdirs()) {
		System.out.println("폴더 생성 성공");
	}
	else {
		System.out.println("폴더 생성 실패"); // 같은 이름에 디렉토리가 있을시 실패한다.
	}
	
	// file 존재 여부
	if(newFile.exists()) {
		System.out.println("newFile.txt가 존재합니다");
	}else {
		System.out.println("newFile.txt가 존재하지 않습니다");
	}
	
	// 읽기전용
	//newFile.setReadOnly();
	
	// 쓰기가능 여부 설정
	if(newFile.canWrite()) {
		System.out.println("이 파일은 쓰기가 가능합니다.");
	}else {
		System.out.println("이 파일은 쓰기를 할 수 없습니다.");
	}
	
	// 삭제 -> !!!!!실무에서 정말 큰 주위가 필요하다!!!!!**** !!!!!!!그와 같은 점으로 업데이트 또한 큰 주위가 필요한 작업이다!!!!!!
	//newFile.delete();
	
}
	}

}
