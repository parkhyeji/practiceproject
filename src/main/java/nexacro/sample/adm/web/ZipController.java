package nexacro.sample.adm.web;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.adm.vo.ZipVO;
import nexacro.sample.service.InsaAcptService;
import nexacro.sample.service.adm.ZipService;
import nexacro.sample.vo.com.InsaAcptVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;


@Controller
public class ZipController {
	
	@Resource(name = "zipService")
	private ZipService zipService;
	
	// 우편번호 동 검색
	@RequestMapping(value = "selectZipCode.do")
	public NexacroResult selectZipCode(
			@ParamDataSet(name = "ds_input", required = false) ZipVO zipVO){
		System.out.println("~~~~~~~");
		List<ZipVO> zipList = zipService.selectZipCode(zipVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", zipList);
		
		return result;
	}
	
}
