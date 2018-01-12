package nexacro.sample.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabMediationService;
import nexacro.sample.service.dao.ibatis.TabMediationDAO;
import nexacro.sample.vo.TabMediationVO;

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
@Service("mediationService")
public class TabMediatinImpl extends EgovAbstractServiceImpl implements TabMediationService {

	@Resource(name = "mediationDao")
	private TabMediationDAO mediationDao;

	// 기본사항조회
	@Override
	public List<TabMediationVO> mediationSelect(Map<String, Object> selectMap) {
		// TODO Auto-generated method stub
		return mediationDao.mediationSelect(selectMap);
	}

	// 원피고조회
	@Override
	public List<TabMediationVO> pladefSelect(Map<String, Object> selectMap) {
		// TODO Auto-generated method stub
		return mediationDao.pladefSelect(selectMap);
	}

	// 조정안조회
	@Override
	public List<TabMediationVO> bottomSearch(Map<String, Object> selectMap) {
		// TODO Auto-generated method stub
		return mediationDao.bottomSearch(selectMap);
	}

	// 저장, 수정, 삭제
	@Override
	public String mediationSave(List<TabMediationVO> MediationVO,
			String lawAdmNo, String instCode) {
		// TODO Auto-generated method stub
		String confirm = null;
		int size = MediationVO.size();
		
		for (int i = 0; i < size; i++) {
			TabMediationVO mediationVO = MediationVO.get(i);
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) mediationVO;
			
			if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
				mediationDao.mediationSave(mediationVO);
				confirm = "저장";
			} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
				Map<String, Object> detailMap = new HashMap<String, Object>();
				detailMap.put("lawsuitAdmNo", lawAdmNo);
				detailMap.put("instAdmCode", instCode);
				mediationDao.mediationUpdate(mediationVO);
				detailMap.clear();
				confirm = "수정";
			} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
				mediationDao.mediationDelect(mediationVO);
			}

		}
		return confirm;
	}
}
