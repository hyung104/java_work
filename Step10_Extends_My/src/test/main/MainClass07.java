package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		Phone p1=new Phone();
		HandPhone p2=new HandPhone();
		SmartPhone p3=new SmartPhone();
		
		// 메소드 호출하면서 변수에 담긴 참조값 전달
		MainClass07.usePhone(p1);
		MainClass07.usePhone(p2);		// 자식이니까 가능
		MainClass07.usePhone(p3);		// 자식이니까 가능
		
		// 메소드 호출하면서 객체를 생성해서 참조값 전달
		MainClass07.usePhone(new Phone());
		MainClass07.usePhone(new HandPhone());
		MainClass07.usePhone(new SmartPhone());
		
		// 빈값 전달. 문법 성립. 실해시 예외처리 필요.
		MainClass07.usePhone(null);
	}
	
	// 참조값이 넘어가는 것임.
	public static void usePhone(Phone p) {
		if(p!=null) {		// usePhone(null);호출해도 오류 안나게 예외처리 함.
			p.call();
		}
	}
}
