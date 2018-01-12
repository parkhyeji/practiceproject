package nexacro.pdlaw.service;

import java.util.List;

import nexacro.sample.adm.vo.InsaVO;

/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
public interface InsaService {

    /**
     * Statements
     *
     * @param searchVo
     * @return
     */
    //List<GroupInsaVO> selectCodeGroupList(GroupInsaVO searchVo);

    /**
     * Statements
     *
     * @return
     */
    List<InsaVO> selectInsaList();

    /**
     * Statements
     *
     * @param modifyVOList
     */
    //void modifyCodeGroup(List<GroupCodeVO> modifyVOList);

    /**
     * Statements
     *
     * @param modifyVOList
     */
    void modifyInsa(List<InsaVO> modifyVOList);

}
