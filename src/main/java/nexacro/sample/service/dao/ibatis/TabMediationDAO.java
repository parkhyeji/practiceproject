package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabLawFixinfoVO;
import nexacro.sample.vo.TabMediationVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

/**
 * Test를 위한 DAO Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Repository("mediationDao")
public class TabMediationDAO extends NexacroIbatisAbstractDAO {
	//기본사항조회
		@SuppressWarnings("unchecked")
		public List<TabMediationVO> mediationSelect(Map<String, Object> selectMap) {
			// TODO Auto-generated method stub
			return (List<TabMediationVO>)list("prgr.MediationDAO.mediationSelect", selectMap);
		}
		
		//원피고조회
		@SuppressWarnings("unchecked")
		public List<TabMediationVO> pladefSelect(Map<String, Object> selectMap) {
			// TODO Auto-generated method stub
			return (List<TabMediationVO>)list("prgr.MediationDAO.pladefSelect", selectMap);
		}
		
		//조정안조회
		@SuppressWarnings("unchecked")
		public List<TabMediationVO> bottomSearch(Map<String, Object> selectMap) {
			// TODO Auto-generated method stub
			return (List<TabMediationVO>)list("prgr.MediationDAO.bottomSearch", selectMap);
		}
		
		//저장
		public void mediationSave(TabMediationVO mediationVO) {
			// TODO Auto-generated method stub
			insert("prgr.MediationDAO.mediationSave",mediationVO);
		}
		
		//수정
		public void mediationUpdate(TabMediationVO mediationVO) {
			// TODO Auto-generated method stub
			update("prgr.MediationDAO.mediationUpdate",mediationVO);		
		}
		
		//삭제
		public void mediationDelect(TabMediationVO mediationVO) {
			// TODO Auto-generated method stub
			delete("prgr.MediationDAO.mediationDelect",mediationVO);
		}


}
