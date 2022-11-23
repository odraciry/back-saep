package com.avaliacao.saep.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.saep.model.Concessionarias;
import com.avaliacao.saep.repository.ConcessionariaRespository;

@RestController
@RequestMapping("/concessionaria")
public class ConcessionariaRest {
	@Autowired
	private ConcessionariaRespository repository;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public Iterable<Concessionarias> getConcessionarias(){
		return repository.findAll();
	}
}
