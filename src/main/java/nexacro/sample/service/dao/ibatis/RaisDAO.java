package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("raisDAO")
public class RaisDAO extends NexacroIbatisAbstractDAO {
	
	// 피고조회
	@SuppressWarnings("rawtypes")
	public List getRaisreqDefList(Map<String, Object> raisMap) {
		return list("rais.raisDAO.getRaisreqDefList", raisMap);
	}
	// 피고선택
	@SuppressWarnings("rawtypes")
	public List getRaisreqDefSelectList(String raisreqNo) {
		return list("rais.raisDAO.getRaisreqDefSelectList", raisreqNo);
	}
	
	/* raisreq_list.xfdl*/
		@SuppressWarnings("rawtypes")
		public List getRaisreqDetailList(Map<String, Object> raisMap) {
			return list("rais.raisDAO.getRaisreqDetailList", raisMap);
		}
	
	/* pop_raisreq_sch.xfdl, pop_raisreq_reply_sch.xfdl*/
		//소제기 일반 조회
		@SuppressWarnings("rawtypes")
		public List getRaisreqList(Map<String, Object> raisMap) {
			return list("rais.raisDAO.getRaisreqList", raisMap);
		}
	
	/*raisreq_rep.xfdl*/
		//소제기 회신용 조회
		@SuppressWarnings("rawtypes")
		public List getRaisreqView(Map<String, Object> raisMap) {
			return list("rais.raisDAO.getRaisreqView", raisMap);
		}
		
		//회신 등록, 수정, 삭제 
		public void insertRep(Map<String, Object> paramMap) {
			insert("rais.raisDAO.insertRep", paramMap);
			
		}
		public void updateRep(Map<String, Object> paramMap) {
			update("rais.raisDAO.updateRep", paramMap);
			
		}
		public void deleteRep(Map<String, Object> paramMap) {
			delete("rais.raisDAO.deleteRep", paramMap);
			
		}

	/* pop_raisreq_men.xfdl*/
		@SuppressWarnings("rawtypes")
		//소제기 의뢰자 목록
		public List getRaisMenList(Map<String, Object> listMap) {
			return list("rais.raisDAO.getRaisMenList", listMap);
			
		}
	
	/* Raisreq_reg.xdfl */
		//소제기 등록
		public void insertRaisreq(Map<String, Object> paramMap) {
			System.out.println("소제기 등록");
			insert("rais.raisDAO.insertRaisreq", paramMap);
			
		}
		//소제기 수정
		public void updateRaisreq(Map<String, Object> paramMap) {
			update("rais.raisDAO.updateRaisreq", paramMap);
			
		}
		
		//소제기 삭제 
		public void deleteRaisReq(String string) {
			delete("rais.raisDAO.deleteRaisReq", string);
		}
		
		//피고 등록
		public void insertDefAll(Map<String, Object> paramMap) {
			System.out.println("insert라이스레크");
			insert("rais.raisDAO.insertDefAll", paramMap);
			
		}
		//피고 수정
		public void updateDefAll(Map<String, Object> paramMap) {
			update("rais.raisDAO.updateDefAll", paramMap);
			
		}
		//전체 피고 삭제 
		public void deleteDefAll(String string) {
			delete("rais.raisDAO.deleteDefAll", string);
			
		}
		//특정 피고 삭제
		public void deleteDefOne(Map<String, Object> defMap) {
			delete("rais.raisDAO.deleteDefOne", defMap);
		}
		
	/* rais def search.xdfl*/	
		//피고 검색 후 목록 표시
		@SuppressWarnings("rawtypes")
		public List getRaisreqDefSearch(Map<String, Object> defSearchMap) {
			return list("rais.raisDAO.getRaisreqDefSearch", defSearchMap);
		}
	
//	public void deleteDefAll(Map<String, Object> paramMap) {
//		System.out.println("insert라이스레크");
//		delete("rais.raisDAO.deleteDefAll", paramMap);
//		
//	}
	
	/*// 소제기 목록
	@SuppressWarnings("rawtypes")
	public List getRaisreqList(Map<String, Object> raisMap) {
		return list("rais.raisDAO.getRaisreqList", raisMap);
	}
	
	// 소제기형황
	@SuppressWarnings("rawtypes")
	public List getRaisreqDetailList(Map<String, Object> raisMap) {
		return list("rais.raisDAO.getRaisreqDetailList", raisMap);
	}*/
	
	/*// 소제기 수정
	public void insertRaisreq(Map map) {
		// TODO Auto-generated method stub
		insert("rais.raisDAO.insertRaisreq", map);
	}
	
	public int updateRaisreq(Map map) {
		// TODO Auto-generated method stub
		return update("rais.raisDAO.updateRaisreq", map);
	}
	
	// 회신등록
	public void insertRep(Map<String, Object> map) {
		// TODO Auto-generated method stub
		insert("rais.raisDAO.insertRep", map);
	}

	public int updateRep(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return update("rais.raisDAO.updateRep", map);
	}

	public int deleteRep(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return delete("rais.raisDAO.deleteRep", map);
	}*/
	
	
		
	/*// 피고등록수정삭제
	public void insertDefAll(Map<String, Object> map)throws Exception {
		// TODO Auto-generated method stub
		insert("rais.raisDAO.insertDefAll", map);
	}
	
	public int updateDefAll(Map<String, Object> map)throws Exception {
		// TODO Auto-generated method stub
		return update("rais.raisDAO.updateDefAll", map);
	}
	
	public int deleteDefAll(Map<String, Object> map)throws Exception {
		// TODO Auto-generated method stub
		return delete("rais.raisDAO.deleteDefAll", map);
	}*/
}
