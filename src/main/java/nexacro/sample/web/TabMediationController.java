package nexacro.sample.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabMediationService;
import nexacro.sample.vo.TabMediationVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;


/**
 * Test를 위한 Controller Sample Class
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Controller
public class TabMediationController {

	@Resource(name = "mediationService")
	private TabMediationService mediationService;
	
	
	//기본사항조회
	@RequestMapping(value="mediation/mediationSelect.do")
	public NexacroResult mediationSelect(
			@ParamVariable(name = "lawsuitAdmNo") String lawsuitAdmNo,
			@ParamVariable(name = "instAdmCode", required=false) String instAdmCode){
		
		Map<String, Object> selectMap = new HashMap<String, Object>();
		
		selectMap.put("lawsuitAdmNo", lawsuitAdmNo);
		selectMap.put("instAdmCode", instAdmCode);
		
		List<TabMediationVO> mediationList = mediationService.mediationSelect(selectMap);
		
		NexacroResult result = new NexacroResult();
		
		result.addDataSet("ds_lawsuit", mediationList);
		
		return result;
		
	}
	
	
	//원피고 목록조회
		@RequestMapping(value="pladef/pladefSelect.do")
		public NexacroResult pladefSelect(
				@ParamVariable(name = "lawsuitAdmNo") String lawsuitAdmNo,
				@ParamVariable(name = "instAdmCode") String instAdmCode) {
			
			Map<String, Object> selectMap = new HashMap<String, Object>();
			
			selectMap.put("lawsuitAdmNo", lawsuitAdmNo);
			selectMap.put("instAdmCode", instAdmCode);
			
			List<TabMediationVO> pladefList = mediationService.pladefSelect(selectMap);
			
			NexacroResult result = new NexacroResult();
			
			result.addDataSet("ds_output", pladefList);
			
			return result;
		
		}
		
		//조정안 목록조회
				@RequestMapping(value="bottom/bottomSelect.do")
				public NexacroResult bottomSearch(
						@ParamVariable(name = "lawsuitAdmNo") String lawsuitAdmNo,
						@ParamVariable(name = "instAdmCode") String instAdmCode) {
					
					Map<String, Object> selectMap = new HashMap<String, Object>();
					
					selectMap.put("lawsuitAdmNo", lawsuitAdmNo);
					selectMap.put("instAdmCode", instAdmCode);
					
					List<TabMediationVO> bottomList = mediationService.bottomSearch(selectMap);
					
					NexacroResult result = new NexacroResult();
					
					result.addDataSet("ds_output", bottomList);
					
					return result;
				
				}
				
				//조정안 저장/수정/삭제
				@RequestMapping(value="mediation/mediationSave.do")
				public NexacroResult mediationSave(
						@ParamDataSet(name = "ds_input") List<TabMediationVO> MediationVO,
						@ParamDataSet(name = "ds_input2") List<TabMediationVO> MediationVO2,
						@ParamVariable(name = "lawAdmNo", required=false) String lawAdmNo, 		//소송관리번호
						@ParamVariable(name = "instCode", required=false) String instCode)		//심급관리번호
/*						@ParamVariable(name = "pladefSepCode", required=false) String pladefSepCode,	//원피고구분코드
						@ParamVariable(name = "pladefSeq", required=false) int pladefSeq){				//원피고일련번호
*/					{
					System.out.println("VO 1 = " + MediationVO);
					System.out.println("VO 2 = " + MediationVO2);
					
					
					
					
					
					TabMediationVO vo = MediationVO.get(0);
						vo.setLawsuitAdmNo(lawAdmNo);
						vo.setInstAdmCode(instCode);
						vo.setPladefSepCode(MediationVO2.get(0).getPladefSepCode());
						vo.setPladefSeq(MediationVO2.get(0).getMediationSeq());
						/*vo.setPladefSepCode(pladefSepCode);
						vo.setPladefSeq(pladefSeq);
						*/MediationVO.set(0, vo);
						
						
					String confirmStr = mediationService.mediationSave(MediationVO, lawAdmNo, instCode);
					
					NexacroResult result = new NexacroResult();
					
					result.addVariable("confirmStr", confirmStr);
					
					return result;
					
				}
}
