import java.util.HashMap;
import java.util.Scanner;

class RemoveDuplicatesFromString {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 input.nextLine();
		 while (t>0)
		 {
			 String s =input.nextLine();
			 
			 int n=s.length();
			 //char[] carr=new char[n];
			 
			 HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			 for(int i=0;i<n;i++)
			 {
				 if(!map.containsKey(s.charAt(i)))
				 {
					  System.out.print(s.charAt(i));
				 }
				 
					 map.put(s.charAt(i), 0);
			 }
			 System.out.println();
			 
			 
			 t--;
		 }
		
           }
}