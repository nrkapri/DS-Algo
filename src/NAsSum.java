import java.util.*;
import java.lang.*;
import java.io.*;

class NAsSum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n = input.nextInt();

			System.out.println(count(n,n));

			t--;
		}

	}

	private static int  count(int n,int x) {
		// TODO Auto-generated method stub
		if(n==1 ||  n==0) return 1;
		
		if(n<0) return 0;

		if(x<=0) return 0;
		if(x==0) return 1;
//		int c=0;
//		for(int i=1;i<=n;i++)
//		{
//			c+= count(n-i);
//		}
		//System.out.println(c);

		return count(n-x,x)+count(n,x-1);
	}
}