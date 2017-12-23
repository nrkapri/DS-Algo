import java.util.Scanner;
import java.util.Stack;

class BuilidingSunlight {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 int[] arr = new int[n];
			 
			 for(int i=0;i<n;i++)
			 {
				 arr[i]= input.nextInt();
			 }
			 
			 Stack<Integer> st= new Stack<Integer>();
			 
			 for(int i=0;i<n;i++)
			 {
				 if(st.isEmpty()|| st.peek()<arr[i])
				 {
					 st.push(arr[i]);
				 }
			 }
			 System.out.println(st.size());
			 t--;
		 }
		
           }
}