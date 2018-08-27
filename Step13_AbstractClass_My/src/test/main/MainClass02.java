package test.main;

import test.mypac.OurWeapon;		
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w=new OurWeapon(); // OurWeapon - 타입으로 쓰여지지 않고, 구현 클래스로만 쓰임. override 용도.
		useWeapon(w);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}
