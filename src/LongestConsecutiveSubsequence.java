import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LongestConsecutiveSubsequence {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 
			 int[] arr= new int[n];
			 for(int i=0;i<n;i++)
			 {
				 arr[i]=input.nextInt();
			 }
			 
			 ArrayList<Integer> maxar=null;
			 for(int i=0;i<n;i++)
			 {
				 ArrayList<Integer> lmar=new ArrayList<Integer>();
				 for(int j=i;j<n;j++)
				 {
					 lmar.add(arr[j]);
					 if(isLmarConsecutive(lmar) )
					 {
						 if(maxar==null || maxar.size()<lmar.size())
						 {
							 maxar= new  ArrayList<Integer>(lmar);
						 }
					 }
				 }
			 }
			 
			 Collections.sort(maxar);
			 
			 for(Integer a:maxar)
			 {
				 System.out.print(a+" ");
			 }
			 System.out.println(maxar.size());
			 t--;
		 }
		
           }

	private static boolean isLmarConsecutive(ArrayList<Integer> lmar) {
		// TODO Auto-generated method stub
		
		if (lmar.size()<=0) return false;
		if(lmar.size()==1) return true;
//		HashSet<Integer> hs= new HashSet<Integer>(lmar);
		
		//ArrayList<Integer> lar= new ArrayList<Integer>; 
		
		Collections.sort(lmar);
		
		for(int i=1;i<lmar.size();i++)
		{
			if(lmar.get(i)!=lmar.get(i-1)+1)
			{
				return false;
			}
		}
		
		return true;
	}
}