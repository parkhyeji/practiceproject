package nexacro.aml.dao;

import java.util.List;
import java.util.Map;


//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("ReportManagementDAO")
public class ReportManagementDAO extends NexacroIbatisAbstractDAO {

	//공통코드 로드
	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return list("aml.reportManagementDAO.loadCommonCodes", classCodeMap);
	}

	//보고대상자 및 거래 로드
	@SuppressWarnings("rawtypes")
	public List reportdeal(Map<String, Object> reportload) {
		return list("aml.reportManagementDAO.loadreportdeal", reportload);
	}

	//객관적질의 로드
	@SuppressWarnings("rawtypes")
	public List loadQuery(Map<String, Object> querycodemap) {
		return list("aml.reportManagementDAO.loadQuery", querycodemap);
	}

	//종합의견 로드
	@SuppressWarnings("rawtypes")
	public List oppi(Map<String, Object> oppi) {
		return list("aml.reportManagementDAO.oppi", oppi);
	}

	//보고대상자 저장
	public void insertCust(Map map) {
		insert("aml.reportManagementDAO.insertCust", map);
	}

	//보고대상거래 저장
	public void insertCust1(Map map) {
		insert("aml.reportManagementDAO.insertCust1", map);
	}

	//객관적 질의 저장
	public void insertQuery(Map map) {
		insert("aml.reportManagementDAO.insertQuery", map);
	}

	//객관적 질의 수정
	public void updateQuery(Map map) {
		insert("aml.reportManagementDAO.updateQuery", map);
	}

	//객관적 질의 삭재
	public void deleteQuery(Map map) {
		insert("aml.reportManagementDAO.deleteQuery", map);
	}

}
