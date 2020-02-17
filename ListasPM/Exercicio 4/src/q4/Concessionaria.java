package q4;

public class Concessionaria {

	public static void main(String[] args) {
		Cliente c = new Cliente("Joao");
		c.adicionar(new PecaUsada("Volante", 300));
		c.adicionar(new Automovel("Fiat Uno", 35000, 1990, "Verde"));
		c.adicionar(new Servico("Concerto", 2000));
		
		NotaFiscal nf = c.emitirNotaFiscal();
		nf.exibir();

	}

}
