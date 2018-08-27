package test.main;
/*
 * [ 기본 자료형 ]
 * 1. 논리형 (boolean)
 * - 가질수 있는 값의 범위 :  true, false 두가지 값을 가질수있다.
 * - 만드는 방법 : true, false를 직접 써주거나 비교연산 혹은 논리연산의 결과로 얻어낼수있다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main method start");
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		if(isRun) {
			System.out.println("달려요");
		}
		//비교연산의 결과로 얻어진 boolean type 데이터를 변수에 담기
		boolean isGreater=10>1;
		if (isGreater) {
			System.out.println("커요");
		}		
		//논리연산의 결과로 얻어진 boolean type 데이터 변수에 담기
		boolean result=true||false;
		
		
		
		System.out.println("main method end");
	}
}
