package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabEdocAdmVO;
import nexacro.sample.vo.TabLawsuitVO;

/**
 * 서면를 위한 Servlce Intreface
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public interface TabEdocAdmService {

	
	List<TabLawsuitVO> selectTabLawsuitVOList(TabLawsuitVO searchVO);

    List<Map> selectTabLawsuitMapList(TabLawsuitVO searchVO);
    
    List<TabLawsuitVO> selectTabLawsuitPaging(TabLawsuitVO searchVO);
	
	List<TabEdocAdmVO> selectTabEdocAdmVOList(TabEdocAdmVO searchVO);
	
	List<TabEdocAdmVO> selectTabEdocAdm2VOList(TabEdocAdmVO searchVO);

    List<Map> selectTabEdocAdmMapList(TabEdocAdmVO searchVO);
    
    List<TabEdocAdmVO> selectTabEdocAdmPaging(TabEdocAdmVO searchVO);
    
    int selectTabEdocAdmCount(TabEdocAdmVO searchVO);
    
    void modifyMultiTabEdocAdmVO(List<TabEdocAdmVO> modifyList);
}
