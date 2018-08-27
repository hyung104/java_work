package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		// Random 객체 생성해서 참조값 변수에 담기 - 무작위의 수 추출
		Random ran=new Random();
		int result=ran.nextInt();
		System.out.println("result :"+result);
	}
}
