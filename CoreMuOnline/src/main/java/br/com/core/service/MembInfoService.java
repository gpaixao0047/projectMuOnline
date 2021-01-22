package br.com.core.service;

import java.util.List;

import br.com.core.entity.MembInfo;

public interface MembInfoService {

	List<MembInfo> listaMembInfo();

	Integer getTotalContas();
}
