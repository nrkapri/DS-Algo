import java.util.*;
import java.lang.*;
import java.io.*;

class LongestEvenLength {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		while (t>0)
		{
			String s=input.nextLine();
			System.out.println(findLength(s));
			t--;
		}

	}

	static int findLength(String s)
	{
		//int n = strlen(str);

		int n=s.length();

		char[] str= s.toCharArray();

		int maxlen =0; // Initialize result

		// Choose starting point of every substring
		for (int i=0; i<n; i++)
		{
			// Choose ending point of even length substring
			for (int j =i+1; j<n; j += 2)
			{
				int length = j-i+1;//Find length of current substr

				// Calculate left & right sums for current substr
				int leftsum = 0, rightsum =0;
				for (int k =0; k<length/2; k++)
				{
					leftsum += (str[i+k]-'0');
					rightsum += (str[i+k+length/2]-'0');
				}

				// Update result if needed
				if (leftsum == rightsum && maxlen < length)
					maxlen = length;
			}
		}
		return maxlen;
	}
}