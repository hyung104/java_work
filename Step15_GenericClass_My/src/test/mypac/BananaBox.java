package test.mypac;

public class BananaBox {
	// Banana 객체를 저장할 멤버필드
	private Banana item;
	// Banana 객체를 필드에 저장하는 메소드
	public void push(Banana item) {
		this.item=item;
	}
	//필드에 저장된 Banana 객체를 리턴해 주는 메소드
	public Banana pull() {
		return item;
	}
}
