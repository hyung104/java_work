package test.frame;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFrame01 extends JFrame {
	// 생성자
	public TestFrame01() {
		//상속받았으므로 가능함.
		TestFrame01 a=this;
		JFrame b=this;
		Component c=this;
		Object d=this;
		
		//버튼 객체 생성해서
		JButton button=new JButton("눌러보세요");
		//버튼에 액션 리스너 등록하기
		button.addActionListener(listener);		// 파란색 필드. this.listener 의미.
		//이 프레임에 추가하기
		this.add(button);
				
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	//ActionListener type 객체를 필드로 정의하기.  인터페이스이므로 익명의 inner class 만들어서 생성 
	ActionListener listener=new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {
			//여기서 this 는 ActionListener type의 익명함수.
			ActionListener a=this;
			Component b=TestFrame01.this;
			
			//System.out.println("버튼을 눌렀네?");
			//특정 프레임에서 알림 띄움 ( = alert )
			JOptionPane.showMessageDialog(TestFrame01.this, "버튼 click");
		}
	};
	
	//main method
	public static void main(String[] args) {
		new TestFrame01();
	}
}

