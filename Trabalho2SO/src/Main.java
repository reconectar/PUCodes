import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        int i;
        Produto produto1 = new Produto("1",2.80F);
        Produto produto2 = new Produto("1",1.60F);
        ArrayList<> prateleiras= new ArrayList<Prateleira>();
        ArrayList<Produto> produtos = LeitorDeArquivo.lerArquivo();
        for(i=0; i<10; i++){
            Prateleira prateleira = new Prateleira();
            prateleiras.add(prateleira);
        }



        for(Prateleira prateleira:prateleiras){
            for (Produto produto:produtos) {
                prateleira.addProduto(produto);
            }
        }

        //System.out.println(prateleira1.toString());


        //System.out.println(produtos.toString());
//        int pedidos[] = LeitorDeArquivo2.lerArquivo();
//        for (int i=0; i<20000; i++){
//            System.out.println(pedidos[i]);
//        }
    }
}
