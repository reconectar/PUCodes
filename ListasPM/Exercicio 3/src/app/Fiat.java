package app;

public class Fiat extends Carro{
	
	private int descontoDeFabrica;
	
	public Fiat(int velocidade, double preco, String cor, int descontoDeFabrica) {
		super(velocidade, preco, cor);
		setDescontoDeFabrica(descontoDeFabrica);
	}	
	
	public int getDescontoDeFabrica() {
		return descontoDeFabrica;
	}

	void setDescontoDeFabrica(int descontoDeFabrica){
		this.descontoDeFabrica = descontoDeFabrica;
	}
	
	public double getPrecoVenda() {
		return this.preco-descontoDeFabrica;
	}

}

