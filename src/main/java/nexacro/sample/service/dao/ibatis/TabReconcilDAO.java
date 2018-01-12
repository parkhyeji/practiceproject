package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabReconcilVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

/**
 * 재판과화해를 위한 DAO Class
 *
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
@Repository("tabReconcilDAO")
public class TabReconcilDAO extends NexacroIbatisAbstractDAO {

	//원피고
	public List<TabReconcilVO> selectTabPladefVOList(TabReconcilVO searchVO) {
    	return (List<TabReconcilVO>) list("tabReconcilDAO.selectTabPladefVOList", searchVO);
    }
	
	//재판외화해
    public List<TabReconcilVO> selectTabReconcilVoList(TabReconcilVO searchVO) {
    	return (List<TabReconcilVO>) list("tabReconcilDAO.selectTabReconcilVOList", searchVO);
    }
    
    public List<TabReconcilVO> selectTabReconcil2VoList(TabReconcilVO searchVO) {
    	return (List<TabReconcilVO>) list("tabReconcilDAO.selectTabReconcil2VOList", searchVO);
    }
    
    //tabReconcilDAO.selectTabReconcil3VOList
    
    public List<TabReconcilVO> selectTabReconcil3VOList(TabReconcilVO searchVO) {
    	return (List<TabReconcilVO>) list("tabReconcilDAO.selectTabReconcil3VOList", searchVO);
    }
    
    
    public List<Map> selectTabReconcilMapList(TabReconcilVO searchVO) {
    	return (List<Map>) list("tabReconcilDAO.selectTabReconcilMapList", searchVO);
    }

    public List<TabReconcilVO> selectTabReconcilPaging(TabReconcilVO searchVO) {
    	searchVO.setRecordCountPerPage(searchVO.getFirstIndex()+searchVO.getRecordCountPerPage());
    	return (List<TabReconcilVO>) list("tabReconcilDAO.selectTabReconcilPaging", searchVO);
    }
    
    public int selectTabReconcilCount(TabReconcilVO searchVO) {
		return (int) select("tabReconcilDAO.selectTabReconcilCount", searchVO);
	}
    
    public void insertTabReconcilVO(TabReconcilVO sample) {
        insert("tabReconcilDAO.insertTabReconcilVO", sample);
    }
    
    public void updateTabReconcilVO(TabReconcilVO sample) {
        update("tabReconcilDAO.updateTabReconcilVO", sample);
    }
    
    public void updateTabReconcil2VO(TabReconcilVO sample) {
        update("tabReconcilDAO.updateTabReconcil2VO", sample);
    }
    
    public void deleteTabReconcilVO(TabReconcilVO sample) {
        delete("tabReconcilDAO.deleteTabReconcilVO", sample);
    }
    
    //updateTabPladefVO
    public void updateTabPladefVO(TabReconcilVO sample) {
        update("tabReconcilDAO.updateTabPladefVO", sample);
    }

}
