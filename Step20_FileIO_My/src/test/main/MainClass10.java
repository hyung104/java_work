package test.main;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainClass10 {
	public static void main(String[] args) {
		//필요한 지역변수 미리 만들기
		FileReader fr=null;
		BufferedReader br=null;

		try {
			// 미리 만든 지역변수 참조값 대입
			fr=new FileReader("c:/myFolder/gura.txt");
			br=new BufferedReader(fr);
			// 문자열을 누적시킬 StringBuilder객체
			StringBuilder builder=new StringBuilder();
			while(true) {
				String line=br.readLine();
				if(line==null)	break;
				builder.append(line);
				builder.append("\r\n");	//개행기호
			}
			//누적된 내용 출력하기
			System.out.println(builder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null)fr.close();
				if(br!=null)br.close();
			} catch (Exception e) { }
		}
	}
}
