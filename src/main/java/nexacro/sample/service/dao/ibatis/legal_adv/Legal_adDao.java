package nexacro.sample.service.dao.ibatis.legal_adv;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.legal_adv.LegalAdListVo;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("legal_adDao")
public class Legal_adDao extends NexacroIbatisAbstractDAO{
	
	@SuppressWarnings("unchecked")
	public List<LegalAdListVo> selectLegaladList(Map<String, Object> selectMap) {
		return (List<LegalAdListVo>)list("legalAd.LegalAdDAO.selectLegalAdDetail", selectMap);
	}
	
	public int checkMgrAvailable(String mgr) {
		return (int)select("legalAd.LegalAdDAO.checkMgrAvailable", mgr);
	}
	
	public void saveLegalAdDetail(LegalAdListVo tempVo) {
		insert("legalAd.LegalAdDAO.insertLegalAdReq",tempVo);
	}

	public void updateLegalAdDetail(LegalAdListVo tempVo) {		
		update("legalAd.LegalAdDAO.updateLegalAdReq",tempVo);
	}

	public void deleteLegalAdDetail(LegalAdListVo tempVo) {		
		delete("legalAd.LegalAdDAO.deleteLegalAdCostList",tempVo);
		delete("legalAd.LegalAdDAO.deleteLegalAdList",tempVo);
	}
	
	public void saveLegalAdMandate(LegalAdListVo tempVo) {
		update("legalAd.LegalAdDAO.updateLegalAdMandateReq",tempVo);
	}
	
	@SuppressWarnings("unchecked")
	public List<LegalAdListVo> selectCost(Map<String, Object> selectMap) {
		return (List<LegalAdListVo>)list("legalAd.LegalAdDAO.selectCost", selectMap);
	}
	
	public void saveLegalAdRep(LegalAdListVo tempVo) {
		update("legalAd.LegalAdDAO.updateLegalAdRep",tempVo);
	}
	
	public void saveCost(LegalAdListVo tempVo) {
		insert("legalAd.LegalAdDAO.insertCost",tempVo);
	}

	public void updateCost(LegalAdListVo tempVo) {
		update("legalAd.LegalAdDAO.updateCost",tempVo);
	}

	public void deleteCost(LegalAdListVo tempVo) {
		delete("legalAd.LegalAdDAO.deleteCost",tempVo);
	}
}
