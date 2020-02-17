import java.util.Random;

public class lista34 {
	public static void main(String[] args) {
		CPilha pilha1 = new CPilha();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			pilha1.empilha(random.nextInt());
			System.out.println(pilha1.peek());
		}
	}
}