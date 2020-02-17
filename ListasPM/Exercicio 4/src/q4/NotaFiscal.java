package q4;

import java.util.List;

public class NotaFiscal {
	private String nome;
	private List<Compravel> itens;
	
	public NotaFiscal(String nome, List<Compravel> itens){
		this.nome = nome;
		this.itens = itens;
	}
	
	public float totalPrecoItens() {
		float total=0;
		for(int i=0; i<itens.size(); i++) {
			total+= itens.get(i).getPreco();
		}
		return total;
	}
	
	public void exibir() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		String r ="ID\tNOME\t\tPRECO\n\n";
		for(int i=0; i<itens.size(); i++) {
			Compravel c = itens.get(i);
			r+=(i + "\t" + c.getNome() + "\t" + c.getPreco() + "\n");			
		}
		r+= "\nPreco Total: \t\t" + totalPrecoItens() + "\nCliente: " + this.nome;
		return r;
	}

}
