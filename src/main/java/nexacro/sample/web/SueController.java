package nexacro.sample.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.page.PageModule;
import nexacro.sample.page.PagingVO;
import nexacro.sample.service.SueService;
import nexacro.sample.vo.SueVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;









/***************************************/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.CmmCodeDetailService;
import nexacro.sample.vo.CmmCodeDetailVO;
import nexacro.sample.vo.PageVO;
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

@Controller
public class SueController {

	private static final Logger log = LoggerFactory.getLogger(SueController.class);
	
	@Resource(name="sueService")
	private SueService sueService;
	
	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}
	
	@RequestMapping(value="/sue/suePaging.do")
	public NexacroResult suePaging(
			@ParamVariable(name ="pageNo", required=false) String pageNos,
			@ParamVariable(name="totalCnt", required=false) String totalCnts
			){
		
		
		int totalCnt=Integer.parseInt(totalCnts);
		int pageNo=Integer.parseInt(pageNos);
		
		
		int listSize =10;
		int pageSize=5;

		System.out.println("pageNo==="+pageNo);
		System.out.println("totalCnt==="+totalCnt);
		PagingVO pageList=PageModule.makePageForNexa(totalCnt, listSize, pageSize, pageNo);
		System.out.println("pageList="+pageList.toString());
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_page", pageList);
		
		return result;
	}
	
	
	@RequestMapping(value="/sue/getSueMenList.do")
	public NexacroResult sueMenList(
			@ParamVariable(name = "lawRaisreqNo") String lawRaisreqNo,
			@ParamVariable(name = "lawRaisreqClasCode") String lawRaisreqClasCode,
			@ParamVariable(name = "lawRaisreqReqDate1") String lawRaisreqReqDate1,
			@ParamVariable(name = "lawRaisreqReqDate2") String lawRaisreqReqDate2,
			@ParamVariable(name = "lawRaisreqRepWtr") String lawRaisreqRepWtr,
			@ParamVariable(name ="pageNo", required=false) String pageNos
			){
		
		int totalCnt=0;
		int pageNo=0;
		System.out.println("pageNos=="+pageNos);
		//if(pageNos.equals("")||pageNos==null){
		//	pageNo=1;
		//	System.out.println("test1seung");
		//}else{
			pageNo = Integer.parseInt(pageNos);
		//	System.out.println("test2seung");
		//}
		
		int listSize =10;
		int pageSize=5;
	
		Map<String, Object> selectMap = new HashMap<String, Object>();
		
		selectMap.put("lawRaisreqNo", lawRaisreqNo);
		selectMap.put("lawRaisreqClasCode", lawRaisreqClasCode);
		selectMap.put("lawRaisreqReqDate1", lawRaisreqReqDate1);
		selectMap.put("lawRaisreqReqDate2", lawRaisreqReqDate2);
		selectMap.put("lawRaisreqRepWtr", lawRaisreqRepWtr);
		selectMap.put("pageNo", pageNo);
		selectMap.put("listSize", listSize);
		
		List<SueVO> sueList = sueService.sueMenList(selectMap);
		
		if(sueList.size()>0){
			totalCnt = sueList.get(0).getTotalCnt();
			
			PagingVO pvo = PageModule.makePageForNexa(totalCnt, listSize, pageSize, pageNo);
			//System.out.println("@@@@@@@@@@@@@@@@@@@");
			//System.out.println("!!!!!@@@@="+pvo.getGoLeft());
			//System.out.println("!!!!!@@@@="+pvo.getGoRight());
			//System.out.println("!!!!!@@@@="+pvo.getStrNum());
			
			for(int i=0; i<sueList.size(); i++){
				sueList.get(i).setPageNo(pageNo);
				//sueList.get(i).setGoLeft(pvo.getGoLeft());
				//sueList.get(i).setGoRight(pvo.getGoRight());
				//sueList.get(i).setNums(pvo.getStrNum());
				System.out.println(sueList.get(i).toString());
			}
			//System.out.println("@@@@@@@@@@@@@@@@@@@");
			
		}else{}
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", sueList);
		return result;
	}
	
	
	@RequestMapping(value="/sue/sueView.do")
	public NexacroResult sueView(
			@ParamVariable(name="lawRaisreqNo") String lawRaisreqNo
			){
		
		
		Map<String, Object> sueMap = new HashMap<String, Object>();
		Map<String, Object> codeList = new HashMap<String, Object>();
		
		sueMap.put("lawRaisreqNo", lawRaisreqNo);
		List<Map> sueList = sueService.sueView(sueMap);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", sueList);
		
		return result;
	}
	
	@RequestMapping(value = "/sue/sueUpdate.do")
	public NexacroResult sueUpdate(
			@ParamDataSet(name="ds_input") List<Map> params
			){
		
		for(int i=0; i<params.size(); i++){
			System.out.println(params.get(0).toString());
		}
		
		sueService.sueUpdate(params);
		NexacroResult result = new NexacroResult();
		
		return result;
	}
	
/*	public void listCheck(List<SueVO> listing){
		if(listing.size()>0){
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			SueVO str;
			for(int i=0; i<listing.size(); i++){
				str = listing.get(i);
				System.out.println(str.toString());
			}
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		}else{
			System.out.println("no list^^^");
		}
	}*/
}
