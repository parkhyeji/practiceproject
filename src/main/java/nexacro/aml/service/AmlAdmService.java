package nexacro.aml.service;

import java.security.MessageDigest;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.AmlAdmDAO;

import org.springframework.stereotype.Service;

@Service("amlAdmService")
public class AmlAdmService {

	@Resource(name = "amlAdmDAO")
	private AmlAdmDAO amlAdmDAO;
	
	@SuppressWarnings("rawtypes")
	//직원 로그인
	public List login(Map<String, Object> params) throws Exception{
		String pw = (String)params.get("pw");
		String pwEnx = getEncSHA256(pw).substring(0, 19);
		params.put("pw", pwEnx);
		return amlAdmDAO.login(params);
	}
	
	// 아이디 체크
	public List selectId(Map map) {
		return amlAdmDAO.selectId(map);
	}

	// 회원가입
	@SuppressWarnings("unchecked")
	public void insert(Map map) throws Exception{
		String pw = (String)map.get("pwd");
		String pwEnx = getEncSHA256(pw).substring(0, 19);
		map.put("pwd", pwEnx);
		amlAdmDAO.insert(map);
	}
	
	//pw 암호화
	public String getEncSHA256(String txt) throws Exception{
	    StringBuffer sbuf = new StringBuffer();
	     
	    MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
	    mDigest.update(txt.getBytes());
	     
	    byte[] msgStr = mDigest.digest() ;
	     
	    for(int i=0; i < msgStr.length; i++){
	        byte tmpStrByte = msgStr[i];
	        String tmpEncTxt = Integer.toString((tmpStrByte & 0xff) + 0x100, 16).substring(1);
	         
	        sbuf.append(tmpEncTxt) ;
	    }
	     
	    return sbuf.toString();
	}
}
