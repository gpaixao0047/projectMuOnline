package br.com.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.core.repository.CharacterRepository;

@Service
@Transactional
public class CharacterServiceImpl implements CharacterService {
	
	@Autowired
	private CharacterRepository repository;

	@Override
	public Integer getTotalPersonagens() {
		return repository.getTotalPersonagens();
	}

}
