public class Lista49 {
	
	static CLista criaCLista(int opcao, int n) {
		CLista lista1 = new CLista();
		switch(opcao) {
		case 0:
			for(int i=0;i<n;i++) {
				lista1.insereFim(i);
			}
			break;
		case 1:
			for(int i=n-1;i>=0;i--) {
				lista1.insereFim(i);
			}
			break;
		case 2:
			for(int i=n-1;i>=0;i--) {
				lista1.insereFim((int)(Math.random()*((9-0)+1))+0);
			}
			break;
		}
		return lista1;
	}
	
	static CFila criaCFila(int opcao, int n) {
		CFila fila1 = new CFila();
		switch(opcao) {
		case 0:
			for(int i=0;i<n;i++) {
				fila1.enfileira(i);
			}
			break;
		case 1:
			for(int i=n-1;i>=0;i--) {
				fila1.enfileira(i);
			}
			break;
		case 2:
			for(int i=n-1;i>=0;i--) {
				fila1.enfileira((int)(Math.random()*((9-0)+1))+0);
			}
			break;
		}
		return fila1;		
	}
	static CPilha criaCPilha(int opcao, int n) {
		CPilha pilha1 = new CPilha();
		switch(opcao) {
		case 0:
			for(int i=0;i<n;i++) {
				pilha1.empilha(i);
			}
			break;
		case 1:
			for(int i=n-1;i>=0;i--) {
				pilha1.empilha(i);
			}
			break;
		case 2:
			for(int i=n-1;i>=0;i--) {
				pilha1.empilha((int)(Math.random()*((9-0)+1))+0);
			}
			break;
		}
		return pilha1;		
	}

	public static void main(String[] args) {
		CLista testeA;
		CFila testeQ;
		CPilha testeS;
		
		testeA = criaCLista(2, 400);
		testeQ = criaCFila(0, 250);
		testeS = criaCPilha(1, 20);
		
		testeA.imprime();
		testeQ.mostra();
		for (int i = 0; i < 20; i++) {
			System.out.println(testeS.desempilha());
		}

	}

}
