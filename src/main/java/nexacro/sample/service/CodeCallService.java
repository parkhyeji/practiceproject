package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.CodeCallVO;

public interface CodeCallService {

	//공통코드검색
	List<CodeCallVO> selectCodeList(Map<String, Object> codeMap);
	
	//전체 사유코드 리스트 검색
	List<CodeCallVO> getReasonList(Map<String, Object> codeMap);
	
}
