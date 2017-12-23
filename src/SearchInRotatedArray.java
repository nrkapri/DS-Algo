import java.util.*;
import java.lang.*;
import java.io.*;

class SearchInRotatedArray {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n=input.nextInt();
			long [] arr= new long [n];

			for(int i=0;i<n;i++)
			{
				arr[i]=input.nextLong();
			}

			long k=input.nextLong();

			boolean found=false;
			for(int i=0;i<n;i++)
			{
				if(arr[i]==k)
				{
					System.out.println(i);
					found=true;
					break;
				}
			}
			if(!found)
				System.out.println("-1");

			t--;
		}

	}
}