import java.util.*;
import java.lang.*;
import java.io.*;

class UniqueNumbers {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int m=input.nextInt();
			int n=input.nextInt();

			for(int i=m;i<=n;i++)
			{
				HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
				int x=i;
				boolean found=false;
				while(x>0)
				{
					int a=x%10;
					x=x/10;
					if(hm.containsKey(a))
					{
						found=true;
						break;
					}
					hm.put(a, 0);
				}
				if(!found)
				{
					System.out.print(i+" ");
				}
			}
			System.out.println();
			t--;
		}

	}
}