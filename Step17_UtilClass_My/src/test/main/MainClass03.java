package test.main;

import java.util.ArrayList;

import test.mypac.Person;

public class MainClass03 {
	public static void main(String[] args) {
		//String type을 담을 수 잇는 ArryList 객체를 생성해서 문자열을 3개 저장해 보세요
		ArrayList<String> msgs=new ArrayList<>();
		msgs.add("하나");
		msgs.add("두울");
		msgs.add(new String("세엣"));
		
		// Person type을 담을 수 있는 ArrayList 객체를 생성해서 
		ArrayList<Person> list=new ArrayList<>();
		// Person 객체를 3개 저정해 보세요.
		list.add(new Person());
		list.add(new Person());
		Person p=new Person();
		list.add(p);
	}
}
