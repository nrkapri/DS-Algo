import java.util.*;
import java.lang.*;
import java.io.*;

class MaxRectangleInHistogram {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n=input.nextInt();

			int [] arr=new int[n];

			for(int i=0;i<n;i++)
			{
				arr[i]=input.nextInt();
			}
			
			if(n==1)
			{
				System.out.println(arr[0]);
				t--;
				continue;
			}
			
			int area=0;
			for(int i=0;i<n;i++)
			{
				int lowest=arr[i];
				int larea=0;
				for(int j=i;j<n;j++)
				{
					if(lowest>arr[j])
					{
						lowest=arr[j];
						
					}
					larea=(j-i+1)*lowest;
					
					if(larea>area)
						area=larea;	
					
				}
				
			}

			System.out.println(area);

			t--;
		}

	}
}