package test.main;

import test.mypac.AttackUnit;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. AttackUnit type의  참조값을 담을 변수 만들기
		AttackUnit unit=null;	// AttackUnit unit; 해도 오류 안나지만 변수가 만들어 지진 않음. =null해야 heap에 생성됨
		// 2. 위에서 만든 변수에 AttackUnit 객체를 생성해서 참조값 담기
		unit=new AttackUnit();
		// 3. move()메소드 호출하기
		unit.move();
		// 4. energy 라는 필드에 저장된 값을 a라는 이름의 비역벼니수에 담아보세요.
		int a=unit.energy;
		//5. energy 라는 필드에 50을 대입해 보세요.
		unit.energy=50;
	}
}
