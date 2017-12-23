import java.util.*;
import java.lang.*;
import java.io.*;

class MergeTwoSortedArray {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int m =input.nextInt();
			int n =input.nextInt();

			int [] arr1= new int [m];
			int [] arr2= new int [n];

			for(int i=0;i<m;i++)
			{
				arr1[i]=input.nextInt();
			}

			for(int i=0;i<n;i++)
			{
				arr2[i]=input.nextInt();
			}

			int[] result= new int [m+n];
			
			int x=0;
			
			int i=0;
			int j=0;
			while(x<m+n)
			{
				while(i<m && j<n)
				{
					if(arr1[i]>arr2[j]){
						result[x++]=arr1[i++];	
					}
					else
					{
						result[x++]=arr2[j++];	
					}
					
				}
				
				
				while(i<m)
				{
					result[x++]=arr1[i++];
				}
				
				while(j<n)
				{
					result[x++]=arr2[j++];
				}
				
				
				
			}

			for(int v=0;v<n+m;v++)
			{
				System.out.print(result[v]+" ");
			}
			System.out.println();

			t--;
		}

	}
}