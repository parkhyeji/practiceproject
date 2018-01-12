package nexacro.sample.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.CmmCodeService;
import nexacro.sample.service.dao.ibatis.CmmCodeDAO;
import nexacro.sample.vo.com.CmmCodeVO;
import nexacro.sample.vo.com.DetailCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("cmmCodeService")
public class CmmCodeServiceImpl extends EgovAbstractServiceImpl implements CmmCodeService {

	@Resource(name="cmmCodeDAO")
	private CmmCodeDAO cmmCodeDAO;
	
	
	// 온로드 시 호출 서비스(분류코드 및 부모코드 검색)
	@Override
	public List<CmmCodeVO> formOnload(String command) {
		
		List<CmmCodeVO> cmmCodeVO = null;
		
		if(command.equals("select")){
			cmmCodeVO = cmmCodeDAO.selectCode();
		}else if(command.equals("parent")){
			cmmCodeVO = cmmCodeDAO.parentCode();
		}
		
		return cmmCodeVO;
		
	}
	
	// 검색
	@Override
	public List<CmmCodeVO> selectCodeList(CmmCodeVO cmmCodeVO) {
		return cmmCodeDAO.selectCodeList(cmmCodeVO);
	}

	// 저장 / 수정 / 삭제
	@Override
	public String editCmmCode(List<CmmCodeVO> cmmCodeVO, String updateId) {
		
		String confirm = null;
		
		for(int i = 0; i < cmmCodeVO.size(); i++){
			CmmCodeVO cmmCode = cmmCodeVO.get(i);
			
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) cmmCode;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				cmmCodeDAO.insertCmmCode(cmmCode);
				confirm = "저장";
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				Map<String, Object> cmmCodeMap = new HashMap<String, Object>();
				cmmCodeMap.put("cmmCodeVO", cmmCode);
				cmmCodeMap.put("updateId", updateId);
				cmmCodeDAO.updateCmmCode(cmmCodeMap);
				cmmCodeMap.clear();
				confirm = "수정";
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				cmmCodeDAO.deleteCmmCode(cmmCode);
			}
			
		}
		
		return confirm;
	}
	
	
	
}
