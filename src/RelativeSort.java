import java.util.*;
import java.lang.*;
import java.io.*;

class RelativeSort {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int m=input.nextInt();
			 int n=input.nextInt();
			 
			 int [] arr1= new int[m];
			 int [] arr2= new int[n];
			 
			 for(int i=0;i<m;i++)
			 {
				 arr1[i]=input.nextInt();
			 }
			 for(int i=0;i<n;i++)
			 {
				 arr2[i]=input.nextInt();
			 }
			 
			 int lastindex=0;
			 for(int i=0;i<n;i++)
			 {
				 for(int j=lastindex;j<m;j++)
				 {
					 if(arr1[j]==arr2[i])
					 {
						 int temp= arr1[lastindex];
						 arr1[lastindex]=arr1[j];
						 arr1[j]=temp;
						 lastindex++;
					 }
				 }
			 }
			 
			 Arrays.sort(arr1,lastindex,arr1.length);
			 
			 for(Integer a:arr1)
			 {
				 System.out.print(a +" ");
			 }
			 System.out.println();
			 
			 
			 t--;
		 }
		
           }
}