package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// Car 객체를 저장할 수 있는 ArrayList 객체 생성해서
		//ArrayList<Car> cars=new ArrayList<>();
		List<Car> cars=new ArrayList<>();		// List는 인터페이스 임. 자주쓰는 메소드 다 정의되어있음.
		//Car 객체를 3개 담아 보세요.
		cars.add(new Car());
		cars.add(new Car());
		cars.add(new Car());
		
		//반복문 돌면서 배열에 있는 Car 객체를 하나씩 참조해서 .drive() 메소드 호출하기
		for (int i=0; i<cars.size(); i++) {
			Car tmp=cars.get(i);
			tmp.drive();
		}
		System.out.println("-- 확장 for 문--");
		for(Car tmp:cars) {
			tmp.drive();
		}
	}
}
