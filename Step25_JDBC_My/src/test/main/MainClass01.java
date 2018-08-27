package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * 	JDBC (Java Database Connectivity)
 * 
 * - java 에서의 DataBase 연동 프로그래밍 연습
 * - Oracle Database 를 연동하려면 ojdbc6.jar 파일이 사용가능한
 *   위치에 있어야 한다. DB 연동하기 위한 드라이버 클래스가 ojdbc6.jar 파일에 들어 있다. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			//오라클 드라이버 로딩(ojdbc6.jar 있어야함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//@접속ip주소:port번호:DB이름. express edition => xe
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//.getConnection(url, 계정, 비밀번호)
			conn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");			
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();			
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		// 필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT num,name,addr FROM member";
			//sql문을 수해앟ㄹ PreparedStatement 객체를 얻어내기
			pstmt=conn.prepareStatement(sql);
			//쿼리문을 수행하고 결과를 ResultSet 으로 얻어낸다
			rs=pstmt.executeQuery();
			//반복문 돌면서 ResultSet에 담긴 정보 추출하기
			//처음 데이터를 받아오면 1행에 있는게 아니라 cursor의 시작위치에 있다가, .next()를 만나면 1행으로 이동. 반복 돌면서 그다음행 이동 이동 이동 함.
			while(rs.next()){		// 다음 데이터가 있으면 true
				//cursor 를 한캔 내려서 cursor가 위치한 곳의 
				// num, name, addr 을 읽어온다.
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				//읽어온 후 원하는 작업하기
				System.out.println(num+"|"+name+"|"+addr);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();				
			}catch(Exception e) { }
		}
		System.out.println("main method end");
	}
}
