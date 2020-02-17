package q2;

import java.io.IOException;

public class CalendarioGragoriano extends Data{
	
	public CalendarioGragoriano() {
		this.dia = hoje.getDayOfMonth();
		this.mes = hoje.getMonthValue();
		this.ano = hoje.getYear();
	}

	public CalendarioGragoriano(int ano, int mes, int dia) {
		super(ano, mes, dia);
	}
	
	@Override
	public void setAno(int ano) throws IOException{
		if(ano>=1900 && ano<=2399) {
			this.ano = ano;			
		}else {
			throw new IOException();
		}
		
	}
	
	@Override
	public void setMes(int mes) throws IOException{
		if((mes>0)&&(mes<12)) {
			this.mes = mes;	
		}else {
			throw new IOException();
		}
	}
	
	@Override
	public void setDia(int dia) throws IOException{
		if(dia>0&&dia<=31) {
			this.dia = dia;			
		}else {
			throw new IOException();
		}
	}

	public void proximoDia() throws IOException{
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
			//System.out.println(" Mes inválido! ");
			throw new IOException();
		}
	}

	public void adicionaDias(int dias) throws IOException {
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
			return "TerÃ§a-feira";
		case 2:
			return "Quarta-0feira";
		case 3:
			return "Quinta-feira";
		case 4:
			return "Sexta-feira";
		case 5:
			return "SÃ¡bado";
		case 6:
			return "Domingo";
		}
		return "SÃ³ sao aceitas datas positivas entre 1900 e 2399";
	}

	public boolean eAnoBissexto() {
		return ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) );
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CalendarioGragoriano) {
			CalendarioGragoriano aux = (CalendarioGragoriano) obj;
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

	@Override
	public boolean menorQue(Ordenavel o) {
		if(o instanceof CalendarioGragoriano) {
			if(this.getAno()>((CalendarioGragoriano) o).getAno()) {
				return true;
			}else if(this.getMes()>((CalendarioGragoriano) o).getMes()){
				return true;
			}else if(this.getDia()>((CalendarioGragoriano) o).getDia()){
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}