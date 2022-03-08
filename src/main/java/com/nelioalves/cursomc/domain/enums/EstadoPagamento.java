package com.nelioalves.cursomc.domain.enums;

import org.hibernate.boot.model.naming.IllegalIdentifierException;

public enum EstadoPagamento {

	PENDENTE(1, "Estado Pendente"),
	QUITADO(2, "Estado Quitado"),
	CANCELADO(3, "Estado Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;		
	}
	
	public int getCod() {
		return cod;
	}
	
	public String descricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum (Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalIdentifierException("Id invalido " + cod);
	}
	
}
