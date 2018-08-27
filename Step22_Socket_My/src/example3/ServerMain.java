package example3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기.
		ServerSocket serverSocket=null;
		
		try {
			serverSocket=new ServerSocket(5000);		// port			
			while(true) {
				//클라이언트의 접속을 기다린다.
				Socket socket=serverSocket.accept();
				System.out.println("클라이언트가 접속함!");				
				// 생성자의 인자로 Socket 객체의 참조값 전달해서
				// 스래드 객체를 생성후
				Thread t=new ServerThread(socket);
				// 스래드를 시작시킨다.
				t.start();			// 새로운 run()호출. 
			}
		} catch ( Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}	
}
