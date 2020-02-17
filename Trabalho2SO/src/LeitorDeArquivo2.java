import java.io.*;
import java.util.ArrayList;

public class LeitorDeArquivo2 {

	public static int[] lerArquivo() throws IOException {
		InputStream is = new FileInputStream("Pedidos.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s;

		int pedidos[] = new int[20000];
		for(int i=0; i<20000; i++){
			s = br.readLine();
			pedidos[i] = Integer.parseInt(s);
		}
		br.close();
		return pedidos;
	}
}


