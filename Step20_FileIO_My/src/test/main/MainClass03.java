package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 텍스트 파일에 문자열 출력하는 예제
 */
public class MainClass03 {
	public static void main(String[] args) {
		File file1=new File("c:/myFolder/gura.txt");
		
		try {
			if(!file1.exists()) {			
				file1.createNewFile();
			}
			// File 객체에는 write 기능 없어서 FileWriter 객체를 이용함.
			// File 객체를 생성자의 인자로 전달해서 FileWriter 객체 생성하기
			FileWriter fw=new FileWriter(file1);
			fw.write("안녕!\r\n");		// 버퍼에 기록  \r\n : 개행
			fw.write("나야나~~~~\r\n");
			fw.write("놀자 놀자~\r\n");
			fw.flush();				// 방출
			fw.close();				// 모두 기록했으면 닫아줘야 한다.. auto flush 기능 있음.
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일에 문자열을 기록 했습니다.");
	}
}