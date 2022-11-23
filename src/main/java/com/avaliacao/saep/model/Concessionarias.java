package com.avaliacao.saep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Concessionarias {
	@Id
	@Column(unique = true)
	private long id;
	private String concessionaria;
}
