package br.com.core.repository;

import java.util.List;

import br.com.core.entity.MembInfo;

public interface MembInfoRepository {

	List<MembInfo> listMembInfo();

	Integer getTotalContas();
}
