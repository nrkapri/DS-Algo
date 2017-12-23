import java.util.LinkedHashMap;
import java.util.Scanner;

class RemoveDuplicates {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 input.nextLine();
		 while (t>0)
		 {
			 String s= input.nextLine();
			 
			 LinkedHashMap<Character,Integer> lmap= new LinkedHashMap<Character,Integer>();
			 for(int i=0;i<s.length();i++)
			 {
				 if(!lmap.containsKey(s.charAt(i)))
				 {
					 lmap.put(s.charAt(i), 0);
				 }
			 }
			 
			 for(Character c:lmap.keySet()){
				 System.out.print(c);	 
			 }
			 System.out.println();
			 
			 
			 t--;
		 }
		
           }
}