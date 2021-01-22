package br.com.core.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import br.com.core.entity.Personagens;

public interface CharacterRepositorySpringData  extends JpaRepository<Personagens, Integer>, JpaSpecificationExecutor<Personagens> {

	@Query("SELECT COUNT(Name) FROM Personagens")
	Integer getTotalPersonagens();

}
