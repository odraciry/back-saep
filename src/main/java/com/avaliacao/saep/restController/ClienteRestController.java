package com.avaliacao.saep.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.saep.model.Clientes;
import com.avaliacao.saep.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
	@Autowired
	private ClienteRepository repository;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public Iterable<Clientes> listClientes(){
		return repository.findAll();
	}
}
