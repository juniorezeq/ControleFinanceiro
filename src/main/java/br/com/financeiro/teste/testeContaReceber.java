package br.com.financeiro.teste;

import br.com.financeiro.modelo.dao.ContaReceberDao;
import br.com.financeiro.modelo.negocio.ContaReceber;

public class testeContaReceber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaReceber conta = new ContaReceber();
		conta.setDescricao("ENEL");
		conta.setValor(210.0);
		
		ContaReceberDao dao = new ContaReceberDao();
		dao.adiciona(conta);
		
		System.out.println("Rodou");

	}

}
