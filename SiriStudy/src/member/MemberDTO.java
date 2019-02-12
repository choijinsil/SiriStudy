package member;

import java.io.Serializable;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	js
 * @since 	2019. 1. 22.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2019. 1. 22.		js				최초생성
 * 
 * </pre>
 */
// 데이터 베이스로 연결하는 클래스 

public class MemberDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String userId;
	private String userPw;
	private String userEmail;
	private String userAuthHash;
	private String userAuthCheck;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAuthHash() {
		return userAuthHash;
	}
	public void setUserAuthHash(String userAuthHash) {
		this.userAuthHash = userAuthHash;
	}
	public String getUserAuthCheck() {
		return userAuthCheck;
	}
	public void setUserAuthCheck(String userAuthCheck) {
		this.userAuthCheck = userAuthCheck;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail
				+ ", userAuthHash=" + userAuthHash + ", userAuthCheck=" + userAuthCheck + "]";
	}
	
	
	
}
