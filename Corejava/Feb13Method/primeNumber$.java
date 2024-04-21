package methodmodifier;

public class primeNumber$ {

	public void  CheckPrimeNumber(int num) {
		int ct = 0;
	

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				ct++;

			}
		}
		if (ct == 2) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}
	}

	public static void main(String[] args) {
		primeNumber$ e1 = new primeNumber$();
		e1.CheckPrimeNumber(13);

	}
}
