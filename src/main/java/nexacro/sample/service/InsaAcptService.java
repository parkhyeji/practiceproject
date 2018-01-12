package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.com.InsaAcptVO;

public interface InsaAcptService {

	// 사원 승인 내역 조회
	List<InsaAcptVO> selectInsaAcptList(Map params);
	
	// 사원 승인 내역 정보 저장
	void saveInsaAcptList(Map params);
	
}
