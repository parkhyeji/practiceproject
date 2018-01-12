package nexacro.sample.service.administrator;

import java.util.Map;

import nexacro.sample.vo.administrator.AdmVO;


public interface AdmService {
	
	// 로그인
	AdmVO selectLogin(Map<String, String> loginMap);
	
	// 존재하는 아이디인지 검색
	AdmVO selectId(String id);
	
	// 회원가입
	void insertAdm(AdmVO admVO);
	
}
