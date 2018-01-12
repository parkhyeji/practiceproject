package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.SueVO;

public interface SueService {

	List<SueVO> sueMenList(Map<String, Object> sueMap);
	
	List<Map> sueView(Map<String, Object> sueMap);
	
	void sueUpdate(List<Map> params);
	
	int sueTotalCnt();
}
