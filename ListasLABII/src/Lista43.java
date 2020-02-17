public class Lista43 {

	public static void main(String[] args) {
		CLista lista1 = new CLista();
		lista1.insereComeco(1);
		lista1.insereComeco(5.1);
		lista1.insereComeco('c');
		lista1.insereComeco("Shulambs");
		lista1.insereComeco("ola" + " irmao");
		lista1.insereComeco(-1);
		lista1.insereComeco(-5.1);
		lista1.insereComeco((double) 5);
		lista1.insereComeco(((double) 5) + ((int) 3));
		lista1.insereComeco(((double) 5) + ((float) 3));

		lista1.imprime();
	}

}
