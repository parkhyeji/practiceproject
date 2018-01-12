package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.AmlAdmService;

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
import com.nexacro.xapi.data.DataSet;

@Controller
public class AmlAdmController {

	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory
			.getLogger(AmlAdmController.class);
	
	@Resource(name = "amlAdmService")
	private AmlAdmService amlAdmService;
	
	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	//직원 로그인
	@RequestMapping(value = "aml/login.do")
	public NexacroResult login(@ParamDataSet(name="ds_idPwd") Map params) throws Exception{
		// Map<String, Object> params = new HashMap<String, Object>();
		NexacroResult result = new NexacroResult();
		result.addDataSet("gds_empInfo", amlAdmService.login(params));
		// System.out.println("id"+result.getDataSets().size());
		return result;
	}
	
	

	// 존재하는 아이디인지 검색
	@RequestMapping(value = "aml/selectId.do")
	public NexacroResult selectId(@ParamDataSet(name = "ds_check") List<Map> ds_check){
		Map map = ds_check.get(0);

		NexacroResult result = new NexacroResult();
		result.addDataSet("join", amlAdmService.selectId(map));

		return result;
	}

	// 회원가입
	@RequestMapping(value = "aml/join.do")
	public NexacroResult insert(@ParamDataSet(name="resultid") List<Map> resultid) throws Exception{

		amlAdmService.insert(resultid.get(0));

		NexacroResult result = new NexacroResult();

		return result;
	}



	// 존재하는 아이디인지 검색
	/*
	@RequestMapping(value = "administrator/selectId.do")
	public NexacroResult selectId(
			@ParamVariable(name = "id") String id){
		
		AdmVO admVO = admService.selectId(id);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admVO);
		
		return result;
	}
	*/
	
	/*@RequestMapping(value = "administrator/insertAdm.do")
	public NexacroResult inserAdm(
			@ParamDataSet(name = "ds_input", required = false) AdmVO admVO){
		//System.out.println(admVO.getBirth().substring(6));
		admVO.setBackBirth(admVO.getBirth().substring(6));
		//System.out.println(admVO.getBirth().substring(0, 6));
		admVO.setBirth(admVO.getBirth().substring(0, 6));
		admService.insertAdm(admVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admVO);
		
		return result;
	}*/
}
