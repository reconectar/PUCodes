package app;

public class Sedan extends Carro{
	private int comprimento;
	
	public Sedan(int velocidade, double preco, String cor, int comprimento) {
		super(velocidade, preco, cor);
		setComprimento(comprimento);
	}
	
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getPrecoVenda() {
		if(this.comprimento > 6) {
			return this.preco*0.95;
		}else {
			return this.preco*0.9;
		}
	}

	public int getComprimento() {
		return comprimento;
	}

}
