public class Lista52 {

	public static int fatIterativo(int n) {
		int aux = n;
		if (n >= 1) {
			while (n != 1) {
				aux *= n - 1;
				n--;
			}
		}
		return aux;
	}

	public static int fatRecursivo(int n) {
		int aux = n;
		if (n >= 1) {
			if (n != 1) {
				aux *= fatRecursivo(n - 1);
			} else {
				return 1;
			}
		}
		return aux;
	}

	public static void main(String[] args) throws InterruptedException {		
		long startTime1 = System.nanoTime();
		fatIterativo(31); //Maior valor = 31
		long endTime1 = System.nanoTime();
		long startTime2 = System.nanoTime();
		fatRecursivo(31); //Maior valor = 31
		long endTime2 = System.nanoTime();
		long duration1 = endTime1 - startTime1;
		long duration2 = endTime2 - startTime2;
		System.out.println(duration1); // = 5702 nanoseconds
		System.out.println(duration2); // = 5131 nanoseconds
	}
}
