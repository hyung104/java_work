package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		int num1=10;
		double num2=10.1;
		char ch='A';
		boolean isWait=false;
		String myName="김구라";
		
		// a 메소드 호출
		MainClass04.a(999);
		MainClass04.a(num1);
		// b 메소드 호출
		MainClass04.b(true);
		MainClass04.b(isWait);
		// c 메소드 호출
		c("홍길동");
		c(myName);
		}
	
	public static void a(int num) {
		
	}
	public static void b(boolean isWait) {
		
	}
	public static void c(String msg) {
		
	}	
}
