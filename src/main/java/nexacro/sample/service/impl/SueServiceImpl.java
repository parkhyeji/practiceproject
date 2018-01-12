package nexacro.sample.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import nexacro.sample.service.SueService;
import nexacro.sample.service.dao.ibatis.SueDAO;
import nexacro.sample.vo.SueVO;

@Service("sueService")
public class SueServiceImpl extends AbstractServiceImpl implements SueService {

	@Resource(name="sueDAO")
	private SueDAO sueDAO;
	
	@Override
	public List<SueVO> sueMenList(Map<String, Object> sueMap) {
		// TODO Auto-generated method stub
		return sueDAO.sueMenList(sueMap);
		
	}
	
	@Override
	public List<Map> sueView(Map<String, Object> sueMap) {
		// TODO Auto-generated method stub
		//System.out.println("I reached serviceimpl");
		return sueDAO.sueView(sueMap);
	}
	
	@Override
	@Transactional
	public void sueUpdate(List<Map> params) {
		// TODO Auto-generated method stub
		Map paramMap = new HashMap(); 
		for(int i=0; i<params.size(); i++){
			paramMap = params.get(i);
			System.out.println("map param=="+paramMap.toString());
		}	
			sueDAO.sueUpdate(paramMap);
			
			//int rowtype = (int) paramMap.get("DataSetRowType");
			//System.out.println("rowType=="+rowtype);
			
			/*if(rowtype==DataSet.ROW_TYPE_INSERTED){
				System.out.println("this is no joke1"+DataSet.ROW_TYPE_INSERTED);
				
			}else if(rowtype==DataSet.ROW_TYPE_UPDATED){
				System.out.println("this is no joke2"+DataSet.ROW_TYPE_UPDATED);
				
			}else if(rowtype==DataSet.ROW_TYPE_DELETED){
				System.out.println("this is no joke3"+DataSet.ROW_TYPE_DELETED);
				
			}
		}*/
	}
	
	@Override
	public int sueTotalCnt() {
		// TODO Auto-generated method stub
		return sueDAO.sueTotalCnt();
	}
	
}
