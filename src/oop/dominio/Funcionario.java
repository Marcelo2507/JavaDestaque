package oop.dominio;

public class Funcionario {

	public String nome;
	public int idade;
	public double[] salarios;
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		if (salarios == null) {
			return;
		}
		
		//Caso não haja salarios
		//if(salarios != null)
		//não presisa abrir chaves se for executar apenas 
		//uma linha de codigo
		for(double salario: salarios) {
			System.out.print(salario + " ");
		}
		
		imprimeMediaSalario();
	}
	
	public void imprimeMediaSalario() {
		//Caso não haja salarios
		if(salarios == null) {
			return;
		}
		//calcular media do salario
		double media = 0;
		for(double salario: salarios) {
			media += salario;
		}
		media /= salarios.length;
		System.out.println("\nMédia salarial " + media);
	}

}
