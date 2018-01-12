package nexacro.sample.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.CmmCodeDetailService;
import nexacro.sample.service.dao.ibatis.CmmCodeDetailDAO;
import nexacro.sample.vo.CmmCodeDetailVO;


import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * ServiceImpl Sample Class
 *
 * @author shin wc
 * @since 10.24.2017
 * @version 1.0
 * @see
 */
@Service("cmmCodeDetailService")
public class CmmCodeDetailServiceImpl extends EgovAbstractServiceImpl implements CmmCodeDetailService {

    /**
     * SampleDAO class 선언 (SampleDAO) Class Injection)
     * (SampleDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "cmmCodeDetailDAO")
    // Name 정의
    private CmmCodeDetailDAO cmmCodeDetailDAO;

    @Override
    public void modifyMultiCmmCodeDetailVO(List<CmmCodeDetailVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	CmmCodeDetailVO sample = modifyList.get(i);
            if (sample instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sample;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                    insertCmmCodeDetailVO(sample);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    updateCmmCodeDetailVO(sample);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                    deleteCmmCodeDetailVO(sample);
                }
            }
            
        }
    }
    
    
    
    @Override
    public List<CmmCodeDetailVO> selectCmmCodeDetailVOList(CmmCodeDetailVO searchVO) {
        return cmmCodeDetailDAO.selectCmmCodeDetailVOList(searchVO);
    }
    
    @Override
	public List<Map> selectCmmCodeDetailMapList(CmmCodeDetailVO searchVO) {
    	return cmmCodeDetailDAO.selectCmmCodeDetailMapList(searchVO);
	}
    
    @Override
    public List<CmmCodeDetailVO> selectCmmCodeDetailPaging(CmmCodeDetailVO searchVO) {
    	return cmmCodeDetailDAO.selectCmmCodeDetailPaging(searchVO);
    }

	@Override
	public int selectCmmCodeDetailCount(CmmCodeDetailVO searchVO) {
		return cmmCodeDetailDAO.selectCmmCodeDetailCount(searchVO);
	}
	
	
    
    public void insertCmmCodeDetailVO(CmmCodeDetailVO sample) {
    	cmmCodeDetailDAO.insertCmmCodeDetailVO(sample);
    }
    
    public void updateCmmCodeDetailVO(CmmCodeDetailVO sample) {
    	cmmCodeDetailDAO.updateCmmCodeDetailVO(sample);
    }
    
    public void deleteCmmCodeDetailVO(CmmCodeDetailVO sample) {
    	cmmCodeDetailDAO.deleteCmmCodeDetailVO(sample);
    }
    
    
    /*jsd*/
    /*public List<CmmCodeDetailVO> getReasonList(Map<String, Object> codeMap) {
    	// TODO Auto-generated method stub
    	return cmmCodeDetailDAO.getReasonList(codeMap);
    }*/
    
    @Override
    public List<CmmCodeDetailVO> giveMeCode(Map<String, Object> codeMap) {
    	// TODO Auto-generated method stub
    	return cmmCodeDetailDAO.giveMeCode(codeMap);
    }
    
    
}
