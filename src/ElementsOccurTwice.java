import java.util.*;
import java.lang.*;
import java.io.*;

class ElementsOccurTwice {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 
			 long  ans=0;
			 for(int i=0;i<n;i++)
			 {
				 ans^=input.nextInt();
			 }
			 
			 System.out.println(ans);
			 
			 
			 t--;
		 }
		
           }
}