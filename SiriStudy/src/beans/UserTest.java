package beans;

import java.io.Serializable;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	js
 * @since 	2019. 1. 16.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2019. 1. 16.		js				최초생성
 * 
 * </pre>
 */

public class UserTest implements Serializable{
	/**
	 * 세션때문에 이 구문이 없으면 에러 난다. (직렬화, 역직렬화)
	 * class 파일을 default 패키지에 넣으면 javabeans가 안돌아 간다. 
	 */
	private static final long serialVersionUID = 1L;
	
	// id, pass
	private Long id;
	private String userId;
	private String userPass;
	private String userName;
	private String userEmail;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UserTest [userId=" + userId + ", userPass=" + userPass + ", userName=" + userName + ", userEmail="
				+ userEmail + "]";
	}

}
