package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("main method start");
		//참조 데이터 type선언과 동시에 값 대입하기
		String myName="김구라";
		
		//참조 데이터 type 선언 후 나중에 값 대입하기
		String yourName;
		yourName="원숭이";
		
		//참조 데이터 type이 드어갈 수 있는 빈 공간 만들기
		String ourName=null;	// null - 빈상태를 나타내는 값 - 공간은 있지만 키값(id)이 없는 빈상태
		
		//빈 공간에 참조값 대입하기
		ourName="에이콘";
	}
}
