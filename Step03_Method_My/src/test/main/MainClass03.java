package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main method start");		
		MainClass03.printMsg();
		MainClass03.printMsg2("메세지");
		printMsg2("메세지222");
	}
	
	public static void printMsg() {
		System.out.println("메세지를 출력합니다.");
	}
	
	// String msg - call하는 시점에 지역변수로 만들어짐.
	public static void printMsg2(String msg) {
		System.out.println("msg :"+msg);
	}

}
