package test.main;

public class MainClass01 {
	
	// main 메소드
	public static void main(String[] args) {
		System.out.println("main method start");
		
		/*
		 * static 예약어가 붙은 메소드를 호출하는 방법. - static이 붙은거는 클래스명. 으로 사용함. 
		 * 
		 * 클래스명.메소드명();		- static이 붙어서 가능함.
		 * 
		 * ex) 
		 * MainClass01.a();
		 */
		MainClass01.a();
		
		/*
		 * 동일한 클래스안에 존재하는 static 메소드를 호출할때는 
		 * 클래스명. 은 생략 가능
		 */
		b();		
		
		System.out.println("main method end");
	}
	
	// a 메소드
	public static void a() {
		System.out.println("a method start");
		System.out.println("a method return");
	}
	
	// b 메소드
	public static void b() {
		System.out.println("b method start");
		System.out.println("b method return");		
	}
	
	
}
