package test.main;

import test.mypac.Navi;
import test.mypac.Navi2;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 1. Navi 클래스를 상속받은 클래스를 정의해서
		 * 2. 그 클래스로 생성한 객체의 참조값을 얻어내서
		 * 3. 아래의 useNavi 메소드를 호출해 보세요. 
		 */
		Navi2 navi=new Navi2();
		MainClass08.useNavi(navi);
	}
	public static void useNavi(Navi navi) {
		navi.findWay();		
	}
}
