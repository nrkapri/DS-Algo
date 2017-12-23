import java.util.*;
import java.lang.*;
import java.io.*;

class ThreeGreatCandidates {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n=input.nextInt();
			 
			 int [] arr=new int [n];
			 for(int i=0;i<n;i++)
			 {
				 arr[i]=input.nextInt();
			 }
			 
			 long maxprod=Integer.MIN_VALUE;
			 for(int i=0;i<n-2;i++)
			 {
				 for(int j=i+1;j<n-1;j++)
				 {
					 for(int k=j+1;k<n;k++)
					 {
						 long lp=arr[i]*arr[j]*arr[k];
						 if(lp>maxprod)
						 {
							 maxprod=lp;
						 }
					 }
				 }
			 }
			 System.out.println(maxprod);
			 t--;
		 }
		
           }
}