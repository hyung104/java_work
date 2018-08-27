package test.mypac;

public class OrangeBox {
	// Orange 객체를 저장할 멤버필드
	private Orange item;
	// Orange 객체를 필드에 저장하는 메소드
	public void push(Orange item) {
		this.item=item;
	}
	//필드에 저장된 Orange 객체를 리턴해 주는 메소드
	public Orange pull() {
		return item;
	}
}
