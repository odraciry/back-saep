package com.avaliacao.saep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Automoveis {
	@Id
	@Column(unique = true)
	private Long id;
	private String modelo;
	private String preco;
}
