public class lista32 {
	public static void main(String[] args) {
		CPilha pilha1 = new CPilha();
		CPilha pilha2 = new CPilha();

		for (int i = 0; i < 10; i++) {
			pilha1.empilha(i + 1);
		}

		for (int i = 0; i < 10; i++) {
			pilha2.empilha(pilha1.desempilha());
		}
      
      for (int i = 0; i < 10; i++) {
          pilha1.empilha(pilha2.peek());
			 System.out.println(pilha2.desempilha());
		}

	}
}
