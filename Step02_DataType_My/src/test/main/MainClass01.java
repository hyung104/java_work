package test.main;

/*
 * [Data type]
 * 
 * 1. String type
 * 
 * - 문자열을 나타날때 사용하는 type 이다.
 */
public class MainClass01 {
	// run 했을때 실행순서가 시작되는 메소드 - main 메소드 - 자동완성기능 main , ctrl + space
	public static void main(String[] args) {
		System.out.println("main 메소드 시작");		// sysout , ctrl + space
		
		// String type a 라는 변수를 만들어서 문자열 대입하기
		String a="김구라";
		
		System.out.println("a:"+a);
		System.out.println("main 메소드 끝");
	}
}
