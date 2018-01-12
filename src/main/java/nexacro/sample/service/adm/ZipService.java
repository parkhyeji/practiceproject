package nexacro.sample.service.adm;

import java.util.List;

import nexacro.sample.adm.vo.ZipVO;

public interface ZipService {
	
	// 우편번호 검색
	List<ZipVO> selectZipCode(ZipVO zipVO);
}
