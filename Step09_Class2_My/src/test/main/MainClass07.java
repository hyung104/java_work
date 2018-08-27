package test.main;

import test.mypac.Member;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main method start");
		Member m1=new Member();
		m1.num=2;
		m1.name="해골";
		m1.addr="행신동";
		
		Member m2=new Member(1, "김구라", "노량진");

//		int num=3;
//		String name="김구라";
//		String addr="노량진";		
//		Member m3=new Member(num,name,addr);
	}
}
