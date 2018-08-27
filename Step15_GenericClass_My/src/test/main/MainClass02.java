package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass02 {
	public static void main(String[] args) {
		//Apple 객체를 담을 수 있는 FruitBox 객체 생성
		FruitBox<Apple> aBox=new FruitBox<Apple>();
		aBox.push(new Apple());
		
		//Banana 객체를 담을 수 있는 FruitBox 객체 생성
		FruitBox<Banana> bBox=new FruitBox<Banana>();
		bBox.push(new Banana());
		
		//객체를 new 할때 Generic type은 생략 가능
		FruitBox<Orange> oBox=new FruitBox<>();
		oBox.push(new Orange());
	}
}
