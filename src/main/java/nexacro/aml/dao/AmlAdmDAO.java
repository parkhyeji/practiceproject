package nexacro.aml.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("amlAdmDAO")
public class AmlAdmDAO extends NexacroIbatisAbstractDAO{

	//직원 로그인
	@SuppressWarnings("rawtypes")
	public List login(Map<String, Object> params){
		return list("aml.AmlAdmDAO.login", params);
	}
	
	//아이디 존재여부
	public List selectId(Map map) {
		return list("aml.AmlAdmDAO.selectId", map);
	}
	
	//회원가입
	public void insert(Map map){
		insert("aml.AmlAdmDAO.insert", map);
	}
}
