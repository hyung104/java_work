package test.main;
/*
 * [연산자]
 * 
 * 6. 3항 연산자
 * 
 * -형식
 * boolean type data? 값1 : 값2
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=true;
		
		String result=isWait?"기다려":"기다리지마";
		
		// 3 항 연산자를 if~else문으로 대체하면
		
		String result2=null;
		if(isWait) {
			result2="기다려";
		}else {
			result2="기다리지마";
		}
	}
}
