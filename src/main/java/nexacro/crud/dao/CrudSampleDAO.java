package nexacro.crud.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("crudSampleDAO")
public class CrudSampleDAO extends NexacroIbatisAbstractDAO {
	
	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return list("crud.crudSampleDAO.loadCommonCodes", classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchCust() {
		return list("crud.crudSampleDAO.searchCust");
	}
	
	public void insertCust(Map map) {
		insert("crud.crudSampleDAO.insertCust", map);
	}
	
	public void updateCust(Map map) {
		insert("crud.crudSampleDAO.updateCust", map);
	}
	
	public void deleteCust(Map map) {
		insert("crud.crudSampleDAO.deleteCust", map);
	}

}
