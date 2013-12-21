package com.linkidiomas.ar.linkconverter.vo.tipo;

import com.linkidiomas.ar.linkconverter.vo.Conversor;

public class ConversorMoeda extends Conversor{
	
	private String nome = "Conversor de Moedas";
	private String descricao = "Dolar, real, libra...";
	
	public ConversorMoeda() {
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
