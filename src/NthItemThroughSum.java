import java.util.*;
import java.lang.*;
import java.io.*;

class NthItemThroughSum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

			int N= input.nextInt();
			int m= input.nextInt();
			int n= input.nextInt();
			int[] a1 =new int[m];
			int [] a2= new int[n];

			for(int i=0;i<m;i++)
			{
				a1[i]= input.nextInt();
			}

			for(int i=0;i<n;i++)
			{
				a2[i]= input.nextInt();
			}
			
			int count=1;
			for (int i=0, j=0;i<m-1 && j<n-1;count++)
			{
				if ()
				if(a1[i+1]<a2[j+1])i++;
				else if (a1[i+1]>a2[j+1])j++;
				else i++;
			}


			t--;
		}

	}
}