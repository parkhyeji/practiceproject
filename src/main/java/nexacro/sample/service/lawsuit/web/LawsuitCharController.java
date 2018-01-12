package nexacro.sample.service.lawsuit.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitCharService;
import nexacro.sample.service.lawsuit.vo.LawsuitCharVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class LawsuitCharController {
	private static final Logger log = LoggerFactory
			.getLogger(LawsuitCharController.class);

	@Resource(name = "lawsuitcharService")
	private LawsuitCharService lawsuitcharService;

	@RequestMapping(value = "/lawsuit/LawsuitCharSelectVO.do")
	public NexacroResult LawsuitCharSelectVO(
			@ParamVariable(name = "insaName",required=false) String insaName,
			@ParamVariable(name = "insaSabun",required=false) String insaSabun) {
		Map<String, Object> LawsuitCharSelectVO = new HashMap<String, Object>();
		LawsuitCharSelectVO.put("insaName",insaName);
		LawsuitCharSelectVO.put("insaSabun",insaSabun);
		List<LawsuitCharVO> charList = lawsuitcharService.LawsuitCharSelectVO(LawsuitCharSelectVO);

		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", charList);

		return result;
	}

}
