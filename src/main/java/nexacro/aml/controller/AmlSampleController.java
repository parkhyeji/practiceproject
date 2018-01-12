package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.AmlSampleServiceImpl;
import nexacro.sample.vo.RaisVO;

import org.aspectj.weaver.ast.Instanceof;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;
/*import nexacro.pdlaw.vo.depo.DepoVO;
import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import com.nexacro.xapi.data.DataSet;

@Controller
public class AmlSampleController{

	private static final Logger log = LoggerFactory
			.getLogger(AmlSampleController.class);
	
	@Resource(name = "amlSampleService")
	private AmlSampleServiceImpl amlSampleService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	// 공통 코드 로드
	@RequestMapping(value = "straml/loadCommonCodes.do")
	public NexacroResult loadCommonCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();	
		
		classCodeMap.put("classCode", "P000");
		result.addDataSet("ds_work", amlSampleService.loadCommonCode(classCodeMap));		
		//System.out.println(result);
		
		return result;		
		
	}	
		
	// STR LIST 조회
	@RequestMapping(value = "straml/searchStrList.do")
	public NexacroResult searchStrList(
			@ParamDataSet(name="ds_search") List<Map> ds_search)
	{			
		NexacroResult result = new NexacroResult();
		System.out.println("나와라 ------------------------------"+ds_search);
				
		Map map = ds_search.get(0);
		
		System.out.println("나와라 2222222222222222------------------------------"+map);
		//map.put("workType", "1");		
		log.info("나와라 log4j-2-----------------------------"+ds_search);
		result.addDataSet("ds_strlist", amlSampleService.searchStrList(map));
				
		return result;		
	}
	
	
	//Rule정보 조회
	@RequestMapping(value = "straml/searchRule.do")
	public NexacroResult searchRule(
			@ParamDataSet(name="ds_ruleidout") List<Map> ds_ruleidout)
	{			
		NexacroResult result = new NexacroResult();
		
		// 리스트 조회 값을 넣어야함!!
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(ds_ruleidout+"확인용222222");
		
		map = ds_ruleidout.get(0);	
		System.out.println(ds_ruleidout+"확인용"+ map);
		
		result.addDataSet("ds_list", amlSampleService.searchRule(map));
				
		return result;		
	}
	
	//cust정보 조회
	@RequestMapping(value = "straml/searchCust.do")
	public NexacroResult searchCust(
			@ParamDataSet(name="ds_custno") List<Map> ds_custno)
	{			
		NexacroResult result = new NexacroResult();
		
		// 리스트 조회 값을 넣어야함!!
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(ds_custno+"확인용222222");
		
		map = ds_custno.get(0);	
		System.out.println(ds_custno+"확인용"+ map);
		
		result.addDataSet("ds_list", amlSampleService.searchCust(map));
				
		return result;		
	}
	
	@RequestMapping(value="reason.do")
	public NexacroResult reason(@ParamDataSet(name="ds_viewR") List<Map> ds_viewR){
		NexacroResult result = new NexacroResult();
		
		Map map = ds_viewR.get(0);
		System.out.println("====그룹넘버 == : "+map);
		
		result.addDataSet("ds_viewR", amlSampleService.viewReason(map));
		
		return result;
	}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

