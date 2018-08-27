package test.mypac;

// heap 영역에 객체 만드는 연습. 객체 - 저장소와 기능으로 이뤄짐
// non static 이므로 설계도임. 바로 쓸수 없음.  
// static 는 시계, non static 은 시계의 설계도 개념
// 실체화 -> new 클래스명();   AttackUnit myAttack = new AttackUnit();
public class AttackUnit {
	// non static 멤버 필드  - static 영역에 안 올라가고 객체의 설계도 역할.객체를 생성할 때 heap영역에 올라감.
	// 설계도는 실체화 해야 heap에 올라감.
	public int energy=100;
	
	// non static 멤버 메소드
	public void attack() {
		System.out.println("공격해요");
	}		
	//방어하는 메소드
	public void defence() {
		System.out.println("방어해요");
	}
	//움직이는 기능
	public void move() {
		System.out.println("움직여요");
	}
}