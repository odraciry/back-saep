package com.avaliacao.saep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Clientes {
	@Id
	@Column(unique = true)
	private Long id;
	private String nome;
}
