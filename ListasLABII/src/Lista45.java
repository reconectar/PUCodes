public class Lista45 {

	public static void main(String[] args) {
		
		CLista lista1 = new CLista();
		
		Aluno aluno1 = new Aluno("arthur1", 11121);
		Aluno aluno2 = new Aluno("arthur2", 11121);
		Aluno aluno3 = new Aluno("arthur3", 11121);
		Aluno aluno4 = new Aluno("arthur4", 11121);
		Aluno aluno5 = new Aluno("arthur5", 11121);	
		
		lista1.insereFim(aluno1);
		lista1.insereFim(aluno2);
		lista1.insereFim(aluno3);
		lista1.insereFim(aluno4);
		lista1.insereFim(aluno5);
		
		lista1.imprime(); 
	}

}
