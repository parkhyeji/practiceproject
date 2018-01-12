package nexacro.aml.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.RuleAlertService;
import nexacro.aml.service.SuspInfoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.xapi.data.DataSet;

@Controller
public class SuspInfoController {
	private static final Logger log = LoggerFactory
			.getLogger(SuspInfoController.class);

	@Resource
	private Validator validator;
	
	@Resource
	private SuspInfoService suspinfoService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	@RequestMapping(value= "susp/search.do")
	public NexacroResult supSearch(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_upper", suspinfoService.search());		
		return result;
	}
	
	@RequestMapping(value= "susp/detail.do")
	public NexacroResult suspDetail(
			@ParamDataSet(name="ds_code") List<Map> ds_code){
		NexacroResult result = new NexacroResult();
		Map map = ds_code.get(0);
		System.out.println("========= 키값 : "+map);
		
		result.addDataSet("ds_detail", suspinfoService.detailList(map));
		return result;
	}
	
	@RequestMapping(value="susp/uppersave.do")
	public NexacroResult upperSave(
			@ParamDataSet(name="ds_upper") List<Map> ds_upper){
		
		//Map list = ds_upper.get(0);
		//Map code = ds_code.get(0);
				
		for(Map list:ds_upper){
			if(list.get("flag").equals("I")){
				suspinfoService.upperInsert(list);
			}
			 if(list.get("flag").equals("U")){
				suspinfoService.upperUpdate(list);
			 }
			 if(list.get("flag").equals("D")){
				suspinfoService.upperDelete(list);
			}
		}
		
		NexacroResult result = new NexacroResult();
		return result;
	}
	
	@RequestMapping(value="susp/detailsave.do")
	public NexacroResult detailSave(
			@ParamDataSet(name="ds_detail") List<Map> ds_detail){
		
		System.out.println("-----------어디보자 : "+ds_detail);
		for(Map map:ds_detail){
			if(map.get("flag").equals("I")){
				suspinfoService.detailInsert(map);
			}
			if(map.get("flag").equals("U")){
				suspinfoService.detailUpdate(map);
			}
			if(map.get("flag").equals("D")){
				suspinfoService.detailDelete(map);
			}
		}
		
		NexacroResult result = new NexacroResult();
		return result;
	}
	
	
}
