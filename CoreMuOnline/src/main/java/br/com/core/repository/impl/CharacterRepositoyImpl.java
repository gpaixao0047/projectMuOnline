package br.com.core.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.core.repository.CharacterRepository;
import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor(onConstructor_= @Autowired)
public class CharacterRepositoyImpl implements CharacterRepository {
	
	private final CharacterRepositorySpringData repository;
	
	@Override
	public Integer getTotalPersonagens() {
		return repository.getTotalPersonagens();
	}

}
