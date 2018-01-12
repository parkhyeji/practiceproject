package nexacro.sample.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabPreIwrService;
import nexacro.sample.service.dao.ibatis.TabPreIwrDAO;
import nexacro.sample.vo.TabPreIwrVO;
import nexacro.sample.vo.CmmCodeDetailVO;

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
@Service("tabPreIwrService")
public class TabPreIwrServiceImpl extends EgovAbstractServiceImpl implements TabPreIwrService {

    /**
     * TabPreIwrDAO class 선언 (TabPreIwrDAO) Class Injection)
     * (TabPreIwrDAO)tabPreIwrDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "tabPreIwrDAO")
    // Name 정의
    private TabPreIwrDAO tabPreIwrDAO;

    @Override
    public void modifyMultiTabPreIwrVO(List<TabPreIwrVO> modifyList) {

    	System.out.println("modifyMultiTabPreIwrVO ~");
    	
        int size = modifyList.size();
        System.out.println("modifyList.size();"+size);
        for (int i=0; i<size; i++) {
        	TabPreIwrVO sample = modifyList.get(i);
            if (sample instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sample;
                System.out.println("accessor.getRowType():"+accessor.getRowType());
                System.out.println("DataSet.ROW_TYPE_INSERTED:"+DataSet.ROW_TYPE_INSERTED);
                System.out.println("DataSet.ROW_TYPE_UPDATED:"+DataSet.ROW_TYPE_UPDATED);
                System.out.println("DataSet.ROW_TYPE_DELETED:"+DataSet.ROW_TYPE_DELETED);
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                    insertTabPreIwrVO(sample);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    updateTabPreIwrVO(sample);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                    deleteTabPreIwrVO(sample);
                }
            }
            
        }
    }
    
    @Override
    public void modifyMultiTabInstAdmVO(List<TabPreIwrVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	TabPreIwrVO sample = modifyList.get(i);
            if (sample instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sample;
                
                //if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                  //  insertTabInstAdmVO(sample);
                //}else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    updateTabInstAdmVO(sample);
                //}else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                   // deleteTabInstAdmVO(sample);
                //}
            }
            
        }
    }
    
    
    @Override
    public void modifyMultiTablawsuitOrgVO(List<TabPreIwrVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	TabPreIwrVO sample = modifyList.get(i);
            if (sample instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sample;
                
                //if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                  //  insertTabInstAdmVO(sample);
                //}else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    updateTablawsuitVO(sample);
                //}else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                   // deleteTabInstAdmVO(sample);
                //}
            }
            
        }
    }
    
    @Override
    public List<CmmCodeDetailVO> selectCmmVoList(CmmCodeDetailVO searchVO) {
        return tabPreIwrDAO.selectCmmVoList(searchVO);
    }
    
    @Override
    public List<TabPreIwrVO> selectTabInstAdmVOList(TabPreIwrVO searchVO) {
        return tabPreIwrDAO.selectTabInstAdmVoList(searchVO);
    }
    
    @Override
    public List<TabPreIwrVO> selectTabInstAdm2VOList(TabPreIwrVO searchVO) {
        return tabPreIwrDAO.selectTabInstAdmVo2List(searchVO);
    }
    
    @Override
    public List<TabPreIwrVO> selectTabInstAdm3VOList(TabPreIwrVO searchVO) {
        return tabPreIwrDAO.selectTabInstAdmVo3List(searchVO);
    }
    
    @Override
    public List<TabPreIwrVO> selectTabInstAdm4VOList(TabPreIwrVO searchVO) {
        return tabPreIwrDAO.selectTabInstAdmVo4List(searchVO);
    }
    
    @Override
    public List<TabPreIwrVO> selectTabInstAdm5VOList(TabPreIwrVO searchVO) {
        return tabPreIwrDAO.selectTabInstAdmVo5List(searchVO);
    }
    
    @Override
    public List<TabPreIwrVO> selectTabInstAdm6VOList(TabPreIwrVO searchVO) {
        return tabPreIwrDAO.selectTabInstAdmVo6List(searchVO);
    }
    
    @Override
    public List<TabPreIwrVO> selectTabInstAdm7VOList(TabPreIwrVO searchVO) {
        return tabPreIwrDAO.selectTabInstAdmVo7List(searchVO);
    }
    
    @Override
	public List<Map> selectTabInstAdmMapList(TabPreIwrVO searchVO) {
    	return tabPreIwrDAO.selectTabInstAdmMapList(searchVO);
	}
    
    
    @Override
    public List<TabPreIwrVO> selectTabPreIwrVOList(TabPreIwrVO searchVO) {
        return tabPreIwrDAO.selectTabPreIwrVoList(searchVO);
    }
    
    @Override
	public List<Map> selectTabPreIwrMapList(TabPreIwrVO searchVO) {
    	return tabPreIwrDAO.selectTabPreIwrMapList(searchVO);
	}
    
    @Override
    public List<TabPreIwrVO> selectTabPreIwrPaging(TabPreIwrVO searchVO) {
    	return tabPreIwrDAO.selectTabPreIwrPaging(searchVO);
    }

	@Override
	public int selectTabPreIwrCount(TabPreIwrVO searchVO) {
		return tabPreIwrDAO.selectTabPreIwrCount(searchVO);
	}
    


	public void insertTabPreIwrVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.insertTabPreIwrVO(sample);
    }
    
    public void updateTabPreIwrVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.updateTabPreIwrVO(sample);
    }
    
    public void deleteTabPreIwrVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.deleteTabPreIwrVO(sample);
    }
    
    public void insertTabInstAdmVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.insertTabInstAdmVO(sample);
    }
    
    public void updateTabInstAdmVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.updateTabInstAdmVO(sample);
    }
    
    public void deleteTabInstAdmVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.deleteTabInstAdmVO(sample);
    }
    
    //public void insertTablawsuitVO(TabPreIwrVO sample) {
    //	tabPreIwrDAO.insertTablawsuitVO(sample);
    //}
    
    public void updateTablawsuitVO(TabPreIwrVO sample) {
    	tabPreIwrDAO.updateTablawsuitVO(sample);
    }
    
    //public void deleteTablawsuitVO(TabPreIwrVO sample) {
    //	tabPreIwrDAO.deleteTablawsuitVO(sample);
    //}
}
