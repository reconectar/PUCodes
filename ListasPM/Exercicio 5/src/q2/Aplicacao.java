package q2;

import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) {
		try {
			CalendarioGragoriano[] datas = new CalendarioGragoriano[10];
			for(int i=0; i<10; i++) {
				CalendarioGragoriano aux = new CalendarioGragoriano();
				aux.setDia((int) (Math.random() * (28 - 1) + 1));
				aux.setMes((int) (Math.random() * (12 - 1) + 1)); 
				aux.setAno((int) (Math.random() * (2399 - 1900) + 1900)); 
				datas[i] = aux;	
			}
			datas = (CalendarioGragoriano[]) Ordenador.crescente(datas);
			for(int i = 0; i<datas.length;i++) {
	            System.out.println(datas[i]);
	        }
			datas = (CalendarioGragoriano[]) Ordenador.decrescente(datas);
			for(int i = 0; i<datas.length;i++) {
	            System.out.println(datas[i]);
	        }			
		}catch(IOException a){
			System.out.println(" Mes inválido! ");		
		}
	}
}
