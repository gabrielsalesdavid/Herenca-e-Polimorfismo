package br.com.herancaepolimorfismo;

public class Aluno extends Pessoa {
	private String ra;
	
	public Aluno(String nome, int data_nascimento, String ra, String email) {
		super(nome, data_nascimento, email);
		this.ra = ra;
	}
		
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
}
