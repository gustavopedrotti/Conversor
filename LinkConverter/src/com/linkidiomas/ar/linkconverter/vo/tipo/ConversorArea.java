package com.linkidiomas.ar.linkconverter.vo.tipo;

import com.linkidiomas.ar.linkconverter.vo.Conversor;

public class ConversorArea extends Conversor {
	
	private String nome = "Conversor de Unidades de Área";
	private String descricao = "Metros quadrados, acres, hectares...";
	
	public ConversorArea() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}