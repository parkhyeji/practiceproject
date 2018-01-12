package nexacro.sample.service;

import java.util.List;

import nexacro.sample.vo.com.CmmCodeVO;

public interface CmmCodeService {
	
	// 온로드 시 호출 서비스(분류코드 및 부모코드 검색)
	List<CmmCodeVO> formOnload(String command);
	
	// 검색
	List<CmmCodeVO>	selectCodeList(CmmCodeVO cmmCodeVO);
	
	// 저장 / 수정 / 삭제
	String editCmmCode(List<CmmCodeVO> cmmCodeVO, String updateId);
}
