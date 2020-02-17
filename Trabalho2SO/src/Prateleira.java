import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private float peso;
    private static List<Produto> produtos = new ArrayList<Produto>();

    public Prateleira() {
        this.peso = 0;
        this.produtos = produtos;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public boolean addProduto(Produto produto){
        if(produto.getPeso() + this.peso <=10){
            this.produtos.add(produto);
            this.peso += produto.getPeso();
            return true;
        }else{
            System.out.println("deu ruim");
            return false;
        }
    }

    @Override
    public String toString(){
        StringBuilder finalStr = new StringBuilder();
        for (int i=0;i<produtos.size(); i++){
            finalStr.append(produtos.get(i).toString());
            finalStr.append(System.lineSeparator());
        }

        finalStr.append(System.lineSeparator());
        finalStr.append("Peso da prateleira: " + this.peso);

        return finalStr.toString();
    }
}
