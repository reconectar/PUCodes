package app;

public class RunConta {

	public static void main(String[] args) {
		int i, n = 2;
		Conta[] contas = new Conta[n];
		contas[0] = new Conta(100, "1");
		contas[1] = new Conta(1000, "2");
		for (i = 0; i < n; i++) {
			System.out.println(
					"A conta de numero " + contas[i].getConta() + " possui " + contas[i].getSaldo() + " de Saldo");
			if (i == n - 1) {
				System.out.println(contas[i]);
			}
		}
		contas[0].transferencia(contas[0], contas[1], 100); //duvida metodo
		System.out.println(contas[0].getSaldo() + " e " + contas[1].getSaldo());
	}
}