package q3;

public class Endereco {
	
	protected String endereco;
	protected String telefone;
	protected int cep;
	protected String cidade;
	protected String uf;
	
	public Endereco(String endereco, String telefone, int cep, String cidade, String uf){
		setEndereco(endereco);
		setTelefone(telefone);
		setCep(cep);
		setCidade(cidade);
		setUf(uf);
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
