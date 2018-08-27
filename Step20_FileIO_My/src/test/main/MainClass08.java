package test.main;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		//키보드로 부터 문자열을 입력받을 객체
		Scanner scan=new Scanner(System.in);
		// 입력한 모든 문자열의 내용을 가지고 있는 String 객체 
		String msg="";
		while(true) {
			System.out.print("한줄입력(종료:q):");
			//문자열 한줄 입력받아서
			String str=scan.nextLine();			
			if(str.equals("q")) break;	// q를 입력하면 반복문 탈출
			//연결 연산자로 이어 붙인다.  - 가비지 데이터가 많이 생김. 연결할때마다 객체가 새로 생성됨	 -> 해결법 StringBuilder		
			msg=msg+str;
		}
		//입력된 문자열 출력하기
		System.out.println("msg:"+msg);
	}
}
