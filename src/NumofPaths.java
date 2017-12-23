import java.util.*;
import java.lang.*;
import java.io.*;

class NumofPaths {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int m=input.nextInt();
			 int n=input.nextInt();
			 
			 System.out.println(numofPaths(m-1,n-1));
			 
			 
			 t--;
		 }
		
           }

	private static long numofPaths(int i, int j) {
		// TODO Auto-generated method stub
		if(i<0||j<0) return 0;
		
		if(i==0) return 1;
		if(j==0) return 1;
		
		return numofPaths(i,j-1)+numofPaths(i-1,j);
		
		
	}
}