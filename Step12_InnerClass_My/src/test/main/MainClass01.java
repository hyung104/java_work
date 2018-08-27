package test.main;

//static 예약어는 class당 1개만 만들어짐. 생성과 상관없이 static 영역에 class와 함께 올라감.
public class MainClass01 {
	// 필드 - 객체 생성시에 heap 영역에 만들어짐. 생성시마다 새로 생김.
	public int num=10;
	// static 필드 - 객체 생성 없이 MainClass01과 함께 static 영역에 만들어짐. (1개만-single)
	public static int num2=20;
	
	// static main 메소드 - run 버튼 누르면 자바가상머신(자바해석기)이 클래스명.main() 호출함.
	// 접근지정자 : public ,  static , return 없음, 메소드명 main , String[] type의 인자 1개 전달
	public static void main(String[] args) {
		//static 메소드 안에서는 static 자원들만 참조가능하며 this는 쓸수 없음. 
		//int result=this.num;
		
		// 참조가능
		int result2=MainClass01.num2;
		
		//내부 클래스로 객체 생성가능
		//static method 안에서 new 할 내부 class는 static으로 정의되어야함.
		Gura g=new Gura();		
	}
	
	// 내부클래스 정의하기
	public static class Gura{
		
	}
}
