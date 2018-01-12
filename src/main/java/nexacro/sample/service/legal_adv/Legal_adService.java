package nexacro.sample.service.legal_adv;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.legal_adv.LegalAdListVo;

public interface Legal_adService {
	
	List<LegalAdListVo> selectLegaladList(Map<String, Object> selectMap);
	int checkMgrAvailable(String mgr);
	String saveLegalAdDetail(List<LegalAdListVo> legalAdListVo);
	String saveLegalAdMandate(List<LegalAdListVo> legalAdListVo);
	List<LegalAdListVo> selectCost(Map<String, Object> selectMap);
	void saveLegalAdRep(List<LegalAdListVo> legalAdListVo);
	void saveCost(List<LegalAdListVo> legalAdListVo);
}
