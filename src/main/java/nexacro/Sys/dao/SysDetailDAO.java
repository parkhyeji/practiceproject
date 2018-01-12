package nexacro.Sys.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;





//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("sysDetailDAO")
public class SysDetailDAO extends NexacroIbatisAbstractDAO {
		
	@SuppressWarnings("rawtypes")
	public List loadCommonCodeDetail() {
		return list("Sys.sysDetailDAO.loadCommonCodesDetail");
	}
	
	@SuppressWarnings("rawtypes")	
	public List read(Map map) { // 분류코드, 상세코드, 상세코드명 조회
		return list("Sys.sysDetailDAO.read", map);
	}
	
	public List selectOption(Map map) { // 상위 셀렉트박스 값 변경시 하위셀렉트박스 제어
		return list("Sys.sysDetailDAO.selectOption", map);		
	}

	public void insert(Map map) {
		insert("Sys.sysDetailDAO.insert", map);
	}

	public void update(Map map) {
		insert("Sys.sysDetailDAO.update", map);
	}

	public void delete(Map map) {
		insert("Sys.sysDetailDAO.delete", map);
	}
}