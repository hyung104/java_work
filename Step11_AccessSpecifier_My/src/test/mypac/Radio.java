package test.mypac;
/*
 * [ 접근 지정자 (Access Specifier) ]
 * 
 * 종류 : public, protected, default(작성안한경우), private
 * 
 * public => 어디서든 접근 가능
 * protected => 같은 package + 상속관계의 자식클래스에서 접근가능
 * default => 같은 package 내에서만 접근가능. - 다른곳에서 import 안됨.
 * private => 같은 클래스 내에서만 접근가능. - 외부 공개 x. 내부에서만 사용하는 경우.
 * 
 * 접근 지정자를 작성할 수 있는 위치
 * 1. 클래스 ( public | default 두개만 가능 ) - 다른 class에서  public 만 import 할 수 있음
 * 2. 생성자 	4개가능 - public 빼고는  같은 패키지에서만 생성할 수 있음
 * 3. 필드     4개가능 
 * 4. 메소드   4개가능 
 * 
 */
//class Radio {  // <= 다른 class에서 import못함.
public class Radio {
	// 필드
	public int volumn;
	
	// 생성자
	public Radio() {
		
	}
	
	// 메소드
	public void channelUp() {
		
	}
}
