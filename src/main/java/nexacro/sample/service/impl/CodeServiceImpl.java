package nexacro.sample.service.impl;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.annotation.Resource;

import nexacro.sample.service.CodeService;
import nexacro.sample.service.dao.ibatis.CodeCallDAO;
import nexacro.sample.service.dao.ibatis.CodeDAO;
import nexacro.sample.vo.CodeVO;
import nexacro.sample.vo.GroupCodeVO;
import nexacro.sample.vo.com.ComCodeVO;
import nexacro.sample.vo.com.DetailCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * Test를 위한 ServiceImpl Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Service("codeService")
public class CodeServiceImpl extends EgovAbstractServiceImpl implements CodeService {

    @Resource(name = "codeDAO")
    private CodeDAO codeDAO;

    @Override
    public List<GroupCodeVO> selectCodeGroupList(GroupCodeVO searchVo) {
        return codeDAO.selectCodeGroupList(searchVo);
    }

    @Override
    public List<CodeVO> selectCodeList() {
        return codeDAO.selectCodeList();
    }

    @Override
    public void modifyCodeGroup(List<GroupCodeVO> modifyVOList) {

        int size = modifyVOList.size();
        for (int i=0; i<size; i++) {
            GroupCodeVO group = modifyVOList.get(i);
            if (group instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) group;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                    insertGroupCodeVO(group);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    updateGroupCodeVO(group);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                    deleteGroupCodeVO(group);
                }
            }
            
        }
    }

    public void insertGroupCodeVO(GroupCodeVO groupCodeVO) {
        codeDAO.insertGroupCodeVO(groupCodeVO);
    }
    
    public void updateGroupCodeVO(GroupCodeVO groupCodeVO) {
        codeDAO.updateGroupCodeVO(groupCodeVO);
    }
    
    public void deleteGroupCodeVO(GroupCodeVO groupCodeVO) {
        codeDAO.deleteGroupCodeVO(groupCodeVO);
    }
    
    @Override
    public void modifyCode(List<CodeVO> modifyVOList) {
        int size = modifyVOList.size();
        for (int i=0; i<size; i++) {
            CodeVO code = modifyVOList.get(i);
            if (code instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) code;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                    insertCodeVO(code);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    updateCodeVO(code);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                    deleteCodeVO(code);
                }
            }
            
        }
    }

    public void insertCodeVO(CodeVO codeVO) {
        codeDAO.insertCodeVO(codeVO);
    }
    
    public void updateCodeVO(CodeVO codeVO) {
        codeDAO.updateCodeVO(codeVO);
    }
    
    public void deleteCodeVO(CodeVO codeVO) {
        codeDAO.deleteCodeVO(codeVO);
    }

	@Override
	public List<CodeVO> selectCodeList(Map<String, Object> codeMap) {
		// TODO Auto-generated method stub
		return codeDAO.selectCodeList(codeMap);
	}
	@Override
	public List<ComCodeVO> selectCode(ComCodeVO comCodeVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComCodeVO> detailCode(Map<String, String> switchMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editCode(List<ComCodeVO> comCodeVO) {
		// TODO Auto-generated method stub
		return null;
	}

	// 상세코드 분류코드 가져오기
	@Override
	public List<DetailCodeVO> selectDetailCode() {
		return codeDAO.selectDetailCode();
	}
	
	// 분류코드에 따른 상세코드 가져오기
		@Override
		public List<DetailCodeVO> selectDetailList(DetailCodeVO detailCodeVO) {
			return codeDAO.selectDetailList(detailCodeVO);
		}
		
		// 상세코드 입력, 수정, 삭제
		@Override
		public String editDetailCode(List<DetailCodeVO> detailCodeVO, String updateId) {
			
			String confirm = null;
			
			for(int i = 0; i < detailCodeVO.size(); i++){
				DetailCodeVO detailCode = detailCodeVO.get(i);
				
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) detailCode;
				
				if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
					codeDAO.insertDetailCode(detailCode);
					confirm = "저장";
				}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
					Map<String, Object> detailCodeMap = new HashMap<String, Object>();
					detailCodeMap.put("detailCodeVO", detailCode);
					detailCodeMap.put("updateId", updateId);
					codeDAO.updateDetailCode(detailCodeMap);
					detailCodeMap.clear();
					confirm = "수정";
				}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
					codeDAO.deleteDetailCode(detailCode);
				}
				
			}
			
			return confirm;
		}
		
}
