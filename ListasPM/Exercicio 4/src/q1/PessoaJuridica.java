package q1;

import java.util.Scanner;

public class PessoaJuridica extends Person{
	
	protected String cnpj;
	
	public PessoaJuridica(String nome, Endereco endereco, String cnpj){
		super(nome, endereco);
		setCnpj(cnpj);		
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	@Override
	public void registrar() {
		Scanner in = new Scanner(System.in);
		this.cnpj = in.nextLine();		
		in.close();
	}
}
