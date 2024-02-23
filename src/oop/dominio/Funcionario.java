package oop.dominio;

public class Funcionario {

	private String nome;
	private int idade;
	private double[] salarios;
	private double media;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}
	
	//Média removida
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double[] getSalario() {
		return salarios;
	}
	
	public double geteMedia() {
		return media;
	}
	
	
	
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
		
		for(double salario: salarios) {
			media += salario;
		}
		media /= salarios.length;
		System.out.println("\nMédia salarial " + media);
	}

}
