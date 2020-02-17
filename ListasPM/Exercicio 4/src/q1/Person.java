package q1;

abstract class Person {
	
	protected String nome;
	protected Endereco endereco;
	
	public Person() {
		this.nome = "Capistrano(a)";
		this.endereco = null;
	}	
	
	public abstract void registrar();
	
	public Person (String nome, Endereco endereco){
		setNome(nome);
		setEndereco(endereco);
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;		
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}



