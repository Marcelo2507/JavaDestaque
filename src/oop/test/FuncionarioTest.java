package oop.test;

import oop.dominio.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "Luigi";
		funcionario.idade = 04;
		funcionario.salarios = new double[]{2000, 1000, 3000};
		
		funcionario.imprime();
	}

}
