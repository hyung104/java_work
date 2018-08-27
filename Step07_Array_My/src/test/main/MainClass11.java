package test.main;

public interface MainClass11 {
	public static void main(String[] args) {
		//1. String type을 담을 수 있는 방5개짜리 배열객체를 생성
		String[] msgs=new String[5];
		//2. 배열에 5개의 방에 각각 다른 문자열 저장하기
		msgs[0]="aa";
		msgs[1]="bb";
		msgs[2]="cc";
		msgs[3]="dd";
		msgs[4]="ee";
		//3. 반복문 for 를 이용해서 5개의 방에 있는 문자열을 순서대로 콘솔창에 출력하기
		for(int i=0; i<msgs.length; i++) {	// 14, 15라인 줄인표현 있음.
			String tmp=msgs[i];
			System.out.println("msgs["+i+"] :"+ tmp);
		}
	}
}
