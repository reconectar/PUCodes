package q2;

import java.io.IOException;
import java.time.LocalDate;

public abstract class Data implements Ordenavel{

	public void setAno(int ano) throws IOException {
		this.ano = ano;
	}

	public void setMes(int mes) throws IOException{
		this.mes = mes;
	}

	public void setDia(int dia) throws IOException{
		this.dia = dia;
	}

	protected int ano;
	protected int mes;
	protected int dia;
	public static LocalDate hoje;
	
	public Data() {
		this.hoje = LocalDate.now();
		this.dia = hoje.getDayOfMonth();
		this.mes = hoje.getMonthValue();
		this.ano = hoje.getYear();
	}

	public Data(int ano, int mes, int dia) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}
}