import java.math.BigInteger;
import java.util.Scanner;

class FactorialOfLargeNumber {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 long n=input.nextLong();
			 
			 BigInteger result= new BigInteger("1");
			 
			 for (int i = 2; i <= n; i++)
		            result = result.multiply(BigInteger.valueOf(i));
			 
			 System.out.println(result.toString());
			 
			 
			 t--;
		 }
		
           }
}