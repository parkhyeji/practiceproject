package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabPreIwrVO;
import nexacro.sample.vo.CmmCodeDetailVO;

/**
 * 준비서면을 위한 Servlce TabPreIwr Intreface
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public interface TabPreIwrService {

	List<CmmCodeDetailVO> selectCmmVoList(CmmCodeDetailVO searchVO);
	
	List<TabPreIwrVO> selectTabInstAdmVOList(TabPreIwrVO searchVO);
	
	List<TabPreIwrVO> selectTabInstAdm2VOList(TabPreIwrVO searchVO);
	
	List<TabPreIwrVO> selectTabInstAdm3VOList(TabPreIwrVO searchVO);
	
	List<TabPreIwrVO> selectTabInstAdm4VOList(TabPreIwrVO searchVO);
	
	List<TabPreIwrVO> selectTabInstAdm5VOList(TabPreIwrVO searchVO);
	
	List<TabPreIwrVO> selectTabInstAdm6VOList(TabPreIwrVO searchVO);
	
	List<TabPreIwrVO> selectTabInstAdm7VOList(TabPreIwrVO searchVO);

    List<Map> selectTabInstAdmMapList(TabPreIwrVO searchVO);
    
    List<TabPreIwrVO> selectTabPreIwrVOList(TabPreIwrVO searchVO);

    List<Map> selectTabPreIwrMapList(TabPreIwrVO searchVO);
    
    List<TabPreIwrVO> selectTabPreIwrPaging(TabPreIwrVO searchVO);
    
    int selectTabPreIwrCount(TabPreIwrVO searchVO);
    
    void modifyMultiTabPreIwrVO(List<TabPreIwrVO> modifyList);
    
    //심급엡데이트
    void modifyMultiTabInstAdmVO(List<TabPreIwrVO> modifyList);
    
  //소송엡데이트
    void modifyMultiTablawsuitOrgVO(List<TabPreIwrVO> modifyList);

}
