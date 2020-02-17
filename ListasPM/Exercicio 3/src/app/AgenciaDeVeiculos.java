package app;

public class AgenciaDeVeiculos {

	public static void main(String[] args) {
		Carro carro1 = new Carro(180, 21000, "Amarelo");
		Caminhao caminhao1 = new Caminhao(160, 100000, "Vermelho", 1999);
		Caminhao caminhao2 = new Caminhao(160, 100000, "Azul", 2001);
		Fiat fiat1 = new Fiat(210, 3500000, "Vermelho", 500000);
		Sedan sedan1 = new Sedan(180, 100000, "Prata", 5);
		Sedan sedan2 = new Sedan(180, 100000, "Preto", 7);
		
		System.out.println("Carro 1:\n"
				+ "Velocidade: " + carro1.getVelocidade() + " Preço: " + carro1.getPrecoVenda() + " Cor: " + carro1.getCor() + "\n\n" +
				"Caminhao1:\n" +
				"Velocidade: " + caminhao1.getVelocidade() + " Preço: " + caminhao1.getPrecoVenda() + " Cor: " + caminhao1.getCor() + " Carga: " +caminhao1.getCarga() + "\n\n" +
				"Caminhao2:\n" +
				"Velocidade: " + caminhao2.getVelocidade() + " Preço: " + caminhao2.getPrecoVenda() + " Cor: " + caminhao2.getCor() + " Carga: " +caminhao2.getCarga() + "\n\n" +
				"Fiat1:\n" + 
				"Velocidade: " + fiat1.getVelocidade() + " Preço: " + fiat1.getPrecoVenda() + " Cor: " + fiat1.getCor() + "\n\n" +
				"Sedan1:\n" + 
				"Velocidade: " + sedan1.getVelocidade() + " Preço: " + sedan1.getPrecoVenda() + " Cor: " + sedan1.getCor() + " Comprimento: " + sedan1.getComprimento() + "\n\n" +
				"Sedan2:\n" + 
				"Velocidade: " + sedan2.getVelocidade() + " Preço: " + sedan2.getPrecoVenda() + " Cor: " + sedan2.getCor() + " Comprimento: " + sedan2.getComprimento());
	}

}
