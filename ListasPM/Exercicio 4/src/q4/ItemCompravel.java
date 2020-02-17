package q4;

public abstract class ItemCompravel implements Compravel {
	
	protected String nome;
	protected float preco;
	
	public ItemCompravel(String nome, float preco) {
		setNome(nome);
		setPreco(preco);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
