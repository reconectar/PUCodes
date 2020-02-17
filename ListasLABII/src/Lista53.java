public class Lista53 {

	public static int fibIterativo(int n) {
		int a = 1, b = 1, c = 1;
		for (int i = 2; i < n; i++) {
			c = a + b;
			//System.out.println(c);
			a = b;
			b = c;
		}
		return c;
	}

	public static int fibRecursivo(int n) {
		//System.out.println(n);
		if(n <= 2) {
			return 1;
		}
		return fibRecursivo(n - 1) + fibRecursivo(n - 2);
	}

	public static void main(String[] args) {
		long startTime1 = System.nanoTime();
		fibIterativo(46); //Maior valor = 46
		long endTime1 = System.nanoTime();
		long startTime2 = System.nanoTime();
		fibRecursivo(46); //Maior valor = 46
		long endTime2 = System.nanoTime();
		long duration1 = endTime1 - startTime1;
		long duration2 = endTime2 - startTime2;
		System.out.println(duration1); // = 359214 nanoseconds = 0.00036 seconds com impressao
									   // = 5702 nanoseconds = 0.000006 seconds sem impressao
		System.out.println(duration2); // = 10169279235 = nanoseconds = 10.1 seconds com impressao
									   // = 10032825872 = nanoseconds = 10.0 seconds sem impressao

	}

}
