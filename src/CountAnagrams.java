import java.util.HashMap;
import java.util.Scanner;

class CountAnagrams {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		while (t>0)
		{
			String str=input.nextLine();
			String word=input.nextLine();


			int count=0;
			if(word.length()==1)
			{
				for(int i=0;i<str.length();i++)
				{
					if(word.charAt(0)==str.charAt(i))
					{
						count++;
					}
				}
				System.out.println(count);
				t--;
				continue;

			}

			for(int i=0;i<str.length()-1;i++)
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(word.length()==j-i+1 &&isAnagram(word,str,i,j))
					{
						count++;
					}
				}
			}
			System.out.println(count);
			t--;
		}

	}

	private static boolean isAnagram(String word, String str, int i, int j) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hm= new HashMap<Character,Integer> ();

		for(int c=0;c<word.length();c++)
		{
			if(hm.containsKey(word.charAt(c)))
			{
				int count=hm.get(word.charAt(c));
				hm.remove(word.charAt(c));
				hm.put(word.charAt(c), count+1);
			}
			else
			{
				hm.put(word.charAt(c), 1);
			}
		}

		for(int c=i;c<=j;c++)
		{
			if(hm.containsKey(str.charAt(c)))
			{
				int count=hm.get(str.charAt(c));
				if (count ==1) {
					hm.remove(str.charAt(c));
				}
				else
				{
					hm.put(str.charAt(c), count-1);
				}


			}
			else
			{
				return false;
			}

		}

		if(hm.size()>0) return false;

		return true;
	}
}