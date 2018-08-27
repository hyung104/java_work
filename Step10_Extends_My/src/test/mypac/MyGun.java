package test.mypac;

public class MyGun extends Gun {
	/*
	 * 자식 생성자에서 부모 생성자에 필요한 값을 전달받아서
	 * 부모생성자에 넘겨 줘야 한다.
	 */
	public MyGun(Bullet bullet) {
		super(bullet);		// super()는 부모 생성자를 의미한다. 꼭, 해야 오류 안남
	}
	
	// 부모의 메소드 재정의 (오버라이드)
	@Override
	public void fire() {
		super.fire();		// 부모의 fire() 메소드 호출
		System.out.println("내 맘대로 빵빵빵");
	}
}
