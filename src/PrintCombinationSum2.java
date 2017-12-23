import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class PrintCombinationSum2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n= input.nextInt();

			int[] arr= new int [n];

			for(int i=0;i<n;i++)
			{
				arr[i]=input.nextInt();
			}

			int sum=input.nextInt();
			ArrayList<Integer> al=new ArrayList<Integer>();
			
//			HashSet<Integer> hs = new HashSet<Integer> ();
//			for(int i=0;i<arr.length;i++)
//			{
//				hs.add(arr[i]);
//			}
//			Integer []a =hs.toArray(new Integer[hs.size()]);
			Arrays.sort(arr);
			if(!printifSum(arr,al,0,arr.length-1,sum))
			{
				System.out.print("Empty");
			}



			System.out.println();
			t--;
		}

	}


	private static boolean printifSum(int[] a2, ArrayList<Integer> al, int i, int j,int sum) {
		// TODO Auto-generated method stub
		if(sum<0)return false;
		if(sum==0) 
		{
			System.out.print("(");
			al.sort(null);
			for(int x=0;x<al.size();x++)
			{
				System.out.print(al.get(x));
				if(x!=al.size()-1)
					System.out.print(" ");
			}
			System.out.print(")");
			return true;
		}

		if(i>j)return false;

		boolean a=false;
		boolean b=false;

		if(i+1<=j && a2[i]==a2[i+1])
		{
			al.add(a2[i]);
		
			a=printifSum(a2,al,i+1,j,sum-a2[i]);
			//al.remove(al.indexOf(a2[i]));
			return a;
		}
		else
		{
			al.add(a2[i]);
			a=printifSum(a2,al,i+1,j,sum-a2[i]);
			al.remove(al.indexOf(a2[i]));
			
			b=printifSum(a2,al,i+1,j,sum);	
			return a|b;
		}
		

		
	}
}