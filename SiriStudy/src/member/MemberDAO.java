package member;

import java.util.List;

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

public interface MemberDAO {
	//회원 저장 메소드
	public int save(MemberDTO member);
	
	//회원 전체 조회
	public List<MemberDTO> select();
	
	//회원 상세 조회
	public MemberDTO select(String userId);
}
