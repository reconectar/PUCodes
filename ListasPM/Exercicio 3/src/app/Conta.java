package app;

public class Conta {
	private String numConta;
	private int saldo;
	private static int contador = 0;
	
	public Conta() {
		this.numConta = null;
		this.saldo = 0;
		contador++;
	}
	
	public Conta(int saldo, String numConta) {
		this.numConta = numConta;
		this.saldo = saldo;
		contador++;
	}
	
	public void contaDeposit(int dinheiros, String numConta) {
		if(dinheiros>=0) {
			this.saldo += dinheiros;
		}else {
			System.out.println("Dinheiros negativo não pode!");
		}
	}
	
	public void contaWithdraw(int dinheiros, String numConta) {
		if((dinheiros>=0)&&(this.saldo-dinheiros>=0)) {
			this.saldo -= dinheiros;
		}else {
			System.out.println("Dinheiros negativo não pode!");
		}
	}
	
	public void transferencia(Conta a, Conta b, int quantidade) {
		if(a.saldo>=quantidade) {
			a.contaWithdraw(quantidade, a.numConta);
			b.contaDeposit(quantidade, b.numConta);	
		}	
	}
	
	public String getConta() {
		return this.numConta;
	}

	public int getSaldo() {
		return this.saldo;
	}
	
	public int getContador() {
		return contador;
	}
	
	public String toString() {		
		return ("Existem no total " + contador + " contas registradas");
	}
}
