package javaProj.algo;

public class MergeSortClass {

	public static void MergeSort(int[] arr,int[] tarr  , int i, int l)
	{

		if(l>i)
		{
			int p=(i+l)/2;
			MergeSort(arr,tarr,i,p);
			MergeSort(arr,tarr,p+1,l);
			SortedMerge(arr,tarr,i,p,l);

			System.out.print("\n array:");
			for(int a: arr)
			{
				System.out.print(","+a);
			}
			System.out.print("\n");

		}
	}


	private static void SortedMerge(int[] arr, int[] tarr, int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tarr[i] = arr[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tarr[i] <= tarr[j]) {
				arr[k] = tarr[i];
				i++;
			} else {
				arr[k] = tarr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			arr[k] = tarr[i];
			k++;
			i++;
		}
	}

	public static void main(String[] args) {

		int[]  arr= {1,8,2,9,23,56,4,5,90,11,16};
		int l = arr.length/2;
		System.out.println("arr:"+l);
		int [] tarr=new int[arr.length];
		MergeSort(arr,tarr,0,arr.length-1);

		System.out.print("\n array:");
		for(int a: arr)
		{
			System.out.print(","+a);
		}
		System.out.print("\n");

	}

}
