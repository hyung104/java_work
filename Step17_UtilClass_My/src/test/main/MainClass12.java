package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * [ HashSet ]
 * 
 * - 순서가 없다
 * - 키값도 없다
 * - 중복을 허용하지 않는다.
 * - 집합의 개념으로 데이터를 관리하고 싶을때 사용한다.
 * - Set 인터페이스를 구현했다.
 */
public class MainClass12 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 HashSet 객체 
		//HashSet<Integer> set1=new HashSet<>();
		Set<Integer> set1=new HashSet<>();		//Set interface 구현했으므로 
		
		set1.add(10);
		set1.add(20);
		set1.add(30);	// return true;
		set1.add(30);	// 동일데이터 있으면 추가 실패 return false;
		set1.add(20);	// 중복값은 저장되지 않음. return false;
		set1.add(40);
		set1.add(50);
		
		/*
		 * HashSet 객체에 이쓴 모든 숫자를 콘솔에 출력해 보세요.
		 */
		System.out.println(set1.toString());  //데이터를 출력해줌(전부)

		// Iterator(반복자) 객체
		Iterator<Integer> iter = set1.iterator(); 
		//http://whdvy777.tistory.com/entry/HashSet-%EA%B8%B0%EB%B3%B8-%EC%8B%A4%EC%8A%B5
		//데이터를 하나씩 출력하기 위해서 Iterator를 사용(get이 없음)
		//hasNext = 다음값을 확인함. 다음값이 없을때까지 계속 루프를 돌림.
		while(iter.hasNext()){	// 다음 데이터가 있는지 확인해서 있다면 다음 데이터 불러와서 출력하기
			System.out.println(iter.next());
		}
		
		System.out.println("--확장 for 문");
		for(Integer tmp:set1) {
			System.out.println(tmp);
		}
		/* 말도 안되는 로직임.  -> java.util.HashMap$KeyIterator@7852e922 이런식으로 출력됨.
		for(int i=0; i<set1.size(); i++) {
			Iterator<Integer> tmp = set1.iterator(); 
			System.out.println(tmp);
		}*/		
	}
}
	