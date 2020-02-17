package test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import q1.Cliente;
import q1.Empresa;
import q1.Endereco;
import q1.Funcionario;

class EmpresaTest {
	
	public Empresa empresa;
	public Funcionario presidente;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Funcionario[] funcs = new Funcionario[100];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < funcs.length; i++) {
			System.out.println("Insira o endereco: ");
			String endereco = sc.nextLine();
			System.out.println("Insira o Telefone: ");
			String telefone = sc.nextLine();
			System.out.println("Insira o Cep: ");
			int cep = sc.nextInt();
			System.out.println("Insira a Cidade: ");
			String cidade = sc.nextLine();
			System.out.println("Insira o UF: ");
			String uf = sc.nextLine();
			Endereco end = new Endereco(endereco, telefone, cep, cidade, uf);
			System.out.println("Insira o nome do funcionario: ");
			String nome = sc.nextLine();
			System.out.println("Insira o Sexo: ");
			char sexo = sc.nextLine().charAt(0);
			System.out.println("Insira a idade: ");
			int idade = sc.nextInt();
			System.out.println("Insira o CPF: ");
			String cpf = sc.nextLine();
			System.out.println("Insira o cargo: ");
			String cargo = sc.nextLine();
			System.out.println("Insira o salario: ");
			int salario = sc.nextInt();
			funcs[i] = new Funcionario(nome, end, sexo, idade, cpf, cargo, salario); 
		}

		Cliente[] clientes = new Cliente[100];
		for(int i = 0; i < clientes.length; i++) {
			Endereco end = //Incompleto
			cliente[i] = new Cliente("Maria", end, "1824", 190248);
		}
		sc.close();		

		Endereco endDaEmpresa = new Endereco("Rua abc", .....);

		Funcionario presidente = new Funcionario("Bill Gates", ....);

		Empresa e = new Empresa("Shulambs", endDaEmpresa, "12381238", presidente, clientes, funcs);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
