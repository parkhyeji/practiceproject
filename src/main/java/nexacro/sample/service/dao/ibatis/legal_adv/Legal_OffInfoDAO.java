package nexacro.sample.service.dao.ibatis.legal_adv;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.legal_adv.LegalOfficialInfoVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("Legal_OffInfoDAO")
public class Legal_OffInfoDAO extends NexacroIbatisAbstractDAO{
	
	//외부 법률 관계자 관리
	public List<LegalOfficialInfoVO> selectLgOffInfoList(Map<String, Object> map){
		return (List<LegalOfficialInfoVO>) list("legalOffInfo.Legal_OffInfoDAO.selectLgOffInfoList", map);
	}
	
	//외부 법률 관계자 추가
	public void insertLgofclList(LegalOfficialInfoVO vo){
		insert("legalOffInfo.Legal_OffInfoDAO.insertLgOfclList", vo);
	}
	
	//외부 법률 관계자 수정
	public void updateLgofclList(LegalOfficialInfoVO vo){
		update("legalOffInfo.Legal_OffInfoDAO.updateLgOfclList", vo);
	}
	
	//외부 법률 관계자 삭제
	public void deleteLgofclList(LegalOfficialInfoVO vo){
		delete("legalOffInfo.Legal_OffInfoDAO.deleteLgOfclList", vo);
	}
	
}
