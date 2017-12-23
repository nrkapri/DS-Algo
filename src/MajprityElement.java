import java.util.*;
import java.lang.*;
import java.io.*;

class MajprityElement {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n=input.nextInt();
			 
			 int []arr= new int[n];
			 
			 HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
			 for(int i=0;i<n;i++)
			 {
			     arr[i]=input.nextInt();
			 }
			 boolean found=false;
			 for(int i=0;i<n;i++)
			 {
				 int a=arr[i];
				 
				 if(map.containsKey(a))
				 {
					 int count=map.get(a);
					 if(count+1>n/2)
					 {
						 System.out.println(a);
						 found=true;
						 break;
					 }
					 map.remove(a);
					 map.put(a, count+1);
					 
				 }
				 else
				 {
					 map.put(a, 1);
				 }
			 }
			 if(!found)
				 System.out.println("NO Majority Element");
			 
			 t--;
		 }
		
           }
}