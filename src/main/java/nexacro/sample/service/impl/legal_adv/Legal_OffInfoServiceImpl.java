package nexacro.sample.service.impl.legal_adv;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import nexacro.sample.service.dao.ibatis.legal_adv.Legal_OffInfoDAO;
import nexacro.sample.service.legal_adv.Legal_OffInfoService;
import nexacro.sample.vo.depo.DepoVO;
import nexacro.sample.vo.legal_adv.LegalOfficialInfoVO;

@Service("Legal_OffInfoService")
public class Legal_OffInfoServiceImpl extends EgovAbstractServiceImpl implements Legal_OffInfoService{

	@Resource(name="Legal_OffInfoDAO")
	private Legal_OffInfoDAO dao;
	
	@Override
	public List<LegalOfficialInfoVO> selectList(Map<String, Object> map) {
		return dao.selectLgOffInfoList(map);
	}

	@Override
	public String saveLgOfclList(List<LegalOfficialInfoVO> ofclVOs) {
		String saveKey = null;
		
		int size = ofclVOs.size();
		
		for(int i = 0 ; i<size ; i++){
			LegalOfficialInfoVO ofclVO  = ofclVOs.get(i);
			
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) ofclVO;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				dao.insertLgofclList(ofclVO);
				saveKey = "저장";
			}
			else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				dao.updateLgofclList(ofclVO);
				saveKey = "수정";
			}
			else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				dao.deleteLgofclList(ofclVO);
			} 
			
		}
		
		return saveKey;
	}

}
