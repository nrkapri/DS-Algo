import java.util.*;
import java.lang.*;
import java.io.*;

class KthSmallestElement {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 
			 
			 //int [] arr= new int[n];
			 
			 PriorityQueue<Integer> pq= new  PriorityQueue<Integer>();
			 
			 for(int i=0;i<n;i++)
			 {
				 pq.add(input.nextInt());				 
			 }
			 int k= input.nextInt();
			 int kmin=0;
			 for(int i=0;i<k;i++)
			 {
				 kmin=pq.poll();
			 }
			 System.out.println(kmin);
			 t--;
		 }
		
           }
}