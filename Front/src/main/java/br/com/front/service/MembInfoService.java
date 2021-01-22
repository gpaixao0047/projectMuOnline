package br.com.front.service;

import java.util.List;

import br.com.front.bean.MembInfoBean;
import feign.RequestLine;

public interface MembInfoService {
	
	@RequestLine("GET /membinfo")
	public List<MembInfoBean> getAll() throws Exception;

	@RequestLine("GET /membinfo/totalcontas")
	public Integer getTotalContas();
}
