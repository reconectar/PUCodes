package q2;

public class Funcionario extends PessoaFisica{
	
	private String cargo;
	private int salario;
	
	public Funcionario(String nome, Endereco endereco, char sexo, int idade, String cpf, String cargo, int salario) {
		super(nome, endereco, sexo, idade, cpf);
		setCargo(cargo);
		setSalario(salario);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) throws ArithmeticException{
		if(salario>=0) {
			this.salario = salario;
		}else {
			throw new ArithmeticException("Valor menor que 0");
		}
	}
}
