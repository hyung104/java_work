package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// String type을 담을 수 있는 방 5개 짜리 배열객체 생성해서
		// 참조값을 변수에 담기
		// 5개의 방에는 null 이 들어 있다. - 아직 각방에 참조값(id값)은 없음
		String[] names=new String[5];
		
		//0번방에 String type 대입 - id값 생김
		names[0]="김구라";
		//1번방에 String type 대입 - id값 생김
		names[1]="해골";
		//2번방에 String type 대입 - id값 생김
		names[2]="원숭이";
	}
}
