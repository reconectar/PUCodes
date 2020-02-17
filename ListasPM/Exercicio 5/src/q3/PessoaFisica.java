package q3;
import java.util.Scanner;

public class PessoaFisica extends Person {
	
	protected char sexo;
	protected int idade;
	protected String cpf;
	
	
	public PessoaFisica(String nome, Endereco endereco, char sexo, int idade, String cpf){
		super(nome, endereco);
		setSexo(sexo);
		setIdade(idade);
		setCpf(cpf);
	}
	
	@Override
	public void registrar() {
		Scanner in = new Scanner(System.in);
		this.sexo = in.nextLine().charAt(0);
		this.idade = in.nextInt();
		this.cpf = in.nextLine();		
		in.close();
	}

	public boolean isMaior(int idadeRecebida) {
		return (idadeRecebida>=18);
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;		
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}	
}
