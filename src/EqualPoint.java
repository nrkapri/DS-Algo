import java.util.*;
import java.lang.*;
import java.io.*;

class EqualPoint {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();

		while (t>0)
		{
			String s=input.nextLine();

			char[] carr=s.toCharArray();


			for(int i=0;i<s.length()+1;i++)
			{
				int open=0;
				int close=0;

				int j=0;
				while(j<i)
				{
					if(carr[j]=='(')
					{
						open++;
					}
				j++;
				}

				j=i;
				while(j<s.length())
				{
					if(carr[j]==')')
					{
						close++;
					}
				j++;
				}

				if(open==close)
				{
					System.out.println(i);
					break;
				}
			}

			t--;
		}

	}
}