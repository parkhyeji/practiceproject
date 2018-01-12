package nexacro.sample.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabAlesSueService;
import nexacro.sample.service.dao.ibatis.TabAlesSueDAO;
import nexacro.sample.vo.TabAlesSueVO;

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
@Service("ales_sueService")
public class TabAlesSueImpl extends EgovAbstractServiceImpl implements TabAlesSueService {

    @Resource(name ="ales_sueDao")
    private TabAlesSueDAO ales_sueDao;

    @Override
	public List<TabAlesSueVO> ales_sueSelect(Map<String, Object> selectMap) {
		return ales_sueDao.ales_sueSelect(selectMap);
	}
    
  
	//저장/수정
	@Override
	public String ales_sueSave(List<TabAlesSueVO> Ales_sueVO, String lawsuitAdmNo) {
		// TODO Auto-generated method stub
		String confirm = null;
		int size = Ales_sueVO.size();
		
		for(int i = 0; i < size; i++){
			TabAlesSueVO ales_sueVO = Ales_sueVO.get(i);
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) ales_sueVO;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				ales_sueDao.ales_sueSave(ales_sueVO);
				confirm = "저장";
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				ales_sueDao.ales_sueUpdate(ales_sueVO);
				confirm = "저장";
			}
		}
		return confirm;
	}



	

	
    
}
