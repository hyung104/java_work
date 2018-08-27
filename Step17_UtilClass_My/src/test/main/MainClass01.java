package test.main;

import java.util.ArrayList;
/*
 * [ ArrayList ]
 * 
 * - 가변 배열이다.
 * - 기본 data type 은 저장할 수 없고, 참조값만 저장할 수 있다.
 * - Generic  클래스를 지정하지 앟으면 object 가 Generic 클래스로 지정된다.
 * - 데이터 저장 : .add(참조값) 마지막에 추가	// .add(인덱스, 참조값)  지정 인덱스에 추가
 * - 데이터 참조 : .get(인덱스)
 * - 사이즈 참조 : .size()
 * - 데이터 삭제 : .remove(인덱스)
 * - 데이터 모두 삭제 : .clear()
 * - Serializable, List 인터페이스 등을 구현했다.  : 
 * 		Serializable - 기능x, 비어있는 인터페이스
 */
public class MainClass01 {
	public static void main(String[] args) {
		// Object Type을 저장할 수 있는 가변 배열
		ArrayList list1=new ArrayList<>();		// <GenericClass> new 할때는 생략가능. 참조값 받을 때 지정.
		// Object Type을 저장할 수 있는 가변 배열
		ArrayList<Object> list2=new ArrayList();
		//정수를 저장할 수 있는 가변 배열. 참조데이터.
		ArrayList<Integer> list3=new ArrayList<>();
		//실수를 저장할 수 있는 가변 배열
		ArrayList<Double> list4=new ArrayList<>();
		//문자열을 저장할 수 있는 가변 배열
		ArrayList<String> list5=new ArrayList<>();

	}
}
