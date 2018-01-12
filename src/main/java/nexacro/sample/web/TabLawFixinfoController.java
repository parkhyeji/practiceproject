package nexacro.sample.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabAlesSueService;
import nexacro.sample.service.TabLawFixinfoService;
import nexacro.sample.vo.TabAlesSueVO;
import nexacro.sample.vo.TabLawFixinfoVO;
import nexacro.sample.vo.UnitVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroFirstRowHandler;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.xapi.data.DataSet;
import com.nexacro.xapi.data.DataSetList;
import com.nexacro.xapi.data.PlatformData;
import com.nexacro.xapi.data.Variable;
import com.nexacro.xapi.data.VariableList;
import com.nexacro.xapi.tx.HttpPlatformRequest;
import com.nexacro.xapi.tx.HttpPlatformResponse;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
 * Test를 위한 Controller Sample Class
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Controller
public class TabLawFixinfoController {

	private Logger log = LoggerFactory.getLogger(TabLawFixinfoController.class);
	// @Autowired(required = false) // Type 정의
	@Resource(name = "tabLawFixinfoService")
	// Name 정의
	private TabLawFixinfoService tabLawFixinfoService;

	// 소송기본사항(조회)
	@RequestMapping(value = "/law_fixinfo/getLawsuitRecSelect.do")
	public NexacroResult getLawsuitRecSelect(
			@ParamDataSet(name = "ds_search", required = false) TabLawFixinfoVO searchVO) {

		List<TabLawFixinfoVO> law_fixinfoList = tabLawFixinfoService.getLawsuitRecSelect(searchVO);

		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", law_fixinfoList);

		return result;
	}
	
	
// 기일정보(조회)
	@RequestMapping(value = "/law_fixinfo/getLawFixinfoSelect.do")
	public NexacroResult getLawFixinfoSelect(
			@ParamDataSet(name = "ds_search", required = false) TabLawFixinfoVO searchVO) {

		List<TabLawFixinfoVO> law_fixinfoList = tabLawFixinfoService.getLawFixinfoSelect(searchVO);

		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", law_fixinfoList);

		return result;
	}	
	

//기일정보(등록삭제수정)
		@RequestMapping(value = "/lawsuit_rec/getLawFixinfoCud.do")
		public NexacroResult getLawFixinfoCud(
				@ParamDataSet(name = "ds_search") List<TabLawFixinfoVO> searchVO){
			
			tabLawFixinfoService.getLawFixinfoCud(searchVO);
			
			NexacroResult result = new NexacroResult();
			
			return result;
		}
	
}
