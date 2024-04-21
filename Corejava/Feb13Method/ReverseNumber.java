package methodmodifier;

public class ReverseNumber {

	public static void main(String[] args) {
		reversenumber(1234500000);

	}

	 static void reversenumber(int num) {
		int rev=0,rem;
		System.out.println("given number is="+num);
		for (;num!=0;)

		{int remainder=num%10;
		rev=rev*10+remainder;
		num=num/10;
	}
		System.out.println("reverse of given number ="+rev);
	}

}
