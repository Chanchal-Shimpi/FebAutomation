package methodmodifier;

public class evenNumber {

	public static void main(String[] args) {
		printEvenFromRange(1, 50);

	}

	static void printEvenFromRange(int num1, int num2) {
		for (; num1 <= num2; num1++) {
			if (num1 % 2 == 0) {
				System.out.println(num1);
			}

		}
	}
}
