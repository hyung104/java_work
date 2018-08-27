package test.main;

import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
		Random ran=new Random();
		// 0 이상 10미만의 랜덤한 정수 얻기
		int result=ran.nextInt(10);
		System.out.println("result :"+result);		
	}
}
