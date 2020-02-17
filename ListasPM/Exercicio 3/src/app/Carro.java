package app;

public class Carro {
	protected int velocidade;
	protected double preco;
	protected String cor;

	public Carro(int velocidade, double preco, String cor) {
		this.velocidade = velocidade;
		this.preco = preco;
		this.cor = cor;
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public String getCor() {
		return cor;
	}

	public double getPrecoVenda() {
		return this.preco;
	}

}
