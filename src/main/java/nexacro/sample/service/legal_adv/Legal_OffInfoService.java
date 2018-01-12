package nexacro.sample.service.legal_adv;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.depo.DepoVO;
import nexacro.sample.vo.legal_adv.LegalOfficialInfoVO;

public interface Legal_OffInfoService {

	//외부법률관계자 관리
	List<LegalOfficialInfoVO> selectList(Map<String, Object> map);
	
	//외부법률관계자 저장/수정/삭제
	String saveLgOfclList(List<LegalOfficialInfoVO> ofclVO);
	
}
