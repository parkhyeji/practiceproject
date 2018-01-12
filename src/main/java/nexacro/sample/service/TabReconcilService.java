package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabReconcilVO;

/**
 * 재판와화애을 위한 Servlce Intreface
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public interface TabReconcilService {

	//원피고
	List<TabReconcilVO> selectTabPladefVOList(TabReconcilVO searchVO);
	//재판외화해
    List<TabReconcilVO> selectTabReconcilVOList(TabReconcilVO searchVO);
    
    List<TabReconcilVO> selectTabReconcil2VOList(TabReconcilVO searchVO);
    
    List<TabReconcilVO> selectTabReconcil3VOList(TabReconcilVO searchVO);

    List<Map> selectTabReconcilMapList(TabReconcilVO searchVO);
    
    List<TabReconcilVO> selectTabReconcilPaging(TabReconcilVO searchVO);
    
    int selectTabReconcilCount(TabReconcilVO searchVO);
    
    void modifyMultiTabReconcilVO(List<TabReconcilVO> modifyList);
    
    void modifyMultiTabPladefOrgVO(List<TabReconcilVO> modifyList);
    
    void deleteTabReconcilVO(TabReconcilVO searchVO);

}
