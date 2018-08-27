package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		/* 
		 * 1. MemberDto type을 다을 ArrayList 객체를 생성하고
		 * 2. 3명의 회원정보를 각각 MemberDto 객체에 담아서 
		 * 3. MemberDto 객체의  참조값 ArrayList 객체에 저장하기
		 */
		
		List<MemberDto> members=new ArrayList<>();
		
//		MemberDto mem1=new MemberDto(1, "김구라", "노량진");
//		MemberDto mem2=new MemberDto(2, "해골", "행신동");
//		MemberDto mem3=new MemberDto(3, "원숭이", "동물원");
		
		MemberDto mem1=new MemberDto();
		mem1.setNum(1);
		mem1.setName("김구라");
		mem1.setAddr("노량진");
		
		MemberDto mem2=new MemberDto();
		mem2.setNum(2);
		mem2.setName("해골");
		mem2.setAddr("행신동");

		MemberDto mem3=new MemberDto();
		mem3.setNum(3);
		mem3.setName("원숭이");
		mem3.setAddr("동물원");
		
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		//참조 연습
		List<MemberDto> a=members;
		MemberDto b=members.get(0);
		int c=members.get(0).getNum();
		String d=members.get(0).getName();
		String e=members.get(0).getAddr();
	}
}
