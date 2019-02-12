package conf;



import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;



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

public class SqlMapConfig {
	private static SqlSessionFactory sqlsession;
	static {
		try {
			System.out.println("SDaaaa");
			String resource = "./conf/mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlsession = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("error: " + e);
		}
	}

	public static SqlSessionFactory getSqlMapInstance() {
		return sqlsession;
	}
	
}

