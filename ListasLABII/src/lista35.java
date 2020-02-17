import java.util.Random;

public class lista35 {
	public static void main(String[] args) {
		CPilha pilha1 = new CPilha();
		Random random = new Random();
		int aux, soma = 0, cont = 0;

		for (int i = 0; i < 10; i++) {
			pilha1.empilha(random.nextInt());
			// pilha1.empilha(10);
			cont++;
		}

		for (int i = 0; i < 10; i++) {
			aux = (int) pilha1.peek();
			soma += aux;
			System.out.println(pilha1.desempilha());
		}
		System.out.println("Soma = " + soma);
		soma /= cont;
		System.out.println("Media = " + soma);
	}
}