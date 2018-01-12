package nexacro.sample.service.depo;

import java.util.List;

import nexacro.sample.vo.depo.DepoVO;
import nexacro.sample.vo.depo.MgrInfoVO;

public interface DepoService {
	
	//공탁접수목록 조회(검색도 가능)
	List<DepoVO> selectDepoList(DepoVO vo) throws Exception;
	//공탁접수목록 중 상세조회
	List<DepoVO> selectOneDepo(DepoVO vo) throws Exception;
	//관리자 목록조회
	List<MgrInfoVO> selectMgrInfoVOs(MgrInfoVO vo) throws Exception;
	
	//저장버튼 입력시 접수,수정 / 삭제버튼 입력시 삭제
	String saveDepo(List<DepoVO> depoVO) throws Exception;
	 
	
	/*//공탁접수
	int insertDepo(DepoVO vo)throws Exception;
	//공탁수정
	int updateDepo(DepoVO vo)throws Exception;
	//공탁삭제
	int deleteDepo(DepoVO vo)throws Exception;*/
	
}
