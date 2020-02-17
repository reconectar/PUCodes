
public class App{	

	public static void main(String[] args) {		
		try {
			new Server();		
		}catch(Exception e) {
			System.out.println("Erro...");
			e.printStackTrace();
		}finally{
			System.out.println("Saindo...");
		}

	}

}
