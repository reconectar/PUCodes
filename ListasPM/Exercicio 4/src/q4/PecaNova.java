package q4;

public class PecaNova extends Peca {
	
	public PecaNova(String nome, float preco) {
		super(nome, preco);
	}

	@Override
	public float getPreco() {
		return this.preco*1.2F;
	}
	
	@Override
	public String getNome() {
		return super.nome + "(Nova)";
	}
	
}
