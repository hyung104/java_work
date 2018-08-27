package test.main;

import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * AttackUnit 클래스를 이용해서 객체를 생성하고
		 * 참조값(id) 값에 . 찍어서 attack() 메소드 호출하기
		 */
		// head영역에 AttackUnit type의 객체가 만들어 지며, 참조값이 return됨.		
		//new AttackUnit().attack();		한번사용하고 버림.
		// AttackUnit.attack()	<- static 메소드 였으면 이렇게 사용
		
		AttackUnit unit=new AttackUnit();	// 객체 실체화. 생성 해서 저장소와 메소드 사용 가능해짐
		unit.attack();		
		unit.attack();		
		unit.attack();
		
		// AttackUint 클래스로 새로운 객체를 생성해서
		// attack() 메소드를 3번 호출해 보세요.
		AttackUnit unit2=new AttackUnit();
		unit2.attack();
		unit2.attack();
		unit2.attack();		
	}
}
