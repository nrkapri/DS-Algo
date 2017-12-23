import java.util.*;
import java.lang.*;
import java.io.*;

class SumClosestToZero {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n=input.nextInt();

			int [] arr= new int [n];

			for(int i=0;i<n;i++)
			{
				arr[i]= input.nextInt();
			}

			Arrays.sort(arr);

			int i=0;
			int j=n-1;

			int gsum=Integer.MAX_VALUE;
			int first=arr[0];
			int last=arr[n-1];
			while(i<j)
			{
				int lsum=0;
				
				if(Math.abs(arr[i]+arr[j])<Math.abs(gsum))
				{
					gsum=arr[i]+arr[j];
					first=arr[i];
					last=arr[j];
				}
				if(Math.abs(arr[i])<Math.abs(arr[j]))
				{
					j--;
				}
				else
				{
					i++;
				}
				
			}
			
			System.out.println(first+" "+last);

			t--;
		}

	}
}