package nexacro.sample.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabEdocAdmService;
import nexacro.sample.service.dao.ibatis.TabEdocAdmDAO;
import nexacro.sample.vo.TabEdocAdmVO;
import nexacro.sample.vo.TabLawsuitVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * Test를 위한 ServiceImpl Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Service("tabEdocAdmService")
public class TabEdocAdmServiceImpl extends EgovAbstractServiceImpl implements TabEdocAdmService {

    /**
     * SampleDAO class 선언 (SampleDAO) Class Injection)
     * (SampleDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "tabEdocAdmDAO")
    // Name 정의
    private TabEdocAdmDAO tabEdocAdmDAO;

    @Override
    public void modifyMultiTabEdocAdmVO(List<TabEdocAdmVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	TabEdocAdmVO sample = modifyList.get(i);
            if (sample instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sample;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                    insertTabEdocAdmVO(sample);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    updateTabEdocAdmVO(sample);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                    deleteTabEdocAdmVO(sample);
                }
            }
            
        }
    }
    
    @Override
    public List<TabLawsuitVO> selectTabLawsuitVOList(TabLawsuitVO searchVO){
    	return tabEdocAdmDAO.selectTabLawsuitVOList(searchVO);
    }

    @Override
    public List<Map> selectTabLawsuitMapList(TabLawsuitVO searchVO){
    	return tabEdocAdmDAO.selectTabLawsuitMapList(searchVO);
    }
    
    @Override
    public List<TabLawsuitVO> selectTabLawsuitPaging(TabLawsuitVO searchVO){
    	return tabEdocAdmDAO.selectTabLawsuitPaging(searchVO);
    }
  	
    
    @Override
    public List<TabEdocAdmVO> selectTabEdocAdmVOList(TabEdocAdmVO searchVO) {
        return tabEdocAdmDAO.selectTabEdocAdmVoList(searchVO);
    }
    
    @Override
    public List<TabEdocAdmVO> selectTabEdocAdm2VOList(TabEdocAdmVO searchVO) {
        return tabEdocAdmDAO.selectTabEdocAdm2VoList(searchVO);
    }
    
    @Override
	public List<Map> selectTabEdocAdmMapList(TabEdocAdmVO searchVO) {
    	return tabEdocAdmDAO.selectTabEdocAdmMapList(searchVO);
	}
    
    @Override
    public List<TabEdocAdmVO> selectTabEdocAdmPaging(TabEdocAdmVO searchVO) {
    	return tabEdocAdmDAO.selectTabEdocAdmPaging(searchVO);
    }

	@Override
	public int selectTabEdocAdmCount(TabEdocAdmVO searchVO) {
		return tabEdocAdmDAO.selectTabEdocAdmCount(searchVO);
	}
	
	
    
    public void insertTabEdocAdmVO(TabEdocAdmVO sample) {
    	tabEdocAdmDAO.insertTabEdocAdmVO(sample);
    }
    
    public void updateTabEdocAdmVO(TabEdocAdmVO sample) {
    	tabEdocAdmDAO.updateTabEdocAdmVO(sample);
    }
    
    public void deleteTabEdocAdmVO(TabEdocAdmVO sample) {
    	tabEdocAdmDAO.deleteTabEdocAdmVO(sample);
    }
    
    
    
    
    
}
