import java.util.*;
import java.lang.*;
import java.io.*;

class MinOperation {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n=input.nextInt();
			 
			 int[] table= new int[n+1];
			 table[0]=0;
			 for (int i=1;i<n+1;i++)
			 {
				 int x=0;
				 int y=0;
				 
				 x=table[i-1]+1;
				 y=(i%2==0)?table[i/2]+1:table[(i-1)/2]+2;
						 
				 //System.out.println("\n(i:x,y):"+i+","+x+","+y);
				 table[i]=Math.min(x, y);
				 //GFGUtils.printarr(table);
			 }
			 System.out.println(table[n]);
			 t--;
		 }
		
           }
}