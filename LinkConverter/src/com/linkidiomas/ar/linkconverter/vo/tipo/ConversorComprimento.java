package com.linkidiomas.ar.linkconverter.vo.tipo;

import com.linkidiomas.ar.linkconverter.vo.Conversor;

public class ConversorComprimento extends Conversor {
	
	private String nome = "Conversor de Unidades de Comprimento";
	private String descricao = "Metros, quilômetros, milhas...";
	
	public ConversorComprimento() {
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
