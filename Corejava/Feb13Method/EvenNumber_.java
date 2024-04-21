package methodmodifier;

public class EvenNumber_ {

	 static void PrintEvenFromRange(int num1,int num2) {
		for (; num1 <= num2; num1++) {
			if (num1 % 2 == 0) {
				System.out.println(num1);
			}
		
	}
		public static void main(String[] args) {
			PrintEvenFromRange(1,50);


	}
	}
}


