package nexacro.sample.service.dao.ibatis.administrator;

import java.util.Map;

import nexacro.sample.vo.administrator.AdmVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;


@Repository("admDao")
public class AdmDao extends NexacroIbatisAbstractDAO{

	// 로그인
	public AdmVO selectLogin(Map<String, String> loginMap){
		return (AdmVO)select("administrator.admlogin", loginMap);
	}
	
	// 존재하는 아이디인지 조회
	public AdmVO selectId(String id){
		return (AdmVO)select("administrator.selectid", id);
	}
	
	// 회원가입
	public void insertAdm(AdmVO admVO){
		insert("administrator.admInsert", admVO);
	}
	
}
