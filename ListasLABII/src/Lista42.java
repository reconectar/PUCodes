public class Lista42 {

	public static void main(String[] args) {
		CFila fila1 = new CFila();
		int soma = 0;
		for(int i = 0; i<10; i++) {
			fila1.enfileira(i+1);
			soma+= (i+1);
		}

		System.out.println(soma);

	}

}
