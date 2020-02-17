package q2;

public class Cliente{
	
	private PessoaFisica pF;
	private PessoaJuridica pJ;
	private int limiteDeCredito;
	
	public Cliente(PessoaFisica pF, int limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
		this.pF = pF;
	}

	public Cliente(PessoaJuridica pJ, int limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
		this.pJ = pJ;
	}
	
	public int getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(int limiteDeCredito) throws ArithmeticException{
		if(limiteDeCredito >= 0) {			
			this.limiteDeCredito = limiteDeCredito;
		}else {
			throw new ArithmeticException("Valor menor que 0");
		}
	}	
	
	public PessoaFisica getpF() {
		return pF;
	}

	public void setpF(PessoaFisica pF) {
		this.pF = pF;
	}

	public PessoaJuridica getpJ() {
		return pJ;
	}

	public void setpJ(PessoaJuridica pJ) {
		this.pJ = pJ;
	}

}
