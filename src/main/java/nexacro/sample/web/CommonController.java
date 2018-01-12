package nexacro.sample.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.CodeService;
import nexacro.sample.vo.com.ComCodeVO;
import nexacro.sample.vo.com.DetailCodeVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.xapi.data.VariableList;


@Controller
public class CommonController {
	
	@Resource (name="codeService")
	CodeService codeService;
	
	// 코드마스터 전체내역 조회하기
	@RequestMapping(value = "common/selectCode.do")
	public NexacroResult selectCode(
			@ParamDataSet(name = "ds_search", required = false) ComCodeVO comCodeVO){
		
		List<ComCodeVO> comCodeList = codeService.selectCode(comCodeVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", comCodeList);
		
		return result;
	}
	
	// 분류별 코드번호 또는 코드네임 가져오기
	@RequestMapping(value = "common/detailCode.do")
	public NexacroResult detailCode(
			@ParamVariable(name = "codeSwitch") String codeSwitch){
		
		Map<String, String> switchMap = new HashMap<String, String>();
		switchMap.put("codeSwitch", codeSwitch);
		
		List<ComCodeVO> comCodeList = codeService.detailCode(switchMap);
				
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", comCodeList);
		
		return result;
	}
	
	// 코드마스터 입력, 수정, 삭제
	@RequestMapping(value = "common/editCode.do")
	public NexacroResult editCode(
			@ParamDataSet(name = "ds_input", required = false) List<ComCodeVO> comCodeVO) throws NexacroException{
		
		String confirmStr = codeService.editCode(comCodeVO);
		
		NexacroResult result = new NexacroResult();
		result.addVariable("confirmStr", confirmStr);		
		return result;
	}
	
	// 상세코드 분류코드 가져오기
	@RequestMapping(value = "common/selectDetailCode.do")
	public NexacroResult selectDetailCode(){
		
		List<DetailCodeVO> detailCodeList = codeService.selectDetailCode();
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", detailCodeList);
		return result;
	}
	
	// 분류코드에 따른 상세코드 가져오기
	@RequestMapping(value = "common/selectDetailList.do")
	public NexacroResult selectDatailList(
			@ParamDataSet(name = "ds_search", required = false) DetailCodeVO detailCodeVO){
		
		List<DetailCodeVO> detailCodeList = codeService.selectDetailList(detailCodeVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", detailCodeList);
		
		return result;
	}
	
	// 상세코드 입력, 수정, 삭제
	@RequestMapping(value = "common/editDetailCode.do")
	public NexacroResult editDetailCode(
			@ParamVariable(name = "updateId") String updateId,
			@ParamDataSet(name = "ds_input", required = false) List<DetailCodeVO> detailCodeVO){
		
		String confirmStr = codeService.editDetailCode(detailCodeVO, updateId);
		
		NexacroResult result = new NexacroResult();
		result.addVariable("confirmStr", confirmStr);
		return result;
	}

}
