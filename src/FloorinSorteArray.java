import java.util.*;
import java.lang.*;
import java.io.*;

class FloorinSorteArray {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 int x= input.nextInt();
			 
			 int[] arr= new int [n];
			 
			 for(int i=0;i<n;i++)
			 {
				 arr[i]= input.nextInt();
			 }
			 
			 if(arr[0]>x)
			 {
				 System.out.println(-1);
				 t--;
				 continue;
			 }

			 //Arrays.binarySearch(arr, x);
				 
			 System.out.println(floorsearch(arr,x,n,0,n-1));
			 
			 t--;
		 }
		
           }

	private static int floorsearch(int[] arr, int x,int n, int i, int j) {
		// TODO Auto-generated method stub
		if (i>j ) return 0;
		int mid = (i+j)/2;
		if (arr[mid]==x)
		{
			//System.out.println("1");
			return mid;
		}
		else if( !(mid==0) &&
				arr[mid -1]<x && arr[mid]>x)
		{
			//System.out.println("2");
			return mid-1;
		}
		else if (!(mid+1==n)&& arr[mid]<x && arr[mid +1]>x)
		{
			//System.out.println("3");
			return mid;
		}
		else if(!(mid+1==n)&& arr[mid]<x && arr[mid +1]<x)
		{
			//System.out.println("4");
			return floorsearch(arr,x,n,mid+1,j);
		}
		else {
	//		System.out.println("5");
			return floorsearch(arr,x,n,i,mid);
		}
	}
}