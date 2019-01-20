package service;

import java.io.Serializable;

import beans.UserTest;

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
	
	public static void main(String[] args) {
		System.out.println("123");
		
		UserService s = new UserService();
		
		UserTest t = new UserTest();
		t.setId("ididid");
		
		s.insert(t);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void insert(UserTest a){
		
		System.out.println("a"+a);
		System.out.println("insert");
	}

}
