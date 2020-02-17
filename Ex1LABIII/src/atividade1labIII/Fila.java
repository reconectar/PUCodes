package atividade1labIII;

public class Fila {
	
	public Celula inicio;
	public Celula fim;
	public int quantidade;
	
	public Fila () {
		this.inicio = new Celula(null);
		this.fim = this.inicio;
	}
	
	public void add (Object valor) {
		Celula nova = new Celula(valor);
		this.getFim().setProx(nova);
		this.setFim(nova);
	}
	
	public Object removeFifo () {
		Object valor = null;
		if(!this.estaVazia()) {
			valor = this.inicio.getProx();			
		}		
		if(this.inicio.getProx()!=null) {
			this.inicio.setProx(((Celula)this.inicio.getProx()).getValor());
		}
		else {
			this.inicio.setProx(null);
		}
		return valor;
	}
	
	public boolean estaVazia() {
		return this.inicio==this.fim;
	}
	
	@Override
	public String toString() {
		StringBuilder strFinal = new StringBuilder();
		while(!this.estaVazia()) {
			strFinal.append(this.removeFifo().toString() + ", ");
		}
		return strFinal.toString();
	}

	public Celula getFim() {
		return fim;
	}

	public void setFim(Celula fim) {
		this.fim = fim;
	}
	
}