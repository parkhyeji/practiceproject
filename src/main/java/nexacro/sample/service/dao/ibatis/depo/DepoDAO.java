package nexacro.sample.service.dao.ibatis.depo;

import java.util.List;

import nexacro.sample.vo.depo.DepoVO;
import nexacro.sample.vo.depo.MgrInfoVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("DepoDAO")
public class DepoDAO extends NexacroIbatisAbstractDAO{

	//공탁접수목록 조회
	public List<DepoVO> selectDepoList(DepoVO depoVO){
		return (List<DepoVO>) list("depo.DepoDAO.selectDepoList",depoVO);
	}
	
	//공탁상세조회
	public List<DepoVO> selectDepoOne(DepoVO depoVO){
		return (List<DepoVO>)  list("depo.DepoDAO.selectDepoOne",depoVO);
	}
	
	//관리자조회
	public List<MgrInfoVO> selectMgrList(MgrInfoVO infoVO){
		return (List<MgrInfoVO>)  list("depo.DepoDAO.selectMgrList",infoVO);
	}
	
	/*공탁정보 저장*/
	//모든 정보 저장
	@SuppressWarnings("rawtypes")
	public void insertAllinfo(DepoVO depoVO){
		insert("depo.DepoDAO.insertAlldepoInfo", depoVO);
	}
	
	//일부 정보만 저장
	public void insertDepoInfo(DepoVO depoVO){
		insert("depo.DepoDAO.insertdepo", depoVO);
	}
	
	//공탁정보 수정
	public void updateDepoInfo(DepoVO depoVO){
		update("depo.DepoDAO.updatedepo", depoVO);
	}
	//공탁담당자 정보 수정
	public void updateDepoMgr(DepoVO depoVO){
		update("depo.DepoDAO,updatedepomgr", depoVO);
	}
	
	//공탁정보 삭제
	public void deleteDepoInfo(DepoVO depoVO){
		delete("depo.DepoDAO.deletedepo", depoVO); 
	}
	
}
