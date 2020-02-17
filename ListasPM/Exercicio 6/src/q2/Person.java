package q2;

import q2.Ordenavel;

//A classe deve ser abstrata por sua natureza genérica, seu papel servirá como caracteristicas para
//seus filhos que possuem especificidade suficiente para começarem a ter sentido de serem instanciados, 
//não há necessidade porém de métodos abstratos por seus filhos utilizarem a mesma regra de négocio na maior
//dos casos

abstract class Person implements Ordenavel{
	
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
	
	@Override
	public boolean menorQue(Ordenavel o) {
		if(o instanceof Person) {
			if(this.getNome().charAt(0)< ((Person) o).getNome().charAt(0)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}



