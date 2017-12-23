import java.util.*;
import java.lang.*;
import java.io.*;

class MissingNumber {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 
			 long sum=0;
			 for(int i=0;i<n-1;i++)
			 {
				 sum+=input.nextInt();
			 }
			 
			 System.out.println((n*(n+1))/2 - sum);
			 t--;
		 }
		
           }
}