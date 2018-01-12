package nexacro.sample.service.lawsuit.web;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitLitigantRegisterService;
import nexacro.sample.service.lawsuit.vo.LawsuitLitigantRegisterVO;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class LawsuitLitigantRegisterController {
	@Resource(name = "lawsuitLitigantService")
	private LawsuitLitigantRegisterService lawsuitlistservice;
	
	/*@Resource(name = "propertiesService")
	private EgovPropertyService propertiesService;*/
	
	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
}

	//원피고 등록 update
@RequestMapping(value = "/lawsuit/updatePlaDefAll.do")
public NexacroResult updatePlaDefAll(
		@ParamDataSet(name = "ds_input") LawsuitLitigantRegisterVO pladefIn) {
	NexacroResult result = new NexacroResult();
	try{
		
		int upRes= lawsuitlistservice.updatePlaDefAll(pladefIn);
	}catch(Exception e){
		result.setErrorCode(-1);
		result.setErrorMsg(e.toString());
	}
	return result;
}

@RequestMapping(value = "/lawsuit/selectPladefList.do")
public NexacroResult selectPladefAll(
		@ParamDataSet(name="ds_input") LawsuitLitigantRegisterVO pladefIn)
{
	NexacroResult result = new NexacroResult();
	
	List<LawsuitLitigantRegisterVO> list = lawsuitlistservice.selectPladefAll(pladefIn);
	result.addDataSet("ds_output", list);
	return result;
}

//원피고 등록 insert
@RequestMapping(value = "/pladef/plaDefMgr.do")
public NexacroResult plaDefMgr(
		@ParamDataSet(name = "ds_input") LawsuitLitigantRegisterVO pladefIn) {
	NexacroResult result = new NexacroResult();
	try{
		//pladefIn.setLawsuitAdmNo("2017101969");
		int upRes= lawsuitlistservice.plaDefMgr(pladefIn);
	}catch(Exception e){
		result.setErrorCode(-1);
		result.setErrorMsg(e.toString());
	}
	return result;
}
}


