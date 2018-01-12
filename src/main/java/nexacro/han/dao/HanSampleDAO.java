package nexacro.han.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("hanSampleDAO")
public class HanSampleDAO extends NexacroIbatisAbstractDAO {
	
	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return list("han.hanSampleDAO.loadCommonCodes", classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchCust() {
		return list("han.hanSampleDAO.searchCust");
	}
	
	public void insertCust(Map map) {
		insert("han.hanSampleDAO.insertCust", map);
	}
	
	public void updateCust(Map map) {
		insert("han.hanSampleDAO.updateCust", map);
	}
	
	public void deleteCust(Map map) {
		insert("han.hanSampleDAO.deleteCust", map);
	}

}
