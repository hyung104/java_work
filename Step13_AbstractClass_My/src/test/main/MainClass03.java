package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		// 단순 override만 하는 경우에는 class를 extends해서 만들지 않고
		Weapon w1=new Weapon(){	
			@Override
			public void attack() {
				System.out.println("다른방법으로 공격~");
			}
		};
		MainClass03.useWeapon(w1);
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("다른방법으로 공격2~");				
			}			
		});
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
