package nexacro.sample.service.lawsuit.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitAdm_NoService;
import nexacro.sample.service.lawsuit.vo.LawsuitAdm_NoVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class LawsuitAdm_NoController {
	private static final Logger log = LoggerFactory.getLogger(LawsuitAdm_NoController.class);

	@Resource(name = "lawsuitadmnoService")
	private LawsuitAdm_NoService lawsuitadmnoService;

	@RequestMapping(value = "/lawsuit/selectlawsuitadmnoServiceVO.do")
	public NexacroResult selectlawsuitadmnoServiceVO(
			@ParamVariable(name = "selectedId") String selectedId,
			@ParamVariable(name = "selectedId1") String selectedId1) {
		Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("selectedId", selectedId);
		selectMap.put("selectedId1", selectedId1);
		List<LawsuitAdm_NoVO> admnoList = lawsuitadmnoService.selectlawsuitadmnoServiceVO(selectMap);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admnoList);
		return result;
	}

}
