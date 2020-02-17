public class lista37 {

	public static void limpaPilha(CPilha p) {
		while (p.quantidade() != 0) {
			System.out.println(p.peek());
			p.desempilha();
		}
	}

	public static void main(String[] args) {
		CPilha pilha1 = new CPilha();

		for (int i = 0; i < 10; i++) {
			pilha1.empilha(i + 1);
		}
		// limpaPilha(pilha1);
		pilha1.limpa();
	}
}