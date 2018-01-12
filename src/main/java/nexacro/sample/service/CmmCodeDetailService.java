package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.CmmCodeDetailVO;


/**
 * Servlce Intreface
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public interface CmmCodeDetailService {

	
	
	
	List<CmmCodeDetailVO> selectCmmCodeDetailVOList(CmmCodeDetailVO searchVO);

    List<Map> selectCmmCodeDetailMapList(CmmCodeDetailVO searchVO);
    
    List<CmmCodeDetailVO> selectCmmCodeDetailPaging(CmmCodeDetailVO searchVO);
    
    int selectCmmCodeDetailCount(CmmCodeDetailVO searchVO);
    
    void modifyMultiCmmCodeDetailVO(List<CmmCodeDetailVO> modifyList);
    
    /*jsd*/
    /*List<CmmCodeDetailVO> getReasonList(Map<String, Object> codeMap);*/
    List<CmmCodeDetailVO> giveMeCode(Map<String, Object> codeMap);
}
