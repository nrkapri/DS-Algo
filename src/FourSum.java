import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class FourSum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{

			int n=input.nextInt();

			int k=input.nextInt();

			int [] arr= new int[n];

			//ArrayList<Integer> al= new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				//al.add(input.nextInt());
				arr[i]= input.nextInt();
			}

			//			Collections.sort(al);
			//		Object[] arr= al.toArray();

			Arrays.sort(arr);
			boolean found=false;
			ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					HashMap<Integer,Integer>  hm=new HashMap<Integer,Integer> ();

					for(int ctr=j+1;ctr<n;ctr++)
					{
						if(ctr !=i &&  ctr!=j )
						{
							if(hm.containsKey(k-arr[i]-arr[j]-arr[ctr]))
							{

								al.add(sortedArray(arr[i],arr[j],arr[ctr],(k-arr[i]-arr[j]-arr[ctr])));
								//			System.out.print(arr[i]+" "+arr[j]+" "+arr[ctr]+" "+(k-arr[i]-arr[j]-arr[ctr])+" $");
								found=true;
								hm.put(arr[ctr], 0);
							}
							else
							{
								hm.put(arr[ctr], 0);
							}
						}
					}
				}
			}
			if(!found)
			{
				System.out.print("-1");
			}
			else
			{
				if(!al.isEmpty())
				{
					printStrings(al);
				}
			}
			System.out.println("");


			t--;
		}

	}

	private static void printStrings(ArrayList<ArrayList<Integer>> al) {
		// TODO Auto-generated method stub

		HashSet<ArrayList<Integer>> ts=new HashSet<ArrayList<Integer>>(al);

		al = new ArrayList<ArrayList<Integer>>(ts); 

		Collections.sort(al,new Comparator<ArrayList<Integer>> () {
			@Override
			public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {

				for(int i=0;i<4;i++)
				{
					if(a.get(i)>b.get(i))
					{
						return 1;
					}
					else if(a.get(i)<b.get(i))
					{
						return -1;
					}
				}
				return 0;

			}
		});




		//		ts.addAll(al);


		for(ArrayList<Integer> a:al)
		{
			//			ts.addAll(c)
			for(Integer i:a)
			{
				System.out.print(i+" ");
			}
			System.out.print("$");
		}

	}

	private static ArrayList<Integer> sortedArray(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		//	System.out.print(i+" "+j+" "+k+" "+l+" $");

		//int [] arr=new int [4];

		ArrayList<Integer> al= new ArrayList<Integer>();

		al.add(i);
		al.add(j);
		al.add(k);
		al.add(l);

		Collections.sort(al);;
		return al;

	}
}
