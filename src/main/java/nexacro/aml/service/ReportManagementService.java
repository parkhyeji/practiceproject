package nexacro.aml.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import nexacro.aml.dao.ReportManagementDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("ReportManagementService")
public class ReportManagementService extends AbstractServiceImpl{

	@Resource(name = "ReportManagementDAO")
	private ReportManagementDAO reportManagementDAO;

	//공통코드 로드
	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return reportManagementDAO.loadCommonCode(classCodeMap);
	}

	//보고대상자 및 거래 로드
	@SuppressWarnings("rawtypes")
	public List loadreportdeal(Map<String, Object> reportdeal) {
		return reportManagementDAO.reportdeal(reportdeal);	
	}	

	//객관적 질의 로드
	@SuppressWarnings("rawtypes")
	public List loadQuery(Map<String, Object> querycodemap) {
		return reportManagementDAO.loadQuery(querycodemap);
	}

	//종합의견 로드	
	@SuppressWarnings("rawtypes")
	public List oppi(Map<String, Object> oppi) {
		return reportManagementDAO.oppi(oppi);	
	}		

	//보고대상자 입력
	public void insertCust(Map map) {
		reportManagementDAO.insertCust(map);			
	}

	//보고대상거래 저장
	public void insertCust1(Map map) {
		reportManagementDAO.insertCust1(map);			
	}

	//객관적 질의 저장
	public void insertQuery(Map map) {
		reportManagementDAO.insertQuery(map);			
	}
	//객관적 질의 수정
	public void updateQuery(Map map) {
		
		reportManagementDAO.updateQuery(map);			
	}

	public void deleteQuery(Map query) {
		reportManagementDAO.deleteQuery(query);
	}


}
