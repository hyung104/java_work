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

public class TestFrame07 extends JFrame implements ActionListener{
	//필드 - 다른 메소드에서 사용할 경우 해줘야 함.
	JTextField tf1, tf2, tf3;
	
	//생성자
	public TestFrame07() {
		//프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		
		//JTextField 객체
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(13);
		
		//버튼
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JButton multiBtn=new JButton("*");
		JButton divideBtn=new JButton("/");
		
		//버튼에 리스너 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);

		// 액션 command 등록
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");

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
		new TestFrame07();
	}
	//버튼을 누르면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//어떤 버튼이 눌러졌는지 액션 command를 읽어와서
		String command=e.getActionCommand();

		//입력한 문자열을 읽어온다.
		String one=tf1.getText();
		String two=tf2.getText();
		
		//연산의 결과를 담을 수 있는 변수 만들기
		double result=0;
		
		try {
			//문자열을 산술 연산할수 있는 실수로 바꾸기
			double num1=Double.parseDouble(one);
			double num2=Double.parseDouble(two);

			if (command.equals("plus")) {
				result=num1+num2;
			}else if(command.equals("minus")) {
				result=num1-num2;
			}else if(command.equals("multi")) {
				result=num1*num2;
			}else if(command.equals("divide")) {
				result=num1/num2;
			}
			// 결과를 TextField에 출력하기
			tf3.setText(Double.toString(result));			
		}catch (Exception exe) {
			//exe.printStackTrace();
			tf3.setText("오류");			
			JOptionPane.showMessageDialog(this, "숫자 형식을 확인하세요.");
		}
	}
}
