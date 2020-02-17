package q4;

public class PecaUsada extends Peca {

	public PecaUsada(String nome, float preco) {
		super(nome, preco);
	}

	@Override
	public float getPreco() {
		return this.preco*0.7F;
	}
	
	@Override
	public String getNome() {
		return super.nome + "(Usada)";
	}
	

}
