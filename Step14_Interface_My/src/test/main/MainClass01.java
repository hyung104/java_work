package test.main;

import test.mypac.OurClass;

public class MainClass01 {
	public static void main(String[] args) {
		//OurClass에 있는 static final 상수 참조
		String name=OurClass.CAPTAIN;
		int roomNumber=OurClass.ROOM_NUMBER;
		
		//2조 조장의 이름을 콘솔에 출력하세요.
		System.out.println(OurClass.CAPTAIN_TWO);
	}
}
