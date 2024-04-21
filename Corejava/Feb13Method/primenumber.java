package methodmodifier;

public class primenumber {

	public static void main(String[] args) {
		checkprimenumber(13);
		

	}

	 static void checkprimenumber(int num) {
		 int ct=0;
			System.out.println("given number="+num);
			for (int i=1;i<=num;i++) 
			{
				if (num % i==0) {
					ct++;
					
				}
			} 
			if (ct==2) {
				System.out.println("number is prime");
			}else {
				System.out.println("number is not prime");
			}
			}
	
		
		
	}


