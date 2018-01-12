package nexacro.sample.service.lawsuit.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitLegalOfficialCheckService;
import nexacro.sample.service.lawsuit.vo.LawsuitLegalOfficialCheckVO;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class LawsuitLegalOfficialCheckController {
	
	@Resource(name = "lawsuitlistservice")
	private LawsuitLegalOfficialCheckService lawsuitlistservice;
	
	/*@Resource(name = "propertiesService")
	private EgovPropertyService propertiesService;*/
	
	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}
	
	@RequestMapping(value = "/lawsuit/getLegalOfficials.do")
	public NexacroResult getLegalOfficials(
			@ParamVariable(name = "selectedId") String selectedId,
			@ParamVariable(name = "selectedId1") String selectedId1) {
		Map<String, Object> getLegalOfficials = new HashMap<String, Object>();
		getLegalOfficials.put("selectedId",selectedId);
		getLegalOfficials.put("selectedId1",selectedId1);
		List<LawsuitLegalOfficialCheckVO> getLegalOfficials_List = lawsuitlistservice.getLegalOfficials(getLegalOfficials);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", getLegalOfficials_List);
		System.out.println("badaControllerTest");
		return result;
	}
}
