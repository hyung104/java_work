package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		//DB에 저장할 회원 정보라고 가정
		int num=4;
		String name="주뎅이";
		String addr="봉천동";
		
		//MemberDao 객체의 참조값 얻어와서
		MemberDao dao=MemberDao.getInstance();
		//회원정보 저장하기
		boolean isSuccess=dao.insert(new MemberDto(num, name, addr));
		System.out.println("insert return : "+isSuccess);
		
		MemberDto dto=dao.getData(4);
		if(dto!=null) {
			System.out.println(dto.getNum()+"|"+dto.getName()+"|"+dto.getAddr());
		}
		
		//회원정보 수정하기
		num=4;
		name="진달래";
		addr="혜화동";
		isSuccess=dao.update(new MemberDto(num, name, addr));
		System.out.println("update return : "+isSuccess);

		List<MemberDto> list=dao.getList();
		for(int i=0; i<list.size(); i++) {
			MemberDto tmp=list.get(i);
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
		
		//회원정보 삭제하기
		isSuccess=dao.delete(4);
		System.out.println("delete return : "+isSuccess);
		
		list=dao.getList();
		for(int i=0; i<list.size(); i++) {
			MemberDto tmp=list.get(i);
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}		
	}
}
