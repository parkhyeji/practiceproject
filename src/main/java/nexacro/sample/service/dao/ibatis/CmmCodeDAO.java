package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.com.CmmCodeVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("cmmCodeDAO")
public class CmmCodeDAO extends NexacroIbatisAbstractDAO {
	
	// 온로드 시 호출 서비스(분류코드 검색)
	public List<CmmCodeVO> selectCode(){
		return (List<CmmCodeVO>)list("cmmCode.selectCode");
	}
	
	// 온로드 시 호출 서비스(부모코드 검색)
	public List<CmmCodeVO> parentCode(){
		return (List<CmmCodeVO>)list("cmmCode.parentCode");
	}
	
	// 검색
	public List<CmmCodeVO> selectCodeList(CmmCodeVO cmmCodeVO){
		return (List<CmmCodeVO>)list("cmmCode.selectCodeList", cmmCodeVO);
	}
	
	// 저장
	public void insertCmmCode(CmmCodeVO cmmCodeVO){
		insert("cmmCode.insertCmmCode", cmmCodeVO);
	}
	
	// 수정
	public void updateCmmCode(Map<String, Object> cmmCodeMap){
		update("cmmCode.updateCmmCode", cmmCodeMap);
	}
	
	// 삭제
	public void deleteCmmCode(CmmCodeVO cmmCodeVO){
		delete("cmmCode.deleteCmmCode", cmmCodeVO);
	}
	
}
