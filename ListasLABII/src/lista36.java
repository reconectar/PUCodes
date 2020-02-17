public class lista36 {
	public static void main(String[] args) {
		CFila fila1 = new CFila();

		for (int i = 0; i < 10; i++) {
			fila1.enfileira("Arthur" + (i + 1));
		}

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "o - " + fila1.desenfileira());
		}
	}
}