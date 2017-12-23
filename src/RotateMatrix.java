import java.util.*;
import java.lang.*;
import java.io.*;

class RotateMatrix {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n=input.nextInt();
			 
			 int [][] arr= new int[n][n];
			 
			 for(int i=0;i<n;i++)
			 {
				 for(int j=0;j<n;j++){
					 arr[i][j]= input.nextInt();	 
				 }
				 
			 }

			 rotateArray(arr,n);
			 t--;
		 }
		
           }

	private static void rotateArray(int[][] mat, int N) {
		// TODO Auto-generated method stub
		
		  for (int x = 0; x < N / 2; x++)
		    {
		        // Consider elements in group of 4 in 
		        // current square
		        for (int y = x; y < N-x-1; y++)
		        {
		            // store current cell in temp variable
		            int temp = mat[x][y];
		 
		            // move values from right to top
		            mat[x][y] = mat[y][N-1-x];
		 
		            // move values from bottom to right
		            mat[y][N-1-x] = mat[N-1-x][N-1-y];
		 
		            // move values from left to bottom
		            mat[N-1-x][N-1-y] = mat[N-1-y][x];
		 
		            // assign temp to left
		            mat[N-1-y][x] = temp;
		        }
		    }
		  
		  for(int i=0;i<N;i++)
		  {
			  for(int j=0;j<N;j++)
			  {
				  System.out.print(mat[i][j]+ " ");
			  }
		  }
		  System.out.println();
		  
	}
}