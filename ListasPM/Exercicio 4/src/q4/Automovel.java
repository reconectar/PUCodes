package q4;

public class Automovel extends ItemCompravel {
	
	private int ano;
	private String cor;
	
	Automovel(String nome, float preco, int ano, String cor){
		super(nome, preco);
		setAno(ano);
		setCor(cor);
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
