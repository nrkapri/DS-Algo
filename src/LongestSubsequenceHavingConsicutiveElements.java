import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LongestSubsequenceHavingConsicutiveElements {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n= input.nextInt();

			ArrayList<Integer> arr = new ArrayList<Integer> (n);

			for(int i=0;i<n;i++)
			{
				arr.add(input.nextInt());
			}

			Collections.sort(arr);

			int start=0;
			int end=0;
			int gmax=Integer.MIN_VALUE;
			int lmax=Integer.MIN_VALUE;
			int prev=arr.get(0);
			gmax=1;
			lmax=1;
			for(int i=1;i<n;i++)
			{
				if(arr.get(i)==prev+1)
				{
					lmax++;
					
				}
				else
				{
					lmax=1;
				}
				prev=arr.get(i);
				
				if(lmax>gmax)
				{
					gmax=lmax;
				}

			}
			
			System.out.println(gmax);
			
			
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