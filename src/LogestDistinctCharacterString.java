import java.util.*;
import java.lang.*;
import java.io.*;

class LogestDistinctCharacterString {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 input.nextLine();
		 while (t>0)
		 {
			 String s= input.nextLine();
			 
			 char[] carr= s.toCharArray();
			 int longest=0;
			 
			 HashMap<Character,Integer> hmap= new HashMap<Character,Integer>();
			 
			 int j=0;
			 int lmax=0;
			 for(int i=0;i<s.length();i++)
			 {
				 if(hmap.containsKey(carr[i]))
				 {
					 while(carr[i]!=carr[j])
					 {
						 hmap.remove(carr[j++]);
						 lmax--;
					 }
					 //hmap.remove(carr[j++]);
					 j++;
					 //lmax--;
					 //i++;
				 }
				 else
				 {
					 hmap.put(carr[i], 0);
					 lmax++;
				 }
				 
				 if(lmax>longest)
				 {
					 longest=lmax;
				 }
			 }
			 
			 System.out.println(longest);
			 t--;
		 }
		
           }

}