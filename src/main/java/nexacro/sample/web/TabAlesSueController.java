package nexacro.sample.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabAlesSueService;
import nexacro.sample.vo.TabAlesSueVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;


/**
 * Test를 위한 Controller Sample Class
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Controller
public class TabAlesSueController {

    @Resource(name = "ales_sueService")
    private TabAlesSueService ales_sueService;
    
    
    @RequestMapping(value="ales_sue/ales_sueSelect.do")
	public NexacroResult ales_sueSelect(
			@ParamVariable(name = "lawsuitAdmNo") String lawsuitAdmNo){
		
		Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("lawsuitAdmNo", lawsuitAdmNo);
		
		List<TabAlesSueVO> ales_sueList = ales_sueService.ales_sueSelect(selectMap);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", ales_sueList);
		
		return result;
	}
    
  
	
	//응소제소 저장/수정/삭제
	@RequestMapping(value="ales_sue/ales_sueSave.do")
	public NexacroResult ales_sueSave(
			@ParamDataSet(name = "ds_input") List<TabAlesSueVO> Ales_sueVO,
			@ParamVariable(name = "lawsuitAdmNo") String lawsuitAdmNo){
		
		String confirmStr = ales_sueService.ales_sueSave(Ales_sueVO, lawsuitAdmNo);
		
		NexacroResult result = new NexacroResult();
		
		result.addVariable("confirmStr", confirmStr);
		return result;
	}
}
