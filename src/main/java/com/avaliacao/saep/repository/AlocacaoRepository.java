package com.avaliacao.saep.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.avaliacao.saep.model.Alocacao;

@Repository
public interface AlocacaoRepository extends PagingAndSortingRepository<Alocacao, Long>{
	
}
