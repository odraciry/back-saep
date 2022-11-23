package com.avaliacao.saep.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.avaliacao.saep.model.Concessionarias;

@Repository
public interface ConcessionariaRespository extends PagingAndSortingRepository<Concessionarias, Long>{

}
