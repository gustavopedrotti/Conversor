package com.linkidiomas.ar.linkconverter.vo.tipo;

import com.linkidiomas.ar.linkconverter.vo.Conversor;

public class ConversorTemperatura extends Conversor {
	
	private String nome = "Conversor de Unidades Temperatura";
	private String descricao = "Celcius, Fahrenheit e Kelvin";
	
	public ConversorTemperatura() {
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
