package oop.test;

import oop.dominio.Pessoa;

public class PessoaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		//pessoa.nome = "Marcelo";
		pessoa.setNome("MarceloA_Pucci");
		//pessoa.idade = 19;
		pessoa.setIdade(20);
		
		//pessoa.imprimi();
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		
	}

}
