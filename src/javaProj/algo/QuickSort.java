package javaProj.algo;

public class QuickSort {

	public static void main(String[] args) {

		int [] arr={34,23,1,56,3,77,98,56,45,22,44,87,21};

		qsort(arr,0,arr.length-1);

		System.out.println("\narray:");
		for(int a:arr)
		{
			System.out.print(","+a);
		}
		System.out.println("\n");
	}

	private static void qsort(int[] arr, int low, int high) {

		
		int pivot=arr[(low+high)/2];

		int i=low;
		int j=high;
		while(i<=j)
		{
			while(arr[i]<pivot)                                                                                                                                           
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}	
			
			if(i<=j)
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				i++;
				j--;
			}
			
			if(low<j)
				qsort(arr,low,j);
			
			
			if(i<high)
				qsort(arr,i,high);
		}

	}

}
