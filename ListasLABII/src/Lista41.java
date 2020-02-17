public class Lista41 {

	public static void main(String[] args) {
		CLista lista1 = new CLista();
		int soma = 0;
		for(int i = 0; i<10; i++) {
			lista1.insereComeco(i+1);
			soma+= (i+1);
		}
		
		System.out.println(soma);
		
	}

}
