package test.mypac;

public class Acorn {
	// 기능 정의	
	public String branch;
	
	public void makeDeveloper() {
		// 객체(class) 안에서 자기 자신을 가리키는 예약어 - this
		System.out.println(this.branch + "에서 개발자 양성");
	}
}
