package com.projetobasico.view;

import com.projetobasico.model.Pessoa;
import com.projetobasico.model.dao.PessoaJpaDao;

public class Main {

	public static void main(String[] args) {
		System.out.println("#### inciou o programa ####");
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Eber Lucas C Elias");
		pessoa.setCpf("708.309.561-23");
		pessoa.setSexo("M");

		PessoaJpaDao dao = new PessoaJpaDao();
		dao.salvar(pessoa);
	}	
}