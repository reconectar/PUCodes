
public class Lista47 {
	
	static int qtdPositivos(CPilha x){
		int qtd = 0;
		while(x.quantidade()!=0) {
			if((int)x.peek()>0) {
				qtd++;
				x.desempilha();
			}else {
				x.desempilha();
			}
		}
		
		return qtd;
	}

	public static void main(String[] args) {
		
		CPilha a = new CPilha();
		
		a.empilha(-1);
		a.empilha(1);
		a.empilha(1);
		a.empilha(-3);
		
		System.out.println(qtdPositivos(a));
		
	}

}
