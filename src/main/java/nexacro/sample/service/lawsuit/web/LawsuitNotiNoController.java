package nexacro.sample.service.lawsuit.web;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitNotiNoService;
import nexacro.sample.service.lawsuit.vo.LawsuitNotiNoVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

/**
 * 소송접수관리 Controller
 * 
 * @author Kim PyeognAn
 * @since 10.27.2017
 * @version 1.0
 */

@Controller
public class LawsuitNotiNoController {
	private Logger log = LoggerFactory.getLogger(LawsuitNotiNoController.class);
	
	@Resource(name = "lawsuitNotiNoService")
	private LawsuitNotiNoService lawsuitNotiNoService;
	
	@RequestMapping(value="/lawsuit/lawsuitNotiNoSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name="ds_search", required = false)LawsuitNotiNoVO searchVo)
	{
		
		List<LawsuitNotiNoVO> lawsuitNotiNoList = lawsuitNotiNoService.selectlawsuitNotiNoList(searchVo);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", lawsuitNotiNoList);
		
		return result;
	}
	
}
