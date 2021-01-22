package br.com.front.controller;

import java.util.List;

import br.com.front.bean.MembInfoBean;
import br.com.front.feign.FeignBuilder;
import br.com.front.service.MembInfoService;

public class MembInfoController {
	private static final MembInfoService service = FeignBuilder.getInstanceWithTokenAcess(MembInfoService.class);

	public List<MembInfoBean> getAll() throws Exception {
		return service.getAll();
	}

	public Integer getTotalContas() {
		return service.getTotalContas();
	}
	
	
}
