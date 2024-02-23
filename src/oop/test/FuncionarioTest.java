package oop.test;

import oop.dominio.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Marconi");
		funcionario.setIdade(42);
		funcionario.setSalarios(new double[]{2000, 1000, 3000});
	
		
		funcionario.imprime();
	}

}
