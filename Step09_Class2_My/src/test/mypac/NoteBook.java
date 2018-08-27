package test.mypac;

public class NoteBook {
	//필드
	public Cpu cpu;
	public Memory memory;
	
	// default 생성자 는  생성자를 하나라도 만들면 사라짐. 필요시 기술해줘야함.
	//public NoteBook() {
	//	
	//}
	
	//생성자	
	public NoteBook(Cpu cpu, Memory memory) {
		this.cpu=cpu;
		this.memory=memory;
	}
}
