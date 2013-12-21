package com.linkidiomas.ar.linkconverter.vo.tipo;

import com.linkidiomas.ar.linkconverter.vo.Conversor;

public class ConversorMassa extends Conversor {
	
	private String nome = "Conversor de Massa";
	private String descricao="Quilogramas, libras...";
	
	public ConversorMassa() {
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
