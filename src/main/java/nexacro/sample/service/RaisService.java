package nexacro.sample.service;

import java.util.List;
import java.util.Map;

//scmoon 주석
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/

import nexacro.sample.vo.RaisVO;



public interface RaisService {
	//소제기 목록
	List<RaisVO> getRaisreqList(Map<String, Object> raisMap);//일반 검색
	List<Map> getRaisreqView(Map<String, Object> raisMap);//회신전용 검색
	
	List<RaisVO> getRaisreqDetailList(Map<String, Object> raisMap); //소제기 현황
	
	List<RaisVO> getRaisreqDefList(Map<String, Object> raisMap); //피고 리스트 조회
	List<Map> getRaisreqDefSelectList(String raisreqNo); //피고 상세 조회 
	
	void procAllRaisreq(List<Map> params); // 소제기 수정
	void updateRaisereqRep(List<Map> params); // 회신등록수정
	void saveDefAll(List<Map> params); // 피고등록수정삭제
	void insertRaisreq(Map<String, Object> selectMap); //소제기 등록
	List<Map> getRaisMenList(Map<String, Object> ListMap); //소제기 의뢰자 검색
	
	List<Map> getRaisreqDefSearch(List<Map> searchParams); //피고 검색 후 목록 출력
	
	
	//삭제
	void deleteDefAll(String string);
	void deleteRaisReq(String string);

	//삽입
	void insertRaisReq(Map<String, Object> raisMap);
	void insertDefAll(List<Map> defParams);
	//수정
	void updateRaisReq(Map<String, Object> raisMap);
	void updateDefAll(List<Map> defParams);
	
	
	
	
	//소제기 수정
	//회신등록수정
	
	//피고등록수정삭제
	
	/*//소제기 목록 
	void getRaisreqList(DataSetMap tranInfo,
			Map<String, Object> inVar,
			Map<String, DataSetMap> inDataset,
			Map<String, Object> outVar,
			Map<String, DataSetMap> outDataset);
	
	// 소제기현황
	void getRaisreqDetailList(DataSetMap tranInfo,
			Map<String, Object> inVar,
			Map<String, DataSetMap> inDataset,
			Map<String, Object> outVar,
			Map<String, DataSetMap> outDataset);
	
	// 소제기 수정
	int procAllRaisreq(DataSetMap tranInfo, 
			Map inVariableMap, Map inDataSetMap,
			Map ouVariableMap, Map outDataSetMap);

	// 회신등록수정
	@SuppressWarnings("rawtypes")
	int updateRaisereqRep(DataSetMap tranInfo, 
			Map inVariableMap, Map inDataSetMap,
			Map ouVariableMap, Map outDataSetMap) throws Exception;
	
	// 피고조회
	void getRaisreqDefList(DataSetMap tranInfo,
			Map<String, Object> inVar,
			Map<String, DataSetMap> inDataset,
			Map<String, Object> outVar,
			Map<String, DataSetMap> outDataset);
	
	// 피고등록수정삭제
	@SuppressWarnings("rawtypes")
	int saveDefAll(DataSetMap tranInfo, 
			Map inVariableMap, Map inDataSetMap,
			Map ouVariableMap, Map outDataSetMap) throws Exception;*/
}
