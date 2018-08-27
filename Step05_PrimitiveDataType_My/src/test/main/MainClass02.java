package test.main;

/*
 *  2. 정수형
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2147483648 ~ 2147483647   -자주사용함
 *  - long 변수명; // -9223372036854775808 ~ 9223372036854775807
 *  
 *  표현 가능한 정수의 범위가 다르다.
 *  
 *  byte < short < int < long
 */
public class MainClass02 {
	public static void main(String[] args) {
		//정수형 변수 선언과 동시에 값 대입하기
		byte iByte=10;
		short iShort=10;
		int iInt=10;
		long iLong=10000000000l;		// 000소문자 엘
				
		// up casting -  작은 type 수를 큰 type수에 넣기 
		iInt=iByte;
		
		// down casting -  명시적으로 해줘야함.
		iInt=(int)iLong;	//(int)는 casting 연산자  - 형변환연산자
		
		// 원래 iLong에 있던값과 다르게 나올 가능성이 있다.
		System.out.println("iInt :"+iInt);	//결과 10000000000l -> 1410065408 . int 범위를 넘어가는 수는 제대로 형변환 안됨.
	}
}
