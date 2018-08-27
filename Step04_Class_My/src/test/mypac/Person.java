package test.mypac;

public class Person {
	public String name="";
	
	public void SetName(String nm) {
		System.out.println("이름설정하기");
		name=nm;
	}
	public String getName() {
		System.out.println("현재이름가져오기");
		return name;
	}
}
