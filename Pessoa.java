package br.com.herancaepolimorfismo;

public class Pessoa {
	
		private String nome;
		private int data_nascimento;
		private String email;
		
		public Pessoa(String nome, int data_nascimento, String email) {
			this.nome = nome;
			this.data_nascimento = data_nascimento;
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public void setNome(String nome) {
			 this.nome = nome;
		}
		
		public int getDataNascimento() {
			return this.data_nascimento;
		}
		
		public void setDataNascimento(int data_nascimento) {
			this.data_nascimento = data_nascimento;
		}
		
		public String getEmail() {
			return this.email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
}
