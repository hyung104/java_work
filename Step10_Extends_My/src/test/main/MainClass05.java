package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//SmartPhone type 객체를 생성해서 Object type 변수에 담기
		Object p1=new SmartPhone();
		
		//Phone p2=new p1;		부모 type은 자식 type에 못들어감  <= casting(형변환) 필요함.
		//Phone 으로 casting 해서 대입  - SmartPhone()으로 생성했으므로 가능함.
		Phone p2=(Phone)p1;
		HandPhone p3=(HandPhone)p1;
	}
}
