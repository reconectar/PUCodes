package app;

public class Data {

	private int ano, mes, dia;

	public Data(int ano, int mes, int dia) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public Data() { // Hoje
		this.ano = 2019;
		this.mes = 2;
		this.dia = 19;
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

	public void proximoDia() {
		if ((this.mes >= 1) && (this.mes <= 12)) {
			if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
				if(mes == 12) {
					if (this.dia < 31) {
						this.dia++;
					} else {
						this.ano++;
						this.dia = 1;
						this.mes = 1;
					}	
				}else {			
					if (this.dia < 31) {
						this.dia++;
					} else {
						this.mes++;
						this.dia = 1;
					}			
				}
			} else if (mes == 2) {
				if (this.eAnoBissexto()) {
					if (this.dia < 29) {
						this.dia++;
					} else {
						this.mes++;
						this.dia = 1;
					}
				} else {
					if (this.dia < 28) {
						this.dia++;
					} else {
						this.mes++;
						this.dia = 1;
					}
				}
			} else {
				if (this.dia < 30) {
					this.dia++;
				} else {
					this.mes++;
					this.dia = 1;
				}
			}
		} else {
			System.out.println(" Mes inválido! ");
		}
	}

	public void adicionaDias(int dias) {
		int n;
		for(n=dias;n>0;n--){
			this.proximoDia();			
		}
	}

	public int diasNoMes() {
		if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
			return 31;
		}else if(this.mes == 2){
			if(this.eAnoBissexto()) {
				return 29;
			}else {
				return 28;
			}
		}else {
			return 30;
		}
	}

	public String diaDaSemana() {
		int a, b, c = 0, d, resultado;
		a = this.ano - 1900;
		b = a/4;
		if(this.eAnoBissexto()&&this.dia<=29&&this.mes<=2) {
			b--;			
		}
		switch(this.mes) {
		case 1:
			c = 0;
			break;
		case 2:
			c = 3;
			break;
		case 3:
			c = 3;
			break;
		case 4:
			c = 6;
			break;
		case 5:
			c = 1;
			break;
		case 6:
			c = 4;
			break;
		case 7:
			c = 6;
			break;
		case 8:
			c = 2;
			break;
		case 9:
			c = 5;
			break;
		case 10:
			c = 0;
			break;
		case 11:
			c = 3;
			break;
		case 12:
			c = 5;
			break;
		}
		
		d = this.dia--;		
		resultado = (a + b + c + d)%7;
		resultado--; //faz o fix de 1 dia errado
		
		switch(resultado) {
		case 0:
			return "Segunda-feira";
		case 1:
			return "Terça-feira";
		case 2:
			return "Quarta-0feira";
		case 3:
			return "Quinta-feira";
		case 4:
			return "Sexta-feira";
		case 5:
			return "Sábado";
		case 6:
			return "Domingo";
		}
		return "Só sao aceitas datas positivas entre 1900 e 2399";
	}

	public boolean eAnoBissexto() {
		return ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) );
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data) {
			Data aux = (Data) obj;
			return (this.ano == aux.ano && this.mes == aux.mes && this.dia == aux.dia); 
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		String mesExtenso = null;
		switch(this.mes) {
		case 1:
			mesExtenso = "Janeiro";
			break;
		case 2:
			mesExtenso = "Fevereiro";
			break;
		case 3:
			mesExtenso = "Março";
			break;
		case 4:
			mesExtenso = "Abril";
			break;
		case 5:
			mesExtenso = "Maio";
			break;
		case 6:
			mesExtenso = "Junho";
			break;
		case 7:
			mesExtenso = "Julho";
			break;
		case 8:
			mesExtenso = "Agosto";
			break;
		case 9:
			mesExtenso = "Setembro";
			break;
		case 10:
			mesExtenso = "Outubro";
			break;
		case 11:
			mesExtenso = "Novembro";
			break;
		case 12:
			mesExtenso = "Dezembro";
			break;
		}
		return (this.dia + " de " + mesExtenso + " de " + this.ano);
	}
}