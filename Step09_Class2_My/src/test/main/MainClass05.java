package test.main;

import test.mypac.NoteBook;
import test.mypac.Cpu;
import test.mypac.Memory;

public class MainClass05 {
	public static void main(String[] args) {
			
		//NoteBook 객체 생성
		NoteBook n1=new NoteBook(new Cpu(), new Memory());
		
		// 생성자의 인자로 전달할 객체를 미리 생성하고
		Memory m=new Memory();
		Cpu c=new Cpu();
		
		NoteBook n2=new NoteBook(c, m);
	}
}
