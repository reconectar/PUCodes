package q1;
import java.util.ArrayList;
import java.util.List;

public class Empresa extends PessoaJuridica{
	
	private Funcionario presidente;
	private List<Person> clientes;
    private List<Person> funcionarios;
	
	public Empresa(String nome, Endereco endereco, String cnpj, Funcionario presidente){
		super(nome, endereco, cnpj);
		this.presidente = presidente;
		this.clientes = new ArrayList<>();
		this.funcionarios = new ArrayList<>();
	}

	public List<Person> getClientes() {
		return clientes;
	}
	
	public void registrarPessoa(Person p) {
		p.registrar();		
	}

	public void setClientes(ArrayList<Person> clientes) {
		this.clientes = clientes;
	}

	public List<Person> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Person> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario getPresidente() {
		return presidente;
	}

	public void setPresidente(Funcionario presidente) {
		this.presidente = presidente;
	}
	
	@Override
	public String toString() {
		return (nome + "\n Presidente: " + presidente + "\n" + clientes + "\n" + funcionarios);
	}

}
