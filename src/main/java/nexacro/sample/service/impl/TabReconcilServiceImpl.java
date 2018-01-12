package nexacro.sample.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabReconcilService;
import nexacro.sample.service.dao.ibatis.TabReconcilDAO;
import nexacro.sample.vo.TabReconcilVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * 준비서면를 위한 ServiceImpl Sample Class
 *
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
@Service("tabReconcilService")
public class TabReconcilServiceImpl extends EgovAbstractServiceImpl implements TabReconcilService {

    /**
     * TabPreIwrDAO class 선언 (TabPreIwrDAO) Class Injection)
     * (TabPreIwrDAO)tabPreIwrDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "tabReconcilDAO")
    // Name 정의
    private TabReconcilDAO tabReconcilDAO;

    @Override
    public void modifyMultiTabReconcilVO(List<TabReconcilVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	TabReconcilVO sample = modifyList.get(i);
            if (sample instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sample;
                System.out.println("accessor.getRowType();"+accessor.getRowType());
                /*
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	System.out.println("insertTabReconcilVO");
                    insertTabReconcilVO(sample);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	System.out.println("updateTabReconcilVO");
                    updateTabReconcilVO(sample);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                    deleteTabReconcilVO(sample);
                }
                */
                updateTabReconcil2VO(sample);
            }
            
        }
    }
    
    //modifyMultiTabPladefOrgVO
    @Override
    public void modifyMultiTabPladefOrgVO(List<TabReconcilVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	TabReconcilVO sample = modifyList.get(i);
            if (sample instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sample;
                
                //if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){                	
                //    insertTabReconcilVO(sample);
                //}else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    updateTabPladefVO(sample);
                //}else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                //    deleteTabReconcilVO(sample);
                //}
            }
            
        }
    }
    //selectTabPladefVOList
    @Override
    public List<TabReconcilVO> selectTabPladefVOList(TabReconcilVO searchVO) {
        return tabReconcilDAO.selectTabPladefVOList(searchVO);
    }
    
    @Override
    public List<TabReconcilVO> selectTabReconcilVOList(TabReconcilVO searchVO) {
        return tabReconcilDAO.selectTabReconcilVoList(searchVO);
    }
    
    @Override
    public List<TabReconcilVO> selectTabReconcil2VOList(TabReconcilVO searchVO) {
        return tabReconcilDAO.selectTabReconcil2VoList(searchVO);
    }
    
    @Override
    public List<TabReconcilVO> selectTabReconcil3VOList(TabReconcilVO searchVO) {
        return tabReconcilDAO.selectTabReconcil3VOList(searchVO);
    }
    
    @Override
	public List<Map> selectTabReconcilMapList(TabReconcilVO searchVO) {
    	return tabReconcilDAO.selectTabReconcilMapList(searchVO);
	}
    
    @Override
    public List<TabReconcilVO> selectTabReconcilPaging(TabReconcilVO searchVO) {
    	return tabReconcilDAO.selectTabReconcilPaging(searchVO);
    }

	@Override
	public int selectTabReconcilCount(TabReconcilVO searchVO) {
		return tabReconcilDAO.selectTabReconcilCount(searchVO);
	}
    
    public void insertTabReconcilVO(TabReconcilVO sample) {
    	tabReconcilDAO.insertTabReconcilVO(sample);
    }
    
    public void updateTabReconcilVO(TabReconcilVO sample) {
    	tabReconcilDAO.updateTabReconcilVO(sample);
    }
    
    public void updateTabReconcil2VO(TabReconcilVO sample) {
    	tabReconcilDAO.updateTabReconcil2VO(sample);
    }
    
    public void deleteTabReconcilVO(TabReconcilVO sample) {
    	tabReconcilDAO.deleteTabReconcilVO(sample);
    }
    //updateTabPladefVO
    public void updateTabPladefVO(TabReconcilVO sample) {
    	tabReconcilDAO.updateTabPladefVO(sample);
    }
}
