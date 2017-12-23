import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class OddEvenSort {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 
			 ArrayList<Integer> oddlist = new ArrayList<Integer>();
			 
			 ArrayList<Integer> evenlist = new ArrayList<Integer>();
			 
			 
			 for(int i=0;i<n;i++)
			 {
			     int x=input.nextInt();
			     if(x%2==0)
			     {
			         evenlist.add(x);
			     }
			     else
			     {
			    	   oddlist.add(x);   
			     }
			 }
			 
			 Collections.sort(evenlist);
			 Collections.sort(oddlist, new Comparator<Integer>(){
				 public int compare(Integer a, Integer b) {
				        return b-a;
				    }
			 });
			 
			 
			 for(Integer a:oddlist)
			 {
				 System.out.print(a+ " ");
			 }
			 for(Integer a:evenlist)
			 {
				 System.out.print(a+" ");
			 }
			 System.out.println();
			 
			 t--;
		 }
		
           }
}