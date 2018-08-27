package test.main;

import test.mypac.Acorn;

public class MainClass02 {
	// field(속성, 저장소) 정의하기
	public String branch;
	
	public static void main(String[] args) {
		// Acorn클래스를 이용해서 객체를 생성한 후 참조값을 변수에 담기
		Acorn a=new Acorn();
		// branch라는 필드에 값 대입하기
		a.branch="종로지점";
		// 메소드 호출하기
		a.makeDeveloper();

		Acorn b=new Acorn();
		b.branch="강남지점";
		b.makeDeveloper();
}
}
