/*package nexacro.pdlaw.service.impl.rais;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.pdlaw.service.RaisService;
import nexacro.pdlaw.service.dao.ibatis.RaisDAO;
import nexacro.pdlaw.vo.rais.RaisVO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springmodules.validation.util.condition.string.EqualsIgnoreCaseStringCondition;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@Service("raisservice")
public class RaisServiceImpl extends AbstractServiceImpl implements RaisService{
	
	@Resource(name = "raisDAO")
	private RaisDAO raisDAO;

	//소제기 목록
	@Override
	public List<RaisVO> getRaisreqList(Map<String, Object> raisMap) {
		return raisDAO.getRaisreqList(raisMap);			
	}
	@Override
	public List<Map> getRaisreqView(Map<String, Object> raisMap) {
		return raisDAO.getRaisreqView(raisMap);
	}

	//소제기 현황
	@Override
	public List<RaisVO> getRaisreqDetailList(Map<String, Object> raisMap) {
		return raisDAO.getRaisreqDetailList(raisMap);
	}

	//피고 리스트 조회
	@Override
	public List<RaisVO> getRaisreqDefList(Map<String, Object> raisMap) {
		return raisDAO.getRaisreqDefList(raisMap);
	}
	//피고 선택 조회
	@Override
	public List<Map> getRaisreqDefSelectList(String raisreqNo) {
		return raisDAO.getRaisreqDefSelectList(raisreqNo);
	}
	
	
	//의뢰자 조회 
	@Override
	public List<Map> getRaisMenList(Map<String, Object> ListMap) {
		return raisDAO.getRaisMenList(ListMap);
	}
	
	// 소제기 수정
	@Override
	public void procAllRaisreq(List<Map> params) {
		int size = params.size();
		
		for(int i = 0; i < size; i++){
			Map paramMap = params.get(i);
			
			int rowtype = (int) paramMap.get("DataSetRowType");
			
			if (rowtype == DataSet.ROW_TYPE_INSERTED) { //1
				raisDAO.insertRaisreq(paramMap);
			}else if (rowtype == DataSet.ROW_TYPE_UPDATED) { //2
				raisDAO.updateRaisreq(paramMap);
			}		
		
		}
		
	}

	// 회신등록수정
	@Override
	@Transactional
	public void updateRaisereqRep(List<Map> params) {
		int size = params.size();
		
		for(int i = 0; i < size; i++){
			Map paramMap = params.get(i);
			
			int rowtype = (int) paramMap.get("DataSetRowType");
			
			if (rowtype == DataSet.ROW_TYPE_INSERTED) { //1
				raisDAO.insertRep(paramMap);
			}else if (rowtype == DataSet.ROW_TYPE_UPDATED) { //2
				raisDAO.updateRep(paramMap);
			}else if (rowtype == DataSet.ROW_TYPE_DELETED) { //3
				raisDAO.deleteRep(paramMap);
			}		
			
		}
	}

	// 피고등록수정삭제
	@Override
	@Transactional
	public void saveDefAll(List<Map> params) {
		int size = params.size();
		
		for(int i = 0; i < size; i++){
			Map paramMap = params.get(i);
			
			int rowtype = (int) paramMap.get("DataSetRowType");
			
			if (rowtype == DataSet.ROW_TYPE_INSERTED) { //1
				raisDAO.insertDefAll(paramMap);
			}else if (rowtype == DataSet.ROW_TYPE_UPDATED) { //2
				raisDAO.updateDefAll(paramMap);
			}else if (rowtype == DataSet.ROW_TYPE_DELETED) { //3
				//raisDAO.deleteDefAll(paramMap);
			}			
		}
	}
	
	//소제기 등록
	@Override
	public void insertRaisreq(Map<String, Object> selectMap) {
		raisDAO.insertRaisreq(selectMap);
	}
	
	
	@Override
	public void deleteRaisReq(String string) {
		raisDAO.deleteRaisReq(string);
	}

	public void insertRaisReq(Map<String, Object> raisMap) {
		raisDAO.insertRaisreq(raisMap);
	}
	@Override
	public void updateRaisReq(Map<String, Object> raisMap) {
		raisDAO.updateRaisreq(raisMap);
		
	}
	
	@Override
	public void insertDefAll(List<Map> defParams) {
		for (int i = 0; i < defParams.size(); i++) {
			Map<String, Object> defMap = defParams.get(i);
			raisDAO.insertDefAll(defMap);
		}
		
	}
	
	@Override
	public void updateDefAll(List<Map> defParams) {
		for (int i = 0; i < defParams.size(); i++) {
			Map<String, Object> defMap = defParams.get(i);
			
		
			int rowtype = (int) defMap.get("DataSetRowType");
			
			System.out.println("=======================" + rowtype);
			
			switch (rowtype) {
				case DataSet.ROW_TYPE_INSERTED:
					raisDAO.insertDefAll(defMap);
					break;
				case DataSet.ROW_TYPE_UPDATED:
					raisDAO.updateDefAll(defMap);
					break;
				case DataSet.ROW_TYPE_DELETED:
					raisDAO.deleteDefOne(defMap);
					break;
				default:
					break;
			}
		}
		
	}
	@Override
	public void deleteDefAll(String string) {
		raisDAO.deleteDefAll(string);
	}
	@Override
	public List<Map> getRaisreqDefSearch(List<Map> searchParams) {
		
		Map<String, Object>	defSearchMap = null;
		
		if(searchParams != null && searchParams.size() > 0){
			defSearchMap = searchParams.get(0);			
		}else{
			defSearchMap = new HashMap<String, Object>();
		}
		
		return raisDAO.getRaisreqDefSearch(defSearchMap);
	}


	
	
	
	
	
	
	
	
	
	public void getRaisreqList(DataSetMap tranInfo, Map<String, Object> inVar,
			Map<String, DataSetMap> inDataset, Map<String, Object> outVar,
			Map<String, DataSetMap> outDataset) {
		// TODO Auto-generated method stub
		
		RaisVO raisVO = new RaisVO();
		
		raisVO.setLawRaisreqNo((String) inVar.get("lawRaisreqNo"));
		// raisVO.setLawRaisreqClasCode((String) inVar.get("lawRaisreqClasCode"));
		// raisVO.setLawRaisreqReqDate1((String) inVar.get("lawRaisreqReqDate1"));
		// raisVO.setLawRaisreqReqDate2((String) inVar.get("lawRaisreqReqDate2"));
		// raisVO.setLawRaisreqRepWtr((String) inVar.get("lawRaisreqRepWtr"));

		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Map> records = raisDAO.getRaisreqList(raisVO);
		DataSetMap dsMap = new DataSetMap();
		dsMap.setRowMaps(records);

		outDataset.put("ds_output", dsMap);
	}
	
	// 소제기현황
	public void getRaisreqDetailList(DataSetMap tranInfo, Map<String, Object> inVar,
			Map<String, DataSetMap> inDataset, Map<String, Object> outVar, Map<String, 
			DataSetMap> outDataset) {
		// TODO Auto-generated method stub
		RaisVO raisVO = new RaisVO();
		
		raisVO.setLawRaisreqReqId((String) inVar.get("edt_ID"));
		raisVO.setLawRaisreqClasCode((String) inVar.get("combo_Clas_Code"));
		raisVO.setLawRaisreqReqDate1((String) inVar.get("cal_Req_Date1"));
		raisVO.setLawRaisreqReqDate2((String) inVar.get("cal_Req_Date2"));
		raisVO.setLawRaisreqRepWtr((String) inVar.get("radio_Wtr"));
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Map> records = raisDAO.getRaisreqDetailList(raisVO);
		
		
		System.out.println("=====================================================================================");
		System.out.println("==============> "+records);
		System.out.println("=====================================================================================");
		DataSetMap dsMap = new DataSetMap();
		dsMap.setRowMaps(records);

		outDataset.put("ds_output", dsMap);
	}
	
	// 소제기 수정
	@Override
	public int procAllRaisreq(DataSetMap tranInfo, Map inVariableMap,
			Map inDataSetMap, Map ouVariableMap, Map outDataSetMap) {
		int result = 0;
		DataSetMap list = (DataSetMap) inDataSetMap.get("ds_input");
		
		for (int i = 0; i < list.size(); i++) {
			Map map = list.get(i);

			int rowType = ((Integer) map
					.get(XPlatformConstant.DATASET_ROW_TYPE)).intValue();
			
			// map.put("registerId", inVariableMap.get("registerId"));
			
			if (rowType == DataSet.ROW_TYPE_INSERTED) {
				raisDAO.insertRaisreq(map);
			}else if (rowType == DataSet.ROW_TYPE_UPDATED) {
				raisDAO.updateRaisreq(map);
			}		
		}
		
		return result;
	}
	

	// 회신등록수정	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int updateRaisereqRep(DataSetMap tranInfo, Map inVariableMap,
			Map inDataSetMap, Map ouVariableMap, Map outDataSetMap)
			throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		DataSetMap list = (DataSetMap) inDataSetMap.get("ds_input");
		for (int i = 0; i < list.size(); i++) {
			Map map = list.get(i);

			int rowType = ((Integer) map
					.get(XPlatformConstant.DATASET_ROW_TYPE)).intValue();
			
			// map.put("registerId", inVariableMap.get("registerId"));
			
			if (rowType == DataSet.ROW_TYPE_INSERTED) {
				raisDAO.insertRep(map);
			}else if (rowType == DataSet.ROW_TYPE_UPDATED) {
				raisDAO.updateRep(map);
			}else if (rowType == DataSet.ROW_TYPE_DELETED) {
				raisDAO.deleteRep(map);
			}		
		}
		return result;
	}
	
	// 피고조회
	public void getRaisreqDefList(DataSetMap tranInfo, Map<String, Object> inVar,
			Map<String, DataSetMap> inDataset, Map<String, Object> outVar,
			Map<String, DataSetMap> outDataset) {
		// TODO Auto-generated method stub
		
		RaisVO raisVO = new RaisVO();
		
		raisVO.setRaisreqNo((String) inVar.get("lawRaisreqNo"));

		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Map> records = raisDAO.getRaisreqDefList(raisVO);
		DataSetMap dsMap = new DataSetMap();
		dsMap.setRowMaps(records);

		outDataset.put("ds_output", dsMap);
	}
	
	// 피고등록수정삭제
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int saveDefAll(DataSetMap tranInfo, Map inVariableMap,
			Map inDataSetMap, Map ouVariableMap, Map outDataSetMap)
			throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		DataSetMap list = (DataSetMap) inDataSetMap.get("ds_input");
		for (int i = 0; i < list.size(); i++) {
			Map map = list.get(i);

			int rowType = ((Integer) map
					.get(XPlatformConstant.DATASET_ROW_TYPE)).intValue();
			
			map.put("registerId", inVariableMap.get("registerId"));
			
			if (rowType == DataSet.ROW_TYPE_INSERTED) {
				raisDAO.insertDefAll(map);
			}else if (rowType == DataSet.ROW_TYPE_UPDATED) {
				raisDAO.updateDefAll(map);
			}else if (rowType == DataSet.ROW_TYPE_DELETED) {
				raisDAO.deleteDefAll(map);
			}			
		}
		return result;
	}
}
*/