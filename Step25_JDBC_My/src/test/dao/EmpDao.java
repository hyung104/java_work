package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.util.DBConnect;

public class EmpDao {
	// signle ton 으로 사용할 수 있도록 구조를 잡아보세요.	
	private static EmpDao dao;
	private EmpDao() {}
	public static EmpDao getInstance() {		
		if(dao==null) {
			//EmpDao.dao=new EmpDao();		- static 에서는 this 사용 못함.
			dao=new EmpDao();
		}
		return dao;
	}	
	//사원 목록을 리턴해주는 메소드
	public List<EmpDto> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<EmpDto> list=new ArrayList<>();		// list 초기값  null아님. new 했으므로 참조값 있. .size()는 0임. 빈배열이 있음.
		
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			//실행할 sql 문
//			String sql="SELECT empno, ename, sal, dname, TO_CHAR(hiredate, 'YYYY\"년\"MM\"월\"DD\"일\"') hiredate" 
//					+" FROM emp e, dept d"
//					+" WHERE e.deptno=d.deptno"
//					+" ORDER BY empno ASC";
//			pstmt=conn.prepareStatement(sql);
			
			StringBuilder builder=new StringBuilder();
			builder.append("SELECT empno, ename, sal, dname, ");
			builder.append(" TO_CHAR(hiredate, 'YYYY\"년\"MM\"월\"DD\"일\"') hiredate");
			builder.append(" FROM emp e, dept d");
			builder.append(" WHERE e.deptno=d.deptno");
			builder.append(" ORDER BY empno ASC");
			
			//PrepareStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(builder.toString());
			//SELECT 문을 수행하고 결과를 ResultSet으로 얻어낸다.
			rs=pstmt.executeQuery();
			//반복문 돌면서 EmpDto 객체에 사원정보를 담아서 배열에 누적시킨다.
			while(rs.next()) {
//				EmpDto dto=new EmpDto(rs.getInt("empno"),
//									  rs.getString("ename"),
//									  rs.getDouble("sal"),
//									  rs.getString("dname"),
//									  rs.getString("hiredate") );
				
				EmpDto dto=new EmpDto();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setSal(rs.getDouble("sal"));
				dto.setDname(rs.getString("dname"));
				dto.setHiredate(rs.getString("hiredate"));
				
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
