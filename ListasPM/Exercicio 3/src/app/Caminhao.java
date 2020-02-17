package app;

public class Caminhao extends Carro{

	private int carga;
	
	public Caminhao(int velocidade, double preco, String cor, int carga) {
		super(velocidade, preco, cor);
		 setCarga(carga);
	}
	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public int getCarga() {
		return carga;
	}

	public double getPrecoVenda() {
		if(this.carga>2000) {
			return this.preco*0.9;			
		}else {
			return this.preco*0.8;
		}
	}
	
	

}
