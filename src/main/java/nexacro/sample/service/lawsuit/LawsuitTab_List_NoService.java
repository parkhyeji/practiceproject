package nexacro.sample.service.lawsuit;

import java.util.List;
import java.util.Map;

import nexacro.sample.service.lawsuit.vo.LawsuitTab_List_NoVO;

public interface LawsuitTab_List_NoService {

	List<LawsuitTab_List_NoVO> LawsuitTabListNoSelectVO(Map<String, Object> ListMap);

	int lawsuittablistnoModifyVO(List<LawsuitTab_List_NoVO> lawsuitTab_List_NoVO);

}
