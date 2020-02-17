
public class Lista46 {
	
	static int somaTodas(CPilha x, CFila y, CLista z){
		int soma = 0;
		while(x.quantidade()!=0) {
			soma+=(int)x.desempilha();
		}
		while(y.quantidade()!=0) {
			soma+=(int)y.desenfileira();
		}
		while(z.quantidade()!=0) {
			soma+=(int)z.removeRetornaFim();
		}				
		return soma;
	}

	public static void main(String[] args) {
		
		CPilha a = new CPilha();
		CFila b = new CFila();
		CLista c = new CLista();
		
		a.empilha(2);
		b.enfileira(2);
		c.insereComeco(2);
		
		System.out.println(somaTodas(a, b, c));
		
	}

}
