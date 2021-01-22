package br.com.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.core.entity.MembInfo;
import br.com.core.repository.MembInfoRepository;
@Service
@Transactional
public class MembInfoServiceImpl implements MembInfoService {
	
	@Autowired
	private  MembInfoRepository repository;
	
	@Override
	public List<MembInfo> listaMembInfo() {
		return repository.listMembInfo();
	}

	@Override
	public Integer getTotalContas() {
		return repository.getTotalContas();
	}

}
