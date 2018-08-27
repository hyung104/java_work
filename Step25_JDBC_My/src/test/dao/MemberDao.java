package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 * Dao => Data Access Object
 * 
 * - 회원정보에 대해서 SELECT, INSERT, UPDATE, DELETE 작업을
 *   수행할 객체를 생성하기 위한 클래스 정의하기
 * - Application 전역에서 MmeberDao 객체는 오직 1개만 생성될 수 있도록 설계한다.
 */
public class MemberDao {
	//1. 자신의 Type을 private static 멤버필드로 정의한다.
	private static MemberDao dao;
	//2. 외부에서 객체 생성할 수 없도록 생성자의 접근 지정자를 private로 지정 - 막음.
	private MemberDao() {}
	//3. 자신의 참조값을 리턴해주는 static 멤머 메소드를 정의한다.
	public static MemberDao getInstance() {
		if(dao==null){//최초 호출될때는 null이므로
			dao=new MemberDao();//객체를 생성해서 필드에 저장한다.	 그이후에는 만들어진거 계속 return함		
		}
		//필드에 저장된 참조값을 리턴해준다.
		return dao;
	}
	
	//회원정보를 저장하는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		//영향을 받은 row의 갯수를 저장할 지역 변수
		int flag=0;
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="INSERT INTO member (num, name, addr) VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());
			flag=pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		//작업 성공 여부 리턴해주기
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		//영향을 받은 row의 갯수를 저장할 지역 변수
		int flag=0;
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="UPDATE member SET name=?, addr=? WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			flag=pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		//작업 성공 여부 리턴해주기
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원정보를 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		//영향을 받은 row의 갯수를 저장할 지역 변수
		int flag=0;
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="DELETE FROM member WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag=pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		//작업 성공 여부 리턴해주기
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원 한명의 정보를 리턴해주는 메소드
	public MemberDto getData(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//회원정보를 담을 MemberDto type의 지역변수 미리 만들기
		MemberDto dto=null;
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="SELECT num,name, addr FROM member WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new MemberDto(rs.getInt("num"), rs.getString("name"), rs.getString("addr") );
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}		
		return dto;
	}
	//회원 목록을 리턴하는 메소드
	public List<MemberDto> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//회원정보를 저장할  List 객체 생성
		List<MemberDto> list=new ArrayList<>();
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="SELECT num,name,addr FROM member ORDER BY num";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				//회원 정보를 MemberDto 객체에 담아서
				MemberDto dto=new MemberDto(num, name, addr);
				//list에 누적 시키기
				list.add(dto);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}		
		return list;
	}
}

