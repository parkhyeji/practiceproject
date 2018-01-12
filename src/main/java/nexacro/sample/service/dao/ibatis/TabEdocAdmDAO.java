package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;





import nexacro.sample.vo.TabEdocAdmVO;
import nexacro.sample.vo.TabLawsuitVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

/**
 * 서면을 위한 DAO Class
 *
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
@Repository("tabEdocAdmDAO")
public class TabEdocAdmDAO extends NexacroIbatisAbstractDAO {

	
    
    
    public List<TabEdocAdmVO> selectTabEdocAdmVoList(TabEdocAdmVO searchVO) {
    	return (List<TabEdocAdmVO>) list("tabEdocAdmDAO.selectTabEdocAdmVOList", searchVO);
    }
    
    public List<TabEdocAdmVO> selectTabEdocAdm2VoList(TabEdocAdmVO searchVO) {
    	return (List<TabEdocAdmVO>) list("tabEdocAdmDAO.selectTabEdocAdm2VOList", searchVO);
    }
    
    public List<Map> selectTabEdocAdmMapList(TabEdocAdmVO searchVO) {
    	return (List<Map>) list("tabEdocAdmDAO.selectTabEdocAdmMapList", searchVO);
    }

    public List<TabEdocAdmVO> selectTabEdocAdmPaging(TabEdocAdmVO searchVO) {
    	searchVO.setRecordCountPerPage(searchVO.getFirstIndex()+searchVO.getRecordCountPerPage());
    	return (List<TabEdocAdmVO>) list("tabEdocAdmDAO.selectTabEdocAdmPaging", searchVO);
    }
    
    public int selectTabEdocAdmCount(TabEdocAdmVO searchVO) {
		return (int) select("tabEdocAdmDAO.selectTabEdocAdmCount", searchVO);
	}
    
    public void insertTabEdocAdmVO(TabEdocAdmVO sample) {
        insert("tabEdocAdmDAO.insertTabEdocAdmVO", sample);
    }
    
    public void updateTabEdocAdmVO(TabEdocAdmVO sample) {
        update("tabEdocAdmDAO.updateTabEdocAdmVO", sample);
    }
    public void deleteTabEdocAdmVO(TabEdocAdmVO sample) {
        delete("tabEdocAdmDAO.deleteTabEdocAdmVO", sample);
    }
    
    public List<TabLawsuitVO> selectTabLawsuitVOList(TabLawsuitVO searchVO) {
    	return (List<TabLawsuitVO>) list("tabEdocAdmDAO.selectTabLawsuitVOList", searchVO);
    }
    
    public List<Map> selectTabLawsuitMapList(TabLawsuitVO searchVO) {
    	return (List<Map>) list("tabEdocAdmDAO.selectTabLawsuitMapList", searchVO);
    }

    public List<TabLawsuitVO> selectTabLawsuitPaging(TabLawsuitVO searchVO) {
    	searchVO.setRecordCountPerPage(searchVO.getFirstIndex()+searchVO.getRecordCountPerPage());
    	return (List<TabLawsuitVO>) list("tabEdocAdmDAO.selectTabLawsuitPaging", searchVO);
    }

}
