import java.util.*;
import java.lang.*;
import java.io.*;

class IsXpowY {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 long x=input.nextLong();
			 
			 
			 boolean found=false; 
			 for(int i=2;i<=10;i++)
			 {
				 if(isXpowi(x,i))
				 {
					 System.out.println(1);
					 found=true;
					 break;
				 }
			 }
			 if(!found)
				 System.out.println(0);
			 
			 t--;
		 }
		
           }

	private static boolean isXpowi(long x, int i) {
		// TODO Auto-generated method stub
		if(x==i) return false;
		while(x>1)
		{
			if(x%i>0) return false;
			x=x/i;
			if(x==1) return true;
		}
		return true;
	}
}