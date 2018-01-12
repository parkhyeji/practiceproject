package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.CodeVO;
import nexacro.sample.vo.GroupCodeVO;
import nexacro.sample.vo.com.DetailCodeVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

/**
 * Test를 위한 DAO Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Repository("codeDAO")
public class CodeDAO extends NexacroIbatisAbstractDAO {

    public List<GroupCodeVO> selectCodeGroupList(GroupCodeVO searchVO) {
        return (List<GroupCodeVO>) list("codeDAO.selectCodeGroupList", searchVO);
    }

    public List<CodeVO> selectCodeList() {
        return (List<CodeVO>) list("codeDAO.selectCodeList", null);
    }

    public void insertGroupCodeVO(GroupCodeVO groupCodeVO) {
        insert("codeDAO.insertGroupCode", groupCodeVO);
    }

    public void updateGroupCodeVO(GroupCodeVO groupCodeVO) {
        update("codeDAO.updateGroupCode", groupCodeVO);
    }

    public void deleteGroupCodeVO(GroupCodeVO groupCodeVO) {
        delete("codeDAO.deleteGroupCode", groupCodeVO);
    }
    
    public void insertCodeVO(CodeVO codeVO) {
        insert("codeDAO.insertCode", codeVO);
    }

    public void updateCodeVO(CodeVO codeVO) {
        update("codeDAO.updateCode", codeVO);
    }

    public void deleteCodeVO(CodeVO codeVO) {
        delete("codeDAO.deleteCode", codeVO);
    }
    
	// 상세코드 분류코드 가져오기
	public List<DetailCodeVO> selectDetailCode(){
		return (List<DetailCodeVO>)list("common.selectDetailCode");
	}
	// 분류코드에 따른 상세코드 가져오기
	public List<DetailCodeVO> selectDetailList(DetailCodeVO detailCodeVO){
		return (List<DetailCodeVO>)list("common.selectDetailList", detailCodeVO);
	}
	
	// 상세코드 삽입
	public void insertDetailCode(DetailCodeVO detailCodeVO){
		insert("common.insertDetailCode", detailCodeVO);
	}
	
	// 상세코드 수정
	public void updateDetailCode(Map<String, Object> detailCodeMap){
		update("common.updateDetailCode", detailCodeMap);
	}
	
	// 상세코드 삭제
	public void deleteDetailCode(DetailCodeVO detailCodeVO){
		delete("common.deleteDetailCode", detailCodeVO);
	}
    public List<CodeVO> selectCodeList(Map<String, Object> codeMap) {
        return (List<CodeVO>) list("code.codeDAO.selectCodeList", codeMap);
    }
    
}
