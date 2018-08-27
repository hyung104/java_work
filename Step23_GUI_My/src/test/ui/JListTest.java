package test.ui;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListTest extends JFrame{
	
	//생성자
	public JListTest() {
		
		//JList 에 연결할 model 객체 
		DefaultListModel<String> model=new DefaultListModel<>();
		model.addElement("김구라");
		model.addElement("해골");
		model.addElement("원숭이");
		
		//문자열 목록을 출력할수 있는 JList
		JList<String> list=new JList<>();
		//JList 에 모델 연결 
		list.setModel(model);
		
		this.add(list);

		setBounds(100, 100, 500, 500);
		//종료 버튼을 눌렀을때 process 가 종료 되도록 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);			// 마지막에 해주는게 좋음. 순서에 따라 항목들이 안 보일 수 있음.
		
	}

	public static void main(String[] args) {
		new JListTest();
	}
}









