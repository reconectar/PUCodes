public class Lista54 {
	public static int somasIterativo(int fator1, int fator2) {
		int soma = 0;
		for(int i=0; i<fator1; i++) {
			soma+=fator2;
		}
		return soma;
	}
	
	public static int somasRecursivo(int fator1, int fator2) {
		if(fator2 == 0) {
			return fator2;
		}else {
			return fator1 + somasRecursivo(fator1, fator2-1);
		}
	}

	public static void main(String[] args) {
		long startTime1 = System.nanoTime();
		somasIterativo(715827881, 3);
		long endTime1 = System.nanoTime();
		long startTime2 = System.nanoTime();
		somasRecursivo(715827881, 3);
		long endTime2 = System.nanoTime();
		long duration1 = endTime1 - startTime1;
		long duration2 = endTime2 - startTime2;
		System.out.println(duration1); // = 17106 nanoseconds com impressao
									   // = 15965 nanoseconds sem impressao
		System.out.println(duration2); // = 42368440 nanoseconds com impressao
									   // = 43823543 nanoseconds sem impressao
	}
}
