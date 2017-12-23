import java.util.LinkedHashMap;
import java.util.Scanner;

class FirstNonrepeat {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n= input.nextInt();
			input.nextLine();
			String s= input.nextLine();
			char[] charr=s.toCharArray();
			LinkedHashMap<Character,Integer> lmap= new LinkedHashMap<Character,Integer>();
			for(int i=0;i<s.length();i++)
			{
				if(charr[i]>='a' &&  charr[i]<='z')
				{
					if(lmap.containsKey(charr[i]))
					{
						lmap.remove(charr[i]);
						lmap.put(charr[i], 1);
					}
					else
					{
						lmap.put(charr[i], 0);
					}
					
					boolean found=false;
					for( Character k:lmap.keySet())
					{
						if(lmap.get(k)==0 )
						{
							System.out.print(k+" ");
							found=true;
							break;
						}
					}
					if(!found)
					{
						System.out.print("-1 ");
					}

				}
			}
			System.out.println();
			t--;
		}

	}
}