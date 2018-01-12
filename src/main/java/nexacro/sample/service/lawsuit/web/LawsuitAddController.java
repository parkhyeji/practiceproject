package nexacro.sample.service.lawsuit.web;


import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitAddService;
import nexacro.sample.service.lawsuit.vo.LawsuitAddVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class LawsuitAddController {
	private static final Logger log = LoggerFactory
			.getLogger(LawsuitAddController.class);

	@Resource(name = "lawsuitaddService")
	private LawsuitAddService lawsuitaddService;
	
	@Resource
	private Validator validator;
	
	// @InitBinder
	// public void initBinder(WebDataBinder dataBinder) {
	// dataBinder.setValidator(this.validator);
	// }//추가
	
	@RequestMapping(value = "/lawsuit/LawsuitAddSaveVO.do")
	public NexacroResult LawsuitAddSaveVO(
			@ParamDataSet(name = "ds_input") LawsuitAddVO LawsuitAddVo) throws NexacroException  { 
		
		
		lawsuitaddService.LawsuitAddSaveVO(LawsuitAddVo);
		NexacroResult result = new NexacroResult();
		return result;
	}
	
	}

