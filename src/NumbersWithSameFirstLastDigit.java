import java.util.*;
import java.lang.*;
import java.io.*;

class NumbersWithSameFirstLastDigit {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int l=input.nextInt();
			 int r=input.nextInt();
			 
			 int count=0;
			 
			 for(int i=l;i<=r;i++)
			 {
				 if(i<10){
					 count++;
					 continue;
				 }
				 
				 int first=i%10;
				 int x=i;
				 while(x>9)
				 {
					 x=x/10;
				 }
				 int last=x;
				 
				 if(first==last)count++;
				 
				 
			 }
			 
			 System.out.println(count);
			 
			 t--;
		 }
		
           }
}