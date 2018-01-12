package nexacro.aml.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.EmpInfoService;

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
public class EmpInfoController {

	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory
	.getLogger(EmpInfoController.class);

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

	@Resource(name = "EmpInfoService")
	private EmpInfoService empInfoService;

	//전체조회
	@RequestMapping(value = "allEmpInfo/allEmpInfo.do")
	public NexacroResult searchCust(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_empInfo", empInfoService.EmpInfoList());
		return result;
	}

	//직원정보 업데이트
	@RequestMapping(value = "empInfoUpdate/empInfoUpdate.do")
	public NexacroResult empInfoUpdate(
			@ParamDataSet(name="ds_empInfo") List<Map> ds_empInfo){
		NexacroResult result = new NexacroResult();
		Map map = null;
		for(int i=0; i<ds_empInfo.size(); i++){
			map = ds_empInfo.get(i);
			if(map.get("flag").equals("U")){
				empInfoService.empInfoUpdate(map);
			}
		}

		return result;
	}

	//입사승인 업데이트
	@RequestMapping(value = "empJoinDateUpdate/empJoinDateUpdate.do")
	public NexacroResult empJoinDateUpdate(
			@ParamDataSet(name="ds_empInfo") List<Map> ds_empInfo){
		NexacroResult result = new NexacroResult();
		Map map = null;
		for(int i=0; i<ds_empInfo.size(); i++){
			map = ds_empInfo.get(i);
			if(map.get("flag").equals("U")){
				empInfoService.empJoinDateUpdate(map);
			}
		}
		return result;
	}

	//퇴사처리 업데이트
	@RequestMapping(value = "empRetireDateUpdate/empRetireDateUpdate.do")
	public NexacroResult empRetireDateUpdate(
			@ParamDataSet(name="ds_empInfo") List<Map> ds_empInfo){
		NexacroResult result = new NexacroResult();
		Map map = null;
		for(int i=0; i<ds_empInfo.size(); i++){
			map = ds_empInfo.get(i);
			if(map.get("flag").equals("U")){
				empInfoService.empRetireDateUpdate(map);
			}
		}
		return result;
	}

	//직급별 검색
	@RequestMapping(value = "empPosiNameSearch/empPosiNameSearch.do")
	public NexacroResult empPosiNameSearch(
			@ParamDataSet(name="ds_posiSearch") List<Map> ds_posiSearch){
		NexacroResult result = new NexacroResult();
		Map map = ds_posiSearch.get(0);
		result.addDataSet("ds_empInfo",empInfoService.posiNameSearch(map));
		return result;
	}
}