import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;


class TopKnumByFreq {
	class Data{
		int value;
		int frequency;

		public	Data(Integer v,Integer f){
			value=v;
			frequency=f;
		}
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n= input.nextInt();
			int k = input.nextInt();

			//ArrayList<Integer> arl= new ArrayList<Integer>();

			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

			for(int  i=0;i<n;i++)
			{
				int key=input.nextInt();
				if(hm.containsKey(key))
				{
					int value=hm.get(key);
					//hm.remove(key);
					hm.put(key, value+1);
				}
				else
				{
					hm.put(key, 1);
				}


				PriorityQueue<Data> pq= new PriorityQueue<Data>(10,new Comparator<Data>()
				{
					@Override
					public int compare(Data a, Data b) {
						if(a.frequency>b.frequency)
							return -1;
						else if(a.frequency<b.frequency)
							return 1;
						else {
							if(a.value>b.value)
								return 1;
							else if (a.value<b.value)
								return -1;
							else
								return 0;
						}

					}
				}
						);


				for(Integer m:hm.keySet())
				{
					pq.add(new TopKnumByFreq().new Data(m,hm.get(m)));
				}

				int count=0;
				while(!pq.isEmpty())
				{
					System.out.print(pq.poll().value+" ");
					count++;
					if(count==k)break;
				}

			}
			System.out.println("");

			t--;
		}

	}
}