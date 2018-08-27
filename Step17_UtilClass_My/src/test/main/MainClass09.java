package test.main;

import java.util.HashMap;
import java.util.Map;
/*
 * [ HashMap ]
 * 
 * - key : value 형태로 데이터를 관리하고자 할때 사용한다.
 * - Generic 클래스는 2개를 지정해야 한다.
 * 	 key Generic , value Generic
 * - 데이터 저장 : .put(key, vlaue)
 * - 데이터 참조 : .get(key)
 * - key 존재여부 확인 : .containsKey(key)
 * - 데이터 모두 삭제 : .clear()
 * - 특정 데이터 삭제 : .remove(key)
 * - Map 인터페이스를 구현했다.
 */
public class MainClass09 {
	public static void main(String[] args) {
		//회원 한명의 정보를 HashMap 객체에 담기    
		// HashMap<K,V> : Key (String), Value (Object - 뭐든 다 저장가능. get할때 casting 해서 사용 )
		//HashMap<String, Object> map=new HashMap<>();
		Map<String, Object> map=new HashMap<>();		// 인터페이스 타입으로 받음.
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		map.put("isMan", true);
		
		//HashMap 객체에 있는 데이터 참조
		int num=(int)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		boolean isMan=(boolean)map.get("isMan");
		
		//삭제
		map.remove("addr");
		
		// key 존재 여부
		boolean result=map.containsKey("num");
		
	}
}
