public class Lista410 {

	static void imprimeCLista(CLista A) {
		CLista aux = new CLista();

		for (int i = 0; i < 15; i++) {
			aux.insereFim(A.removeRetornaFim());
		}

		for (int i = 0; i < 15; i++) {
			A.insereFim(aux.retornaUltimo());
			System.out.print(aux.removeRetornaFim() + " | ");
			if (((i + 1) % 10) == 0) {
				System.out.println();
			}
		}
	}

	static void imprimeCFila(CFila Q) {
		CFila aux = new CFila();

		for (int i = 0; i < 15; i++) {
			aux.enfileira(Q.desenfileira());
		}

		for (int i = 0; i < 15; i++) {
			Q.enfileira(aux.peek());
			System.out.print(aux.desenfileira() + " | ");
			if (((i + 1) % 10) == 0) {
				System.out.println();
			}
		}
	}

	static void imprimeCPilha(CPilha S) {
		CPilha aux = new CPilha();

		for (int i = 0; i < 15; i++) {
			aux.empilha(S.desempilha());
		}

		for (int i = 0; i < 15; i++) {
			S.empilha(aux.peek());
			System.out.print(aux.desempilha() + " | ");
			if (((i + 1) % 10) == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		CLista testeA = new CLista();
		CFila testeQ = new CFila();
		CPilha testeS = new CPilha();

		for (int i = 0; i < 15; i++) {
			testeA.insereFim(i + 1);
			testeQ.enfileira(i + 1);
			testeS.empilha(i + 1);
		}
		
		imprimeCLista(testeA);
		System.out.println("\n");
		imprimeCFila(testeQ);
		System.out.println("\n");
		imprimeCPilha(testeS);

	}

}
