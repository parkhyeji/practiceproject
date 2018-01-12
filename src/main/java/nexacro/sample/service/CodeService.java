package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.CodeVO;
import nexacro.sample.vo.GroupCodeVO;
import nexacro.sample.vo.com.ComCodeVO;
import nexacro.sample.vo.com.DetailCodeVO;

/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
public interface CodeService {

    /**
     * Statements
     *
     * @param searchVo
     * @return
     */
    List<GroupCodeVO> selectCodeGroupList(GroupCodeVO searchVo);

    /**
     * Statements
     *
     * @return
     */
    List<CodeVO> selectCodeList();

    /**
     * Statements
     *
     * @param modifyVOList
     */
    void modifyCodeGroup(List<GroupCodeVO> modifyVOList);

    /**
     * Statements
     *
     * @param modifyVOList
     */
    void modifyCode(List<CodeVO> modifyVOList);
    
 // 코드마스터 전체내역 조회하기
 	List<ComCodeVO> selectCode(ComCodeVO comCodeVO);
 	
 	// 분류별 코드번호 또는 코드네임 가져오기
 	List<ComCodeVO> detailCode(Map<String, String> switchMap);
 	
 	// 코드마스터 입력/수정/삭제
 	String editCode(List<ComCodeVO> comCodeVO);
 	
 	// 상세코드 분류코드 조회하기
 	List<DetailCodeVO> selectDetailCode();
 	
 	// 분류코드에 따른 상세코드 가져오기
 	List<DetailCodeVO> selectDetailList(DetailCodeVO detailCodeVO);
 	
 	// 상세코드 입력, 수정, 삭제
 	String editDetailCode(List<DetailCodeVO> detailCodeVO, String updateId);

 	//공통코드검색
	List<CodeVO> selectCodeList(Map<String, Object> codeMap);
	

}
