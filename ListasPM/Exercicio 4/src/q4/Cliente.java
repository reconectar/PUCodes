package q4;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private List<Compravel> carrinho;

	public Cliente(String nome) {
		carrinho = new ArrayList<>();
		setNome(nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	void adicionar(Compravel c) {
		this.carrinho.add(c);
	}

	public NotaFiscal emitirNotaFiscal() {
		return new NotaFiscal(this.nome, this.carrinho);
	}

}
