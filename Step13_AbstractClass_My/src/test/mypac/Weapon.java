package test.mypac;

public abstract class Weapon {
	// 일반 메소드
	public void prepare() {
		System.out.println("무기작동을 준비합니다.");
	}
	// 메소드의 형태는 갖춰져있지만 동작내용이(수행내용) 없음.
	// 접근지정자, 리턴, 메소드명, 인자x - 정해져있음.
	
	// 추상 메소드
	public abstract void attack();
}
