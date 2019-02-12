package member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import conf.SqlMapConfig;

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

public class MemberDAOImpl implements MemberDAO{
	private SqlSession sqlSession;
	private SqlSessionFactory sessionFactory = SqlMapConfig.getSqlMapInstance();
	
	public MemberDAOImpl(){
		// true로 설정하면 auto commit이 된다. 
		sqlSession=sessionFactory.openSession(true);
	}

	@Override
	public int save(MemberDTO member) {
		sqlSession.insert("memberInsert",member);
		return 0;
	}

	@Override
	public List<MemberDTO> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO select(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// 

}
