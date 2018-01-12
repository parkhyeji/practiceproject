package nexacro.aml.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;














//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("SuspDealDAO")
public class SuspDealDAO extends NexacroIbatisAbstractDAO {

	public List loadCustCode(Map<String, Object> classCodeMap) {
		return list("aml.SuspDealDAO.loadCustCode", classCodeMap);
	}

	public List loadRuleInfo(Map<String, Object> classCodeMap) {
		return list("aml.SuspDealDAO.loadRuleInfo", classCodeMap);
	}

	public List loadCustInfo(Map<String, Object> classCodeMap) {
		return list("aml.SuspDealDAO.loadCustInfo", classCodeMap);
	}
}
