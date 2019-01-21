package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author js
 * @since 2019. 1. 20.
 * @version 1.0
 * @see
 * 
 *      <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2019. 1. 20.		js				최초생성
 * 
 *      </pre>
 */

public class DBConnUtil {

	private static Connection conn;

	private DBConnUtil() {

	}

	public static Connection getConnection() throws Exception {

		Class.forName("org.mariadb.jdbc.Driver");

		conn = DriverManager.getConnection(
				// http://naver.com:80/login
				"jdbc:mariadb://127.0.0.1:3306/mysiris", "root", "0000");
		return conn;
	}

	public static void close(PreparedStatement pstmt, Connection conn) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//로그 찍기
	}
	
	public static void close(PreparedStatement pstmt, Connection conn,ResultSet rs){
		try {
			if(rs != null) {rs.close();}				
		} catch(Exception e) {
			e.printStackTrace();
		}
		close(pstmt, conn);
		
	}
}
