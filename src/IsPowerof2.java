import java.util.*;
import java.lang.*;
import java.io.*;

class IsPowerof2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 long t = input.nextLong();
		 
		 while (t>0)
		 {
			long a= input.nextLong();
			
			
			while(a>1)
			{
				if(a==1) break;
				
				if(a%2==1)break;
				a=a/2;
			}
			 
			if(a==1)
				System.out.println("YES");
			else
				System.out.println("NO");
				
				
				
			 t--;
		 }
		
           }
}