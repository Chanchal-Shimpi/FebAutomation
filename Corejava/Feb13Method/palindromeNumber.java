package methodmodifier;

public class palindromeNumber {

	public  static void main(String[] args) {
		CheckPalindromeNumber(121);
	}
		

	static void CheckPalindromeNumber(int num) {
		int rev=0,rem,temp;
		temp=num;
	for (;num!=0;) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
		System.out.println("reverse number="+rev);
		if (rev==temp) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given number is not palindrme");
	
		}
	}
		
}


