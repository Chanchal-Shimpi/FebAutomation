package methodmodifier;

public class reverseNumber_ {

	public static void reverseNumber(int num) {
		int rev=0,rem;
		System.out.println("given number is="+num);
		for (;num!=0;)
			
		{int remainder=num%10;
		rev=rev*10+remainder;
		num=num/10;
		}
		System.out.println("reverse of given number ="+rev);
	}
	
 
            public static void main(String[] args) {
            	reverseNumber(987654321000);
            	
            }
            }
            


	


