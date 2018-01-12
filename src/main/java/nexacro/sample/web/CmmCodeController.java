package nexacro.sample.web;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.CmmCodeService;
import nexacro.sample.vo.com.CmmCodeVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class CmmCodeController {
	
	@Resource(name="cmmCodeService")
	CmmCodeService cmmCodeService;
	
	
	// 온로드 시 호출 서비스(분류코드 및 부모코드 검색)
	@RequestMapping(value = "cmmCode/formOnload.do")
	public NexacroResult formOnload(
			@ParamVariable(name = "strParam") String command){
		
		List<CmmCodeVO> cmmCodeList = cmmCodeService.formOnload(command);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", cmmCodeList);
		
		return result;
		
	}
	
	// 검색
	@RequestMapping(value = "cmmCode/selectCodeList.do")
	public NexacroResult selectCodeList(
			@ParamDataSet(name = "ds_search") CmmCodeVO cmmCodeVO){
		
		List<CmmCodeVO> cmmCodeList = cmmCodeService.selectCodeList(cmmCodeVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", cmmCodeList);
		
		return result;
	}
	
	// 저장 / 수정 / 삭제
	@RequestMapping(value = "cmmCode/editCmmCode.do")
	public NexacroResult editCmmCode(
			@ParamVariable(name = "updateId") String updateId,
			@ParamDataSet(name = "ds_input", required = false) List<CmmCodeVO> cmmCodeVO){
		
		String confirmStr = cmmCodeService.editCmmCode(cmmCodeVO, updateId);
		
		NexacroResult result = new NexacroResult();
		result.addVariable("confirmStr", confirmStr);
		return result;
		
	}
}
