package nexacro.sample.web.legal_adv;

//import nexacro.sample.web.depo.DepoController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.vo.legal_adv.LegalAdListVo;
import nexacro.sample.service.legal_adv.Legal_adService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class Legal_adController {
	//private static final Logger log = LoggerFactory.getLogger(DepoController.class);
	
	@Resource(name = "legal_adService")
	private Legal_adService legal_adService;
	
	@RequestMapping(value="legal_ad/selectLegalAdDetail.do")
	public NexacroResult selectLegalAdDetail(
			@ParamVariable(name="legaladvLawAdvReqNo", required=false) String no,
			@ParamVariable(name="legaladvReqDeptCode", required=false) String deptcode,
			@ParamVariable(name="legaladvReqDate1", required=false) String date1,
			@ParamVariable(name="legaladvReqDate2", required=false) String date2,
			@ParamVariable(name="legaladvRepWtr", required=false) String wtr,
			@ParamVariable(name="legaladvLawAdvCode", required=false) String advcode
			){
		Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("legaladvLawAdvReqNo", no);
		selectMap.put("legaladvReqDeptCode", deptcode);
		selectMap.put("legaladvReqDate1", date1);
		selectMap.put("legaladvReqDate2", date2);
		selectMap.put("legaladvRepWtr", wtr);
		selectMap.put("legaladvLawAdvCode", advcode);
		
		List<LegalAdListVo> legal_adList = legal_adService.selectLegaladList(selectMap);		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", legal_adList);
		return result;
	}
	
	@RequestMapping(value="legal_ad/checkMgrAvailable.do")
	public NexacroResult checkMgrAvailable(
			@ParamVariable(name = "mgr", required=false) String mgr){
		
		int count = legal_adService.checkMgrAvailable(mgr);
		if(mgr.equals("undefined")||mgr.equals("")) count = 1;
		NexacroResult result = new NexacroResult();
		result.addVariable("mgrCount", count);
		return result;
	}
	
	@RequestMapping(value="legal_ad/saveLegalAdDetail.do")
	public NexacroResult saveLegalAdDetail(
			@ParamDataSet(name = "ds_input") List<LegalAdListVo> legalAdListVo){
		
		String confirmStr = legal_adService.saveLegalAdDetail(legalAdListVo);
		
		NexacroResult result = new NexacroResult();
		result.addVariable("confirmStr", confirmStr);
		return result;
	}
	
	@RequestMapping(value="legal_ad/saveLegalAdMandate.do")
	public NexacroResult saveLegalAdMandate(
			@ParamDataSet(name = "ds_input") List<LegalAdListVo> legalAdListVo){
		
		String confirmStr = legal_adService.saveLegalAdMandate(legalAdListVo);
		
		NexacroResult result = new NexacroResult();
		result.addVariable("confirmStr", confirmStr);
		return result;
	}
	
	@RequestMapping(value="legal_ad/selectCost.do")
	public NexacroResult selectCost(
			@ParamVariable(name = "legaladvCostLawadvReqno", required = false) String no){
		
		Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("legaladvCostLawadvReqno", no);
		
		List<LegalAdListVo> legal_adList = legal_adService.selectCost(selectMap);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", legal_adList);
		return result;
	}
	
	@RequestMapping(value="legal_ad/saveLegalAdRep.do")
	public NexacroResult saveLegalAdRep(
			@ParamDataSet(name = "ds_input") List<LegalAdListVo> legalAdListVo){
		
		legal_adService.saveLegalAdRep(legalAdListVo);
		
		NexacroResult result = new NexacroResult();
		return result;
	}
	
	@RequestMapping(value="legal_ad/saveCost.do")
	public NexacroResult saveCost(
			@ParamDataSet(name = "ds_input") List<LegalAdListVo> legalAdListVo){
		
		legal_adService.saveCost(legalAdListVo);
		
		NexacroResult result = new NexacroResult();
		return result;
	}
}
