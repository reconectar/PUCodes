import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class LeitorDeArquivo {

	public static ArrayList<Produto> lerArquivo() throws IOException {
		InputStream is = new FileInputStream("Produtos.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine();

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		while (s != null) {
			String[] splitStr = s.split(";");
			if (splitStr.length == 3) {
				Produto produto = new Produto (splitStr[0], Float.parseFloat(splitStr[2].replace(",",".")));
				produtos.add(produto);
			}
			s = br.readLine();
		}
		br.close();
		return produtos;
	}
}


