package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;



import nexacro.sample.vo.CmmCodeDetailVO;

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
@Repository("cmmCodeDetailDAO")
public class CmmCodeDetailDAO extends NexacroIbatisAbstractDAO {

	
    
    
    public List<CmmCodeDetailVO> selectCmmCodeDetailVOList(CmmCodeDetailVO searchVO) {
    	return (List<CmmCodeDetailVO>) list("cmmCodeDetailDAO.selectCmmCodeDetailVOList", searchVO);
    }
    
    public List<Map> selectCmmCodeDetailMapList(CmmCodeDetailVO searchVO) {
    	return (List<Map>) list("cmmCodeDetailDAO.selectCmmCodeDetailMapList", searchVO);
    }

    public List<CmmCodeDetailVO> selectCmmCodeDetailPaging(CmmCodeDetailVO searchVO) {
    	searchVO.setRecordCountPerPage(searchVO.getFirstIndex()+searchVO.getRecordCountPerPage());
    	return (List<CmmCodeDetailVO>) list("cmmCodeDetailDAO.selectCmmCodeDetailPaging", searchVO);
    }
    
    public int selectCmmCodeDetailCount(CmmCodeDetailVO searchVO) {
		return (int) select("cmmCodeDetailDAO.selectCmmCodeDetailCount", searchVO);
	}
    
    public void insertCmmCodeDetailVO(CmmCodeDetailVO sample) {
        insert("cmmCodeDetailDAO.insertCmmCodeDetailVO", sample);
    }
    
    public void updateCmmCodeDetailVO(CmmCodeDetailVO sample) {
        update("cmmCodeDetailDAO.updateCmmCodeDetailVO", sample);
    }
    public void deleteCmmCodeDetailVO(CmmCodeDetailVO sample) {
        delete("cmmCodeDetailDAO.deleteCmmCodeDetailVO", sample);
    }
    
    /*jsd*/
    /*public List<CmmCodeDetailVO> getReasonList(Map<String, Object> codeMap){
    	return (List<CmmCodeDetailVO>) list("cmmCodeDetailDAO.selectCodeList", codeMap);
    }*/
    /*jsd*/
    public List<CmmCodeDetailVO> giveMeCode(Map<String, Object> codeMap){
    	return (List<CmmCodeDetailVO>) list("cmmCodeDetailDAO.giveMeCode", codeMap);
    }

}
