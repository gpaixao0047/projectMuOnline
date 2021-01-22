package br.com.core.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import br.com.core.entity.MembInfo;

public interface MembInfoRepositorySpringData extends JpaRepository<MembInfo, Integer>, JpaSpecificationExecutor<MembInfo>{

	@Query("SELECT COUNT(membId) FROM MembInfo")
	Integer getTotalContas();

}
