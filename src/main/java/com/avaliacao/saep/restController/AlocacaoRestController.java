package com.avaliacao.saep.restController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.saep.model.Alocacao;
import com.avaliacao.saep.repository.AlocacaoRepository;

@RestController
@RequestMapping("/saep")
public class AlocacaoRestController {
	@Autowired
	private AlocacaoRepository repository;
	
	@RequestMapping(value="/getAlocacoes", method = RequestMethod.GET)
	public Iterable<Alocacao> getAllAlocacoes(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/getOneAlocacao/{id}", method = RequestMethod.GET)
	public Optional<Alocacao> getAlocacao(@PathVariable("id") long id) {
		return repository.findById(id);
	}
	
}
