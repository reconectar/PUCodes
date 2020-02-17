package q2;

public class Aplicacao {

	public static void main(String[] args) {
		try {
			PessoaFisica[] pessoas = new PessoaFisica[10];
			for(int i=0; i<10; i++) {
				String nome = i + "Arthur";
				pessoas[i] = new PessoaFisica(nome, null, 'm', i, null);		
			}
			
			pessoas = (PessoaFisica[]) Ordenador.crescente((Ordenavel[]) pessoas);
			for(int i = 0; i<pessoas.length;i++) {
				System.out.println(pessoas[i]);
			}
			pessoas = (PessoaFisica[]) Ordenador.decrescente((Ordenavel[]) pessoas);
			for(int i = 0; i<pessoas.length;i++) {
				System.out.println(pessoas[i]);
			}
			Funcionario funcionario1 = new Funcionario(null, null, 'm', 21, null, null, -1);
		}catch(ArithmeticException a) {
			System.out.println(a);
		}
	}
}
