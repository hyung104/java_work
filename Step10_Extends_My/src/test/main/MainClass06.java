package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 HandPhone type 의 변수에 대입
		HandPhone hPhone=new HandPhone();
		
		// 실행시에 Exception 발생!
		SmartPhone p1=(SmartPhone)hPhone;	// 문법 오류는 없지만, runtime 오류남.
		p1.doInternet();
	}
}
