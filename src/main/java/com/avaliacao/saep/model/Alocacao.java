package com.avaliacao.saep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Alocacao {
	@Id
	@Column(unique = true)
	private Long id;
	private Long area;
	private Long automovel;
	private Long concessionaria;
	private Long quantidade;
}
