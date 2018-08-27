package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

/*
 * [ 다형성(Polymorphism) ]
 * 
 * - java에서 객체의 참조값은 다형성을 가질수 있다.
 * - 다형성이란 여러가지 type이 될 수 있다는 의미이다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		// SmartPhone 객체의 참조값을 부모 type 변수에 대입하기
		// p1에 . 찍으면 Object 에 정의된 기능만 사용가능
		Object p1=new SmartPhone();
		// p2에 . 찍으면 Object, Phone 에 정의된 기능만 사용가능
		Phone p2=new SmartPhone();
		// p3에 . 찍으면 Object, Phone, HandPhone 에 정의된 기능만 사용가능
		HandPhone p3=new SmartPhone();
		// SmartPhone 객체의 참조값을 SmartPhone type 변수에 대입하기
		// p4에 . 찍으면 Object, Phone, HandPhone, SmartPhone에 정의된 기능 사용가능
		SmartPhone p4=new SmartPhone();
				
		p3.takePicture();		// 30만 화소가 아닌 1000만 화소로 수행됨. 변수에 있는 메소드는 SmartPhone의 메소드가 실행됨. 없는 메소드는 실행 안됨.
		p4.takePicture();

	}
}
