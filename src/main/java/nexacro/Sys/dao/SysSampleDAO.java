package nexacro.Sys.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("sysSampleDAO")
public class SysSampleDAO extends NexacroIbatisAbstractDAO {
	
	@SuppressWarnings("rawtypes")
	public List loadCommonCode() {
		return list("Sys.sysSampleDAO.loadCommonCodes");
	}
		
	@SuppressWarnings("rawtypes")
	public void create(Map map) {
		insert("Sys.sysSampleDAO.insert", map);
	}
	
	public List read(Map map) { // 분류 코드 별 조회
		return list("Sys.sysSampleDAO.read", map);
	}
	
	public void insert(Map map) {
		insert("Sys.sysSampleDAO.insert", map);
	}
	
	public void update(Map map) {
		insert("Sys.sysSampleDAO.update", map);
	}
	
	public void delete(Map map) {
		insert("Sys.sysSampleDAO.delete", map);
	}
}
