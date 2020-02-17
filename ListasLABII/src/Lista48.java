public class Lista48 {
	
	public static int numOcorrencias(CFila a, int b) {
		int achei = 0;
		while(a.quantidade()!=0) {
			if((int)a.desenfileira()==b) {
				achei++;
			}
		}
		return achei;
	}

	public static void main(String[] args) {
		CFila a = new CFila();
		a.enfileira(3);
		a.enfileira(5);
		a.enfileira(3);
		a.enfileira(-3);
		a.enfileira(4);
		
		System.out.println(numOcorrencias(a, 3));
	}

}
