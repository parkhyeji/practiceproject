package nexacro.aml.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("amlSampleDAO")
public class AmlSampleDAO extends NexacroIbatisAbstractDAO {
	
	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return list("aml.amlSampleDAO.loadCommonCodes", classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")	
	public List searchStrList(Map map) {
		return list("aml.amlSampleDAO.searchStrList", map);
	}
	
	public List searchRule(Map map) {
		return list("aml.amlSampleDAO.searchRule", map);
	}
	public List searchCust(Map map) {
		return list("aml.amlSampleDAO.searchCust", map);
	}
	
	public List reason(Map map){
		return list("rule.Reason", map);
	}

}
