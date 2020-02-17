public class lista33 {
	public static void main(String[] args) {
		CPilha pilha1 = new CPilha();
		CFila fila2 = new CFila();

		for (int i = 0; i < 10; i++) {
			pilha1.empilha(i + 1);
		}

		for (int i = 0; i < 10; i++) {
			fila2.enfileira(pilha1.desempilha());
		}
      
      for (int i = 0; i < 10; i++) {
         		 pilha1.empilha(fila2.peek());
			 System.out.println(fila2.desenfileira());
		}

	}
}
