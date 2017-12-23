import java.util.*;
import java.lang.*;
import java.io.*;

class MaxProduct {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n= input.nextInt();

			int [] arr= new int [n];
			for(int i=0;i<n;i++)
			{
				arr[i]= input.nextInt();
			}

			long gmax=arr[0];
			long lmax=arr[0];
			int lastindex=0;
			
			
			for(int i=0;i<n;i++)
			{
				if(arr[i]!=0)
				{
					gmax=arr[i];
					lmax=arr[i];
					lastindex=i;
					break;
				}
			}
			for(int i=lastindex+1;i<n;i++)
			{
				if(arr[i]!=0)
				{
					lmax*=arr[i];
				}

				if(lmax>gmax)
				{
					gmax=lmax;
				}
				if(arr[i]==0)
				{
					for(int j=lastindex;j<i;j++)
					{

						lmax/=arr[j];
						if(lmax>gmax)
						{
							gmax=lmax;
						}
					}
					while(i<n && arr[i]==0)
					{
						i++;
					}
					lastindex=i;
					if(i<n)
					{
						lmax=arr[i];
					}
					else
						lmax=0;
				}
				
				if(i==n-1&& arr[i]!=0)
				{
					for(int j=lastindex;j<=i;j++)
					{
						lmax/=arr[j];
						if(lmax>gmax)
						{
							gmax=lmax;
						}
					}
				}
				if(lmax>gmax)
				{
					gmax=lmax;
				}
			
			}
			System.out.println(gmax);
			t--;
		}

	}
}