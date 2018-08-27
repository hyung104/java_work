package test.main;

import test.mypac.SubWorker;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 스레드가 시작됨");
		
		//새로운 작업단위 시작 시키기
		new SubWorker().start();
		new SubWorker().start();
		new SubWorker().start();
		//.start()대신 run()을 호출하면 실행되는 스레드가 종료후 그다음 run()이 실행됨.
		System.out.println("main 스레드가 종료 됩니다.");
	}
}
