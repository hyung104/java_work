package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("mian method start");
		
		// Util 클래스의 sing() 메소드를 호출하려면?
		Util.sing();
		
		// Util 클래스의 dance() 메소드를 호출하려면?
		Util.dance();
		
		// MainClass02 클래스의 sleep()메소드를 호출 하려면?
		MainClass02.sleep();		// or   sleep();		
	}	

	public static void sleep() {
		System.out.println("잠을 자요~");
	}
}
