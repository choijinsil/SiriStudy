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
	private String id;
	private String pass;
	private String name;
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserTest [id=" + id + ", pass=" + pass + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
