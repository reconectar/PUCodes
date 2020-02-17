package atividade1labIII;

public class Celula {

	private Object prox;
	private Object valor;
	
	public Celula () {
		this.prox = null;
	}
	
	public Celula (Celula prox) {
		this.prox = prox;
		this.valor = null;
	}
	
	public Celula (Object valor) {
		this.prox = null;
		this.valor = valor;
	}
	
	public Celula (Celula prox, int valor) {
		this.prox = prox;
		this.valor = null;
	}

	public Object getValor() {
		return valor;
	}
	
	public Object getProx() {
		return prox;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public void setProx(Object prox) {
		this.prox = prox;
	}
}