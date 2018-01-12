package nexacro.sample.service.impl.legal_adv;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.legal_adv.Legal_adDao;
import nexacro.sample.service.legal_adv.Legal_adService;
import nexacro.sample.vo.legal_adv.LegalAdListVo;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("legal_adService")
public class Legal_adServiceImpl extends EgovAbstractServiceImpl implements Legal_adService {
	
	@Resource(name="legal_adDao")
	private Legal_adDao legal_addao;
	
	@Override
	public List<LegalAdListVo> selectLegaladList(Map<String, Object> selectMap) {
		return legal_addao.selectLegaladList(selectMap);
	}

	@Override
	public String saveLegalAdDetail(List<LegalAdListVo> legalAdListVo) {
		String confirm = null;
		int size = legalAdListVo.size();
		
		for(int i=0; i<size; i++){
			LegalAdListVo tempVo = legalAdListVo.get(i);
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) tempVo;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				legal_addao.saveLegalAdDetail(tempVo);
				confirm = "저장,"+tempVo.getLegaladvLawAdvReqNo();
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				legal_addao.updateLegalAdDetail(tempVo);
				confirm = "수정,"+tempVo.getLegaladvLawAdvReqNo();
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				legal_addao.deleteLegalAdDetail(tempVo);
			}
		}
		return confirm;
	}
	
	@Override
	public int checkMgrAvailable(String mgr) {
		return legal_addao.checkMgrAvailable(mgr);
	}

	@Override
	public String saveLegalAdMandate(List<LegalAdListVo> legalAdListVo) {
		int size = legalAdListVo.size();
		String confirm = null;	
		
		for(int i=0; i<size; i++){
			LegalAdListVo tempVo = legalAdListVo.get(i);
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) tempVo;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				legal_addao.saveLegalAdMandate(tempVo);
				confirm = tempVo.getLegaladvLawAdvReqNo();
			}
		}	
		return confirm;
	}

	@Override
	public List<LegalAdListVo> selectCost(Map<String, Object> selectMap) {
		return legal_addao.selectCost(selectMap);
	}

	@Override
	public void saveLegalAdRep(List<LegalAdListVo> legalAdListVo) {
		int size = legalAdListVo.size();
		 
		for(int i=0; i<size; i++){
			LegalAdListVo tempVo = legalAdListVo.get(i);
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) tempVo;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				legal_addao.saveLegalAdRep(tempVo);
				
			}
		}	
	}

	@Override
	public void saveCost(List<LegalAdListVo> legalAdListVo) {
		int size = legalAdListVo.size();
		 
		for(int i=0; i<size; i++){
			LegalAdListVo tempVo = legalAdListVo.get(i);
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) tempVo;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){				
				legal_addao.saveCost(tempVo);
				
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				legal_addao.updateCost(tempVo);
				
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				legal_addao.deleteCost(tempVo);
			}
		}	
	}
}
