package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame07_my extends JFrame implements ActionListener{
	//필드
	JTextField tf1, tf2, tf3;
	JButton plusBtn, minusBtn, multiBtn, divideBtn;
	//생성자
	public TestFrame07_my() {
		//프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		
		//JTextField 객체
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(13);
		
		//버튼
		plusBtn=new JButton("+");
		minusBtn=new JButton("-");
		multiBtn=new JButton("*");
		divideBtn=new JButton("/");
		
		//버튼에 리스너 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		
		//레이블
		JLabel label=new JLabel("=");
		
		//페널
		JPanel panel=new JPanel();
		panel.add(tf1);
		panel.add(plusBtn);
		panel.add(minusBtn);
		panel.add(multiBtn);
		panel.add(divideBtn);
		panel.add(tf2);
		panel.add(label);
		panel.add(tf3);
				
		//페널을 프레임에 배치 
		add(panel, BorderLayout.NORTH);
		
		setBounds(100, 100, 800, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame07_my();
	}
	//버튼을 누르면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		Object which=e.getSource();		
		String result=null;
		
		//입력한 문자열을 읽어와서
		try {
			int num1=Integer.parseInt(tf1.getText());
			int num2=Integer.parseInt(tf2.getText());
			if (which==plusBtn) {
				result=Integer.toString(num1+num2);
			}else if(which==minusBtn) {
				result=Integer.toString(num1-num2);
			}else if(which==multiBtn) {
				result=Integer.toString(num1*num2);
			}else if(which==divideBtn) {
				if(num2!=0) {
					result=Double.toString(num1/(double)num2);
				}else {
					result="오류";
				}
			}
			
		} catch (Exception ex) {
			result="오류";
			//JOptionPane.showMessageDialog(this, "연산오류 발생했습니다.");
		} finally {
			tf3.setText(result);			
		}
	}
}
