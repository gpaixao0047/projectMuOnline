package br.com.core.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.core.entity.MembInfo;
import br.com.core.repository.MembInfoRepository;
import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor(onConstructor_= @Autowired)
public class MembInfoRepositoryImpl implements MembInfoRepository{
	
	private final MembInfoRepositorySpringData repository;

	@Override
	public List<MembInfo> listMembInfo() {
		return repository.findAll();
	}

	@Override
	public Integer getTotalContas() {
		return repository.getTotalContas();
	}

}
