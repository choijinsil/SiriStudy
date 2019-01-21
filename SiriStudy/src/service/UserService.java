package service;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.UserTest;
import jdbc.DBConnUtil;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	js
 * @since 	2019. 1. 17.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2019. 1. 17.		js				최초생성
 * 
 * </pre>
 */

public class UserService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// insert 메서드를 실행하면, 논리값을 리턴
	public boolean insert(UserTest userTest){
		
		System.out.println("a"+userTest);
		System.out.println("insert");
		
		int rows=0;
		boolean isRows= false;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBConnUtil.getConnection();
			String sql="INSERT INTO member(user_id, user_pass, user_name, user_email)  VALUES (?,?,?,?)";
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setString(1, userTest.getUserId());
			pstmt.setString(2, userTest.getUserName());
			pstmt.setString(3, userTest.getUserPass());
			pstmt.setString(4, userTest.getUserEmail());
			
			rows=pstmt.executeUpdate();
			
			if(rows>0){
				isRows=true;
			}else{
				isRows=false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			DBConnUtil.close(pstmt, conn);
		}
		return isRows;
	}
	// select 메서드를 호출하면 userTest list(여러건)을 리턴
	public List<UserTest> select(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		List<UserTest> list= new ArrayList<>();
		try {
			conn=DBConnUtil.getConnection();
			String sql="select * from member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				UserTest test=new UserTest();
				test.setId(rs.getLong("id"));
				test.setUserId(rs.getString("user_id"));
				test.setUserName(rs.getString("user_name"));
				test.setUserEmail(rs.getString("user_email"));
				
				list.add(test);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			DBConnUtil.close(pstmt, conn, rs);
		}
		
		System.out.println(" 총 회원 수: "+list.size()+"명");
		
		return list;
	}
	
	// id값에 해당하는 UserTest
	// select를 호출하면 userTest를 리턴해줘
	public UserTest select(Long id){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		UserTest test=new UserTest();
		try {
			conn=DBConnUtil.getConnection();
			String sql="select * from member where id=?";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setLong(1, id);
			
			rs=pstmt.executeQuery();
			
			
			if(rs.next()){
				
				test.setId(rs.getLong("id"));
				test.setUserId(rs.getString("user_id"));
				test.setUserName(rs.getString("user_name"));
				test.setUserEmail(rs.getString("user_email"));
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			DBConnUtil.close(pstmt, conn, rs);
		}
		
		return test;
	}
	
	public Long del(Long id){
		System.out.println("111111111111");
		Connection conn=null;
		PreparedStatement pstmt=null;
		int rows=0;
		System.out.println(id);
		
		try {
			conn=DBConnUtil.getConnection();
			
			String sql="delete from member where id=?";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setLong(1, id);
			
			rows=pstmt.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			DBConnUtil.close(pstmt, conn);
		}
		
	return id;	
	}
}
