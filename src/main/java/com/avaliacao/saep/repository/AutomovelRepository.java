package com.avaliacao.saep.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.avaliacao.saep.model.Automoveis;

public interface AutomovelRepository extends PagingAndSortingRepository<Automoveis, Long> {
 
}
