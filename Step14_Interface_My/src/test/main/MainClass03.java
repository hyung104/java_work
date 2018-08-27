package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요1");		
			}

			@Override
			public void down() {
				System.out.println("볼륨을 내려요1");
			}
		};
		Object r2=new Remocon() {			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요2");		
			}

			@Override
			public void down() {
				System.out.println("볼륨을 내려요2");
			}
		};
		
		useRemocon(r1);
		useRemocon((Remocon)r2);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
