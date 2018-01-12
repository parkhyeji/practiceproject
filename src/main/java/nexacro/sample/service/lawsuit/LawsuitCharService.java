package nexacro.sample.service.lawsuit;

import java.util.List;
import java.util.Map;

import nexacro.sample.service.lawsuit.vo.LawsuitCharVO;

public interface LawsuitCharService {

	List<LawsuitCharVO> LawsuitCharSelectVO(Map<String, Object> ListMap);

}
