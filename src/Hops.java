import java.util.*;
import java.lang.*;
import java.io.*;

class Hops {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			int n=input.nextInt();
			
			System.out.println(hopcount(n));
			 
			 t--;
		 }
		
           }

	private static int hopcount(int n) {
		// TODO Auto-generated method stub
		int [] count= new int[n+1];
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		if(n==3) return 4;
		// a  a  a
		count[0]=0;
		count[1]=1;
		count[2]=2;
		count[3]=4;
		
		for(int i=5;i<=n;i++)
		{
			count[i]=count[i-1]+count[1]
					+count[i-2]+count[2]
							+count[i-3]+count[3];
		}
		
		//System.out.println(count[n]);
		return count[n];
	}
}