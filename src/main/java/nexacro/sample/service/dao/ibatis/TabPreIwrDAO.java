package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabPreIwrVO;
import nexacro.sample.vo.CmmCodeDetailVO;

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
@Repository("tabPreIwrDAO")
public class TabPreIwrDAO extends NexacroIbatisAbstractDAO {

	public List<CmmCodeDetailVO> selectCmmVoList(CmmCodeDetailVO searchVO) {
    	return (List<CmmCodeDetailVO>) list("tabPreIwrDAO.selectCmmVoList", searchVO);
    }
	public List<TabPreIwrVO> selectTabInstAdmVoList(TabPreIwrVO searchVO) {
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabInstAdmVOList", searchVO);
    }
	
	public List<TabPreIwrVO> selectTabInstAdmVo2List(TabPreIwrVO searchVO) {
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabInstAdm2VOList", searchVO);
    }
	
	public List<TabPreIwrVO> selectTabInstAdmVo3List(TabPreIwrVO searchVO) {
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabInstAdm3VOList", searchVO);
    }
	
	public List<TabPreIwrVO> selectTabInstAdmVo4List(TabPreIwrVO searchVO) {
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabInstAdm4VOList", searchVO);
    }
	
	public List<TabPreIwrVO> selectTabInstAdmVo5List(TabPreIwrVO searchVO) {
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabInstAdm5VOList", searchVO);
    }
	
	public List<TabPreIwrVO> selectTabInstAdmVo6List(TabPreIwrVO searchVO) {
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabInstAdm6VOList", searchVO);
    }
	
	public List<TabPreIwrVO> selectTabInstAdmVo7List(TabPreIwrVO searchVO) {
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabInstAdm7VOList", searchVO);
    }
    
    public List<Map> selectTabInstAdmMapList(TabPreIwrVO searchVO) {
    	return (List<Map>) list("tabPreIwrDAO.selectTabInstAdmMapList", searchVO);
    }
    
    public List<TabPreIwrVO> selectTabPreIwrVoList(TabPreIwrVO searchVO) {
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabPreIwrVOList", searchVO);
    }
    
    public List<Map> selectTabPreIwrMapList(TabPreIwrVO searchVO) {
    	return (List<Map>) list("tabPreIwrDAO.selectTabPreIwrMapList", searchVO);
    }        

    public List<TabPreIwrVO> selectTabPreIwrPaging(TabPreIwrVO searchVO) {
    	searchVO.setRecordCountPerPage(searchVO.getFirstIndex()+searchVO.getRecordCountPerPage());
    	return (List<TabPreIwrVO>) list("tabPreIwrDAO.selectTabPreIwrPaging", searchVO);
    }
    
    public int selectTabPreIwrCount(TabPreIwrVO searchVO) {
		return (int) select("tabPreIwrDAO.selectTabPreIwrCount", searchVO);
	}
    
    public void insertTabPreIwrVO(TabPreIwrVO sample) {
        insert("tabPreIwrDAO.insertTabPreIwrVO", sample);
    }
    
    public void updateTabPreIwrVO(TabPreIwrVO sample) {
        update("tabPreIwrDAO.updateTabPreIwrVO", sample);
    }
    public void deleteTabPreIwrVO(TabPreIwrVO sample) {
        delete("tabPreIwrDAO.deleteTabPreIwrVO", sample);
    }
    /*    
    public void insertTabInstAdmVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.insertTabInstAdmVO(sample);
    }
    
    public void updateTabInstAdmVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.updateTabInstAdmVO(sample);
    }
    
    public void deleteTabInstAdmVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.deleteTabInstAdmVO(sample);
    }
     */
    public void insertTabInstAdmVO(TabPreIwrVO sample) {
        insert("tabPreIwrDAO.insertTabInstAdmVO", sample);
    }
    
    public void updateTabInstAdmVO(TabPreIwrVO sample) {
        update("tabPreIwrDAO.updateTabInstAdmVO", sample);
    }
    public void deleteTabInstAdmVO(TabPreIwrVO sample) {
        delete("tabPreIwrDAO.deleteTabInstAdmVO", sample);
    }
    
    //public void insertTablawsuitVO(TabPreIwrVO sample) {
    //	insert("tabPreIwrDAO.insertTablawsuitVO", sample);    	
    //}
    
    public void updateTablawsuitVO(TabPreIwrVO sample) {
    	update("tabPreIwrDAO.updateTablawsuitVO", sample);    	
    }
    
    //public void deleteTablawsuitVO(TabPreIwrVO sample) {
//    	delete("tabPreIwrDAO.deleteTablawsuitVO", sample);    	
  //  }

}
