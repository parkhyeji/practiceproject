package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabAlesSueVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("ales_sueDao")
public class TabAlesSueDAO extends NexacroIbatisAbstractDAO {

	//기본조회
		@SuppressWarnings("unchecked")
		public List<TabAlesSueVO> ales_sueSelect(Map<String, Object> selectMap) {
			return (List<TabAlesSueVO>)list("prgr.Ales_sueDAO.getAlesSueSelect", selectMap);
		}
		
		
		//저장
		public void ales_sueSave(TabAlesSueVO ales_sueVO) {
			insert("prgr.Ales_sueDAO.ales_sueSave",ales_sueVO);
		}

		//수정
		public void ales_sueUpdate(TabAlesSueVO ales_sueVO) {
			update("prgr.Ales_sueDAO.ales_sueUpdate",ales_sueVO);
		}

}
