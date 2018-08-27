package test.mypac;

public class FruitBox<T> {		// <a>도 상관없음. Type이란 의미의 T
	private T item;
	
	public void push(T item) {
		this.item=item;
	}
	public T pull() {
		return item;
	}
}
