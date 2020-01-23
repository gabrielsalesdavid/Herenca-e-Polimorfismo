package br.com.herancaepolimorfismo;

public class Cadastro {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Bryan Gabriel", 2014, "bryangabriel@hotmail.com");
		System.out.println(p1.getNome());
		
		Aluno a1 = new Aluno("Rebeca Vitoria", 2018, "425863149", "rebecavitoria@gmail.com");
		System.out.println(a1.getNome());
		
		Funcionario func1 = new Funcionario("Gabriel Sales", 1992, "478535", "gabrielsalesd@gmail.com");
		System.out.println(func1.getNome());
	}

}
