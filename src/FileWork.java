import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWork {
	public static void main(String[] args) {
			/*
		    1. 파일 생성 함수
		    		이름 나이 주소
		    2. 데이터 저장 함수
		    3. 데이터 읽기
		 */
		File myFile = new File("d:\\tmp\\newfile2.txt"); // 파일 포인터 생성
		String info[][] = {    // 파일에 저장할 내용
			{"홍길이", "5살", "조선"}, 
			{"춘길이", "6살", "고구려"}, 
			{"섬길이", "7살", "백제"}	
		};
		fileMake(myFile); // 파일 생성 함수 호출
		
		fileSave(myFile, info); // 파일 저장 함수 호출
		
		fileRead(myFile); // 파일 읽기 함수 호출
	}

	// 파일 생성
	static void fileMake(File myFile) {
		try {
			if(myFile.createNewFile()) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 파일 저장
	static void fileSave(File myFile, String[][] info) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
			
			for (int i = 0; i < info.length; i++) {
				for (int j = 0; j < info[i].length; j++) {
					pw.print(info[i][j] + " ");
				}
				pw.print("\n");
			}
			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// 파일 읽기
	static void fileRead(File myFile) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(myFile));
			String str;
			
			while((str = br.readLine()) != null) {
				System.out.print(str + " ");
			}
	
			
			br.close();
			
		}catch (FileNotFoundException e) { // 해당 파일이 없을 경우
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
