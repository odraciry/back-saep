package com.avaliacao.saep.restController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.saep.model.Automoveis;
import com.avaliacao.saep.repository.AutomovelRepository;

@RestController
@RequestMapping("/automoveis")
public class AutomovelRestController {
	@Autowired
	private AutomovelRepository repository;
	
	@RequestMapping("/getAutomovel/{id}")
	public Optional<Automoveis> getAutomovel(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
}
