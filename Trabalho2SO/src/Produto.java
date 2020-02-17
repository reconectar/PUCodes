public class Produto {
    private String id;
    private float peso;

    public Produto(String id, float peso) {
        this.id = id;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + " Peso: " + this.peso + System.lineSeparator();
    }
}
