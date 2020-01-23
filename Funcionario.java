package br.com.herancaepolimorfismo;

public class Funcionario extends Pessoa {
	private String matricula;
	
	public Funcionario(String nome, int data_nascimento, String matricula, String email) {
		super(nome, data_nascimento, email);
		this.matricula = matricula;
	}
		
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
