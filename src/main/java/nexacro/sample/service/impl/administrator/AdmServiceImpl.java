package nexacro.sample.service.impl.administrator;

import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.administrator.AdmService;
import nexacro.sample.service.dao.ibatis.administrator.AdmDao;
import nexacro.sample.util.Sha256;
import nexacro.sample.vo.administrator.AdmVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("admService")
public class AdmServiceImpl extends EgovAbstractServiceImpl implements AdmService {
	
	@Resource(name = "admDao")
	private AdmDao admDao;
	
	// 로그인
	@Override
	public AdmVO selectLogin(Map<String, String> loginMap) {
		
		AdmVO admVO = new AdmVO();
		
		admVO = admDao.selectId(loginMap.get("id"));
		
		if(admVO.getInsaId().equals("NONE") || admVO.getInsaId() == null){
			admVO.setMsg("none");
			return admVO;
		}else{
			admVO = admDao.selectLogin(loginMap);
			
			if(admVO != null){
				
				String insertPwd = loginMap.get("pwd");
				String dbPwd = admVO.getInsaPwd();
				
				if(!dbPwd.equals(Sha256.encrypt(insertPwd))){
					admVO.setMsg("password");
				}else{
					admVO.setMsg("ok");
				}
				
			}else{
				admVO.setMsg("noid");
			}
			
			return admVO;
		}
	}
	
	// 존재하는 아이디인지 검색
	@Override
	public AdmVO selectId(String id) {
		AdmVO admVO = admDao.selectId(id);
		
		if(admVO.getInsaId().equals("NONE") || admVO.getInsaId() == null){
			admVO.setMsg("none");
		}
		
		return admVO;
	}
	
	// 회원가입
	@Override
	public void insertAdm(AdmVO admVO) {
		//System.out.println(admVO.getBirth());
		//System.out.println(admVO.getBackBirth());
		admVO.setInsaPwd(Sha256.encrypt(admVO.getInsaPwd()));
		
		//테이블 칼럼 열초과문제로 주민번호 뒷자리는 암호화 불가 테이블 수정시 밑에 주석살려서 암호화처리할것
		//admVO.setBackBirth(Sha256.encrypt(admVO.getBackBirth()));
		
		admDao.insertAdm(admVO);
		
	}
	
}
