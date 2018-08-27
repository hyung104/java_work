package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		
		// 객체는 1개 생성. 3개가 더 참조함. 
		// SmartPhone 객체를 생성해서 참조값을 SmartPhone type 변수에 담기
		SmartPhone sPhone=new SmartPhone();
		
		// 이미 생성된 객체의 참조값은 부모 type 변수에 다시 담을 수 있다.
		Object p1=sPhone;		// 참조값 공유. 기능은 각각에 맞게 사용
		Phone  p2=sPhone;
		HandPhone p3=sPhone;
		
	}
}
