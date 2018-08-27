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
public class MainClass03_my {
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

		// 아래 6개의 결과가 모드 같음. 1000만 화소... <- new SmartPhone()을 해서 SmartPhone의 내용이 들어있음
		// . 찍고는 메소드를 바로 실행할 수 없지만, 형변환 해서는 사용할 수 있음.
		//p1.takePicture();		오류		
		//p2.takePicture();		오류
		p3.takePicture();		
		p4.takePicture();
		
		picture((HandPhone)p1);
		picture((HandPhone)p2);
		picture(p3);
		picture(p4);

	}
	public static void picture(HandPhone p) {
		p.takePicture();
	}
}
