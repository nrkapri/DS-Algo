import java.util.*;
import java.lang.*;
import java.io.*;

class IfPathExists {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n=input.nextInt();

			int [][] arr= new int [n][n];

			int sourcex=0;
			int sourcey=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=input.nextInt();
					if(arr[i][j]==1)
					{
						sourcex=i;sourcey=j;
					}
				}
			}

			boolean[][] trace =new boolean[n][n];
			if(isReachable(arr,trace,n,sourcex,sourcey))
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
				
			

			t--;
		}

	}

	private static boolean isReachable(int[][] arr,boolean[][] trace, int n, int sourcex, int sourcey) {
		// TODO Auto-generated method stub
		
		if(!isSafe(sourcex,sourcey,n,arr,trace)) return false;
		if(arr[sourcex][sourcey]==2)return true;
		
		trace[sourcex][sourcey]=true;
		
		//up
		if (isReachable(arr,trace,n,sourcex,sourcey-1)) return true;
		//down
		if (isReachable(arr,trace,n,sourcex,sourcey+1)) return true;
		//left
		if (isReachable(arr,trace,n,sourcex-1,sourcey)) return true;
		//right
		if (isReachable(arr,trace,n,sourcex+1,sourcey)) return true;
		
		return false;
	}

	private static boolean isSafe(int sourcex, int sourcey,int n,int[][] arr, boolean[][] trace)  {
		// TODO Auto-generated method stub
		if(sourcex<0 || sourcex>=n) return false;
		if(sourcey<0 || sourcey>=n) return false;
		if(arr[sourcex][sourcey]==0) return false;
		if(trace[sourcex][sourcey]==true) return false;
		return true;
	}
}