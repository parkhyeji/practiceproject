package nexacro.sample.web.legal_adv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.legal_adv.Legal_OffInfoService;
import nexacro.sample.vo.legal_adv.LegalOfficialInfoVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class Legal_ofclController {

private static final Logger log = LoggerFactory.getLogger(Legal_ofclController.class);
	
	@Resource(name = "Legal_OffInfoService")
	private Legal_OffInfoService service;
	
	//외부 법률 관계자 조회
	@RequestMapping("legal_ofcl/selectLegalOfclList.do")
	public NexacroResult selectLegalOffInfoList (
			@ParamVariable(name="srcLegalOfclType", required=false) String ofclType,
			@ParamVariable(name="srcLegalOfclName", required=false) String lawname
			){
		log.info("종류:"+ofclType);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("LegalofclType", ofclType);
		map.put("LegalofclName", lawname);
		
		List<LegalOfficialInfoVO> list = service.selectList(map);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", list);
		
		return result;
	}
	
	//저장버튼 눌렀을 때
	@RequestMapping("legal_ofcl/saveLegalOfclList.do")
	public NexacroResult saveLegalofclList (
			@ParamDataSet(name="ds_input") List<LegalOfficialInfoVO> ofclVOs){
		
		String saveKey = service.saveLgOfclList(ofclVOs);
		
		NexacroResult result = new NexacroResult();
		result.addVariable("confirmStr", saveKey);
		
		return result;
	}
	
	
	
}
