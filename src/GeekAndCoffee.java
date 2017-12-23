import java.util.*;
import java.lang.*;
import java.io.*;

class GeekAndCoffee {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 long n=input.nextLong();
			 int m=input.nextInt();
			 
			 while(m>1)
			 {
				 n=n/2;
				 m--;
			 }
			 System.out.println(n);
			 t--;
		 }
		
           }
}