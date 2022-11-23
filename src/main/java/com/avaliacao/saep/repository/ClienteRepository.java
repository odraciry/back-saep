package com.avaliacao.saep.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.avaliacao.saep.model.Clientes;

@Repository
public interface ClienteRepository extends PagingAndSortingRepository<Clientes, Long>{

}
