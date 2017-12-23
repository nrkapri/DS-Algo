import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;


class PairsWithGivenSum {


	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int t= input.nextInt();

		while (t>0)
		{
			int n=input.nextInt();
			int m=input.nextInt();
			int x=input.nextInt();

			TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
			boolean isFirst=true;
			for (int i=0;i<n;i++)
			{
				map.put(input.nextInt(),0);
			}

			ArrayList<Pair> res= new ArrayList<Pair>();
			for (int i=0;i<m;i++)
			{
				int a=input.nextInt();
				if(map.containsKey(x-a))
				{
					// if(!isFirst)System.out.print(",");
					//if(isFirst) isFirst=false;
					//System.out.print(Math.abs(a-x) + " "+a);
					res.add(new Pair(x-a,a));
				}
			}

			Collections.sort(res, new Comparator<Pair> ()
			{
				public int compare(Pair  p1,Pair p2){
					//	Pair p1= (Pair)o1;
					//	Pair p2= (Pair)o2;

					if(p1.x== p2.x  &&  p1.y==p2.y)
					{
						return 0;
					}
					else if(p1.x>p2.x)
					{
						return 1;
					}
					else if(p1.x==p2.x && p1.y>p2.y)
					{
						return 1;
					}
					else
					{
						return -1;
					}


				}
			}
					);



			for(int i=0;i<res.size();i++)
			{
				Pair p=res.get(i);
	
				if(i!=0)
				{
					System.out.print(" ");
				}
				System.out.print(p.x+" "+p.y);
				if(i!=res.size()-1)
					System.out.print(",");
			}
			if(res.isEmpty()||res.size()==0)
			{
				System.out.print("-1");
			}
			System.out.println();

			t--;
		}

	}

}

class Pair 
{
	public int x;
	public int y;

	Pair(int a,int b)
	{
		x=a;
		y=b;
	}
}
