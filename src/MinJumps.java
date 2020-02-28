import java.util.*;
import java.lang.*;
import java.io.*;
/**
Given an array of integers where each element represents the max number of 
steps that can be made forward from that element. The task is to find the 
minimum number of jumps to reach the end of the array (starting from the 
first element). If an element is 0, then cannot move through that element.

Input:
2
11
1 3 5 8 9 2 6 7 6 8 9
6
1 4 3 2 6 7
Output:
3
2

 */

class MinJumps {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{

			int n =  input.nextInt();

			int[]  arr = new int[n];

			for( int i=0;  i<n; i++ ){
				arr[i] =  input.nextInt();
			}
			
			if (n<2) {
				if (n<=1) {
					System.out.println("0");
				}
				t--;
				continue;
			}
				

			// mj(i) = min { mj(j) where j < arr[i]}
			int[] tab  =  new int[n];
			Arrays.fill(tab, Integer.MAX_VALUE);
			tab[n-1]=0;
			for( int i=n-2; i>=0; i-- ){

				if(arr[i]==0) {
					tab[i]=Integer.MAX_VALUE;
				}
				else  if (arr[i]>= n-i-1) {
					tab[i]=1;
				}
				else {
					int min=Integer.MAX_VALUE;
					for( int j=i+1; j<n &&  j <= arr[i]+i  ; j++ ) {
						if(tab[j] <min) min=tab[j];
					}
					if (min != Integer.MAX_VALUE) 
						tab[i] = min + 1; 
					else
						tab[i] = min; 
				}
			}

//			System.out.println(Arrays.toString(tab));
			System.out.println(tab[0]);

			t--;
		}

	}
}