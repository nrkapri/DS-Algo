import java.util.*;
import java.lang.*;
import java.io.*;

class KeyPair {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n=input.nextInt();
			 int x=input.nextInt();
			 
			 HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
			 
			 ArrayList<Integer> arr= new ArrayList<Integer>();
			 for(int i=0;i<n;i++)
			 {
				 int a=input.nextInt();
				 arr.add(a);
				 map.put(a,0);
			 }
			 
			 for(Integer a:arr){
				 if(arr.contains(a-x))
				 {
					 System.out.println("Yes");
					 t--;
					 continue;
				 }
			 }
			
			 System.out.print("No");
			 t--;
		 }
		
           }
}