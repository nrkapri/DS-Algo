import java.util.*;
import java.lang.*;
import java.io.*;

class PrintAllPermutations {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 input.nextLine();
		 while (t>0)
		 {
			 String s= input.nextLine();
			 
			 char[] carr=s.toCharArray();
			 
			 printPermute(s,0,s.length()-1);
			 
			 
			 
			 
			 t--;
		 }
		
           }

	private static void printPermute(String str, int l, int r) {
		// TODO Auto-generated method stub
		   if (l == r)
	            System.out.println(str);
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                printPermute(str, l+1, r);
	                str = swap(str,l,i);
	            }
	        }
	}
	 public static String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
}