package q1;

public class Person {
	private String nome;
	private String sexo;
	private String idade;
	private String estadoCivil;
	
	public Person(String nome, String sexo, String idade, String estadoCivil) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Sexo: " + this.sexo + ", Idade: " + this.idade + ", Estado Civil: " + this.estadoCivil;
	}

	public String getNome() {
		return nome;
	}

}
