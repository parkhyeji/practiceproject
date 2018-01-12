package nexacro.sample.service.lawsuit;

import java.util.List;
import java.util.Map;

import nexacro.sample.service.lawsuit.vo.LawsuitLegalOfficialCheckVO;

public interface LawsuitLegalOfficialCheckService {
	List<LawsuitLegalOfficialCheckVO> getLegalOfficials(Map<String, Object> ListMap);
}
