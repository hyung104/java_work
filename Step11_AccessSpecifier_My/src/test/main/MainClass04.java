package test.main;

import test.mypac.MemberDao;

public class MainClass04 {
	public static void main(String[] args) {
		
		//MemberDao dao=new MemberDao(); <- 생성자를 private이므로 안됨.오류남
		
		//MemberDao 객체의 참조값을 리턴해주는 메소드를 호출해서 참조값을 얻어낸다.
		MemberDao dao= MemberDao.getInstance();	// static method
		
		dao.insert();
		dao.delete();
	}
}
