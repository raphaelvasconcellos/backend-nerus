package com.desafio.desafio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Lojas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank
	private long codigo;
	
	@NotBlank
	private String nomeLojas;
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNomeLojas() {
		return nomeLojas;
	}

	public void setNomeLojas(String nomeLojas) {
		this.nomeLojas = nomeLojas;
	}

	
	

}
