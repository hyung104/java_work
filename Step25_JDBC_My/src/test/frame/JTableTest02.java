package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class JTableTest02 extends JFrame implements ActionListener, MouseListener  {
	//필드
	DefaultTableModel model;
	JTable table;
	JTextField tf1, tf2, tf3;
	int iRow=-1;
	
	//생성자
	public JTableTest02() {
		//레이아웃 법칙을 BorderLayout으로 설정
		setLayout(new BorderLayout());
		
		//테이블의 칼럼명
		String[] colNames= {"번호","이름","주소"};
		//테이블에 연결할 모델 객체
		model=new DefaultTableModel(colNames, 0);
		//테이블 객체를 생성하고
		table=new JTable();
		//모델을 연결하기
		table.setModel(model);
		//테이블에 리스너 등록
		table.addMouseListener(this);
		
		//테이블을 스크롤 페널에 붙이고 
		JScrollPane scPane=new JScrollPane(table);
		//스크롤 페널을 프레임의 가운데에 배치
		add(scPane, BorderLayout.CENTER);
		
		//페널을 만들고
		JPanel northPanel=new JPanel();
		//버튼을 만들어서
		JButton testBtn=new JButton("불러오기");
		JButton newBtn=new JButton("추가");
		//페널에 붙이고
		northPanel.add(testBtn);
		northPanel.add(newBtn);
		//버튼이 붙은 페널을 프레임의 북쪽에 배치
		add(northPanel,BorderLayout.NORTH);
		//버튼의 리스너 등록
		testBtn.addActionListener(this);
		testBtn.setActionCommand("load");
		newBtn.addActionListener(this);
		newBtn.setActionCommand("new");
		
		JPanel southPanel=new JPanel();
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		
		tf1=new JTextField(5);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		
		JButton saveBtn=new JButton("저장");
		JButton deleteBtn=new JButton("삭제");
		
		southPanel.add(label1);
		southPanel.add(tf1);
		southPanel.add(label2);
		southPanel.add(tf2);
		southPanel.add(label3);
		southPanel.add(tf3);
		southPanel.add(saveBtn);
		southPanel.add(deleteBtn);
		
		add(southPanel,BorderLayout.SOUTH);
		
		saveBtn.addActionListener(this);
		saveBtn.setActionCommand("save");
		deleteBtn.addActionListener(this);
		deleteBtn.setActionCommand("delete");
		
		setBounds(100,100,700,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTest02();
	}
	
	// Member List를 불러오는 메소드
	public void list() {
		try{
			//초기화
			model.setRowCount(0);
			
			//목록 불러오기
			MemberDao dao=MemberDao.getInstance();
			List<MemberDto> list=dao.getList();
			//반복문 돌면서 MemberDto 객체를 하나씩 참조해서
			for(MemberDto tmp:list) {
				//Object[] 객체에 회원 한명의 정보를 담아서
				Object[] data={tmp.getNum(), tmp.getName(), tmp.getAddr()};				
				//모델에 추가하기
				model.addRow(data);				
			}
			
			//하단 member 정보 초기화
			if(iRow>-1) {
				table.setRowSelectionInterval(iRow, iRow);
			}
			setMemberInfo(iRow);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// 선택한 Member정보 하단에 보여주기(수정, 삭제 가능)
	public void setMemberInfo(int row) {
		iRow=row;
		if(row==-1) {	//추가			
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf1.setEnabled(true);
		}else {
			tf1.setText(Integer.toString((int)model.getValueAt(row, 0)));
			tf2.setText((String)model.getValueAt(row, 1));
			tf3.setText((String)model.getValueAt(row, 2));
			tf1.setEnabled(false);
		}		
		//System.out.println(row);
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		String command=e.getActionCommand();
		int num=0;
		if(command.equals("load")) {
			iRow=-1;					
			list();
		}else if(command.equals("new")) {
			setMemberInfo(-1);			
		}else if(command.equals("save")) {			
			//데이터 확인
			if(tf1.getText()==null||tf1.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "번호를 입력해주세요."); 
				return;
			}else {
				try {
					num=Integer.parseInt(tf1.getText());
				}catch(Exception exe) {
					JOptionPane.showMessageDialog(this, "번호는 숫자로 입력해주세요.");
					return;
				}
			}
			if(tf2.getText()==null||tf2.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "이름을 입력해주세요."); 
				return;
			}
			if(tf3.getText()==null||tf3.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "주소를 입력해주세요."); 
				return;
			}
			
			MemberDao dao=MemberDao.getInstance();
			MemberDto dto=new MemberDto(num,
										tf2.getText(), tf3.getText());
			if(iRow==-1) {
				if(dao.insert(dto)) {
					JOptionPane.showMessageDialog(this, "추가했습니다.");
					iRow=model.getRowCount();
					System.out.println("iRow:"+iRow);
					list();
				}else {
					JOptionPane.showMessageDialog(this, "오류가 발생해서 추가 저장할 수 없습니다."); 				
				}
			}else {
				if(dao.update(dto)) {
					JOptionPane.showMessageDialog(this, "수정했습니다."); 
					list();
				}else {
					JOptionPane.showMessageDialog(this, "오류가 발생해서 수정 저장할 수 없습니다."); 				
				}				
			}			
		}else if(command.equals("delete")) {
			if(tf1.getText()==null||tf1.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "삭제할 정보를 선택해주세요."); 
				return;
			}
			int which=JOptionPane.showConfirmDialog(this, "삭제 할까?");		// return값 몰라도 상수값 (static final int) 이용해서 확인.
			if(which!=JOptionPane.YES_OPTION) return;		
			
			MemberDao dao=MemberDao.getInstance();
			num=Integer.parseInt(tf1.getText());
			if(dao.delete(num)) {
				JOptionPane.showMessageDialog(this, "삭제했습니다."); 
				iRow=-1;
				list();
			}else {
				JOptionPane.showMessageDialog(this, "오류가 발생해서 삭제할 수 없습니다."); 				
			}
		}	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		JTable jtable = (JTable)e.getSource();		
        int row = jtable.getSelectedRow();            // 선택된 테이블의 행값
        // 선택한 member 정보 보여주기
        setMemberInfo(row);        
	}
	@Override
	public void mouseEntered(MouseEvent e) {		
	}
	@Override
	public void mouseExited(MouseEvent e) {		
	}
	@Override
	public void mousePressed(MouseEvent e) {		
	}
	@Override
	public void mouseReleased(MouseEvent e) {				
	}
}
