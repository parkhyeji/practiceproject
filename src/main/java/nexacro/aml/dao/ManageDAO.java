package nexacro.aml.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("ManageDAO")
public class ManageDAO extends NexacroIbatisAbstractDAO {
	
	@SuppressWarnings("rawtypes")
	public List ManageCommonCode(Map<String, Object> classCodeMap) {
		return list("loadCommonCodes", classCodeMap);
	}
	
	public List ManageList(Map map){
		return list("ManageList", map);
	}

}
