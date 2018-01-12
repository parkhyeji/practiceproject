package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.ManageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class ManageController {
	
	private static final Logger log = LoggerFactory
			.getLogger(ManageController.class);
	
	@Resource(name= "ManageService")
	private ManageService  manageService;
	
	// 공통 코드 로드
	@RequestMapping(value = "manageCommonCodes.do")
	public NexacroResult ManageCommonCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();	
		
		classCodeMap.put("classCode", "A000");
		result.addDataSet("ds_custType", manageService.ManageCommonCode(classCodeMap));
		
		return result;		
		
	}	
	
	// 보고서관리 조회
	@RequestMapping(value = "straml/managelist.do")
	public NexacroResult manageList(
			@ParamDataSet(name="ds_find") List<Map> ds_find){
		Map map = ds_find.get(0);
		NexacroResult result = new NexacroResult();
		System.out.println("=====나오냐??? === : "+map);
		result.addDataSet("ds_managelist", manageService.ManageList(map));
		return result;
	}

}
