package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.com.InsaAcptVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("insaAcptDAO")
public class InsaAcptDAO extends NexacroIbatisAbstractDAO{

	// 사원 승인내역 조회
	public List<InsaAcptVO> selectInsaAcptList(Map params){
		return (List<InsaAcptVO>) list("com.InsaAcptDAO.selectinsaAcptList", params);
	}
	
	// 사원 승인내역 정보 저장
	public void saveInsaAcptList(Map params){
		update("com.InsaAcptDAO.updateInsaAcptList", params);
	}
	
}
