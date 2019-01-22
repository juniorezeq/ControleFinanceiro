package br.com.financeiro.modelo.negocio;

import java.time.LocalDate;

public interface Lancamento {

	public String getDescricao();
	public LocalDate getVencimento();
	public double getValor();
}
