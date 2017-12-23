import java.util.*;
import java.lang.*;
import java.io.*;

class LongestPalindromicSubString {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine(); 
		while (t>0)
		{
			String str=input.nextLine();

			int n=str.length();
			boolean[][] table =new boolean[n][n];

			int maxLength = 1;
			for (int i = 0; i < n; ++i)
				table[i][i] = true;

			int start = 0;
			for (int i = 0; i < n-1; ++i)
			{
				if (str.charAt(i) == str.charAt(i+1))
				{
					table[i][i+1] = true;
					start = i;
					maxLength = 2;
				}
			}

		    // Check for lengths greater than 2. k is length
		    // of substring
		    for (int k = 3; k <= n; ++k)
		    {
		        // Fix the starting index
		        for (int i = 0; i < n-k+1 ; ++i)
		        {
		            // Get the ending index of substring from
		            // starting index i and length k
		            int j = i + k - 1;
		 
		            // checking for sub-string from ith index to
		            // jth index iff str[i+1] to str[j-1] is a
		            // palindrome
		            if (table[i+1][j-1] && str.charAt(i) == str.charAt(j))
		            {
		                table[i][j] = true;
		 
		                if (k > maxLength)
		                {
		                    start = i;
		                    maxLength = k;
		                }
		            }
		        }
		        
		        
		        
		        
		    }

		    
		    int len=0;
	        int st=0;
	        
	        for(int i=0;i<n;i++)
	        {
	        	for(int j=0;j<n;j++)
	        	{
	        		if(table[i][j]==true)
	        		{
	        			if(Math.abs(j-i+1)>len)
	        			{
	        				len=Math.abs(j-i+1);
	        				st=i>j?j:i;
	        			}
	        		}
	        	}
	        }
	        
	        
		    printSubStr( str, st, st + len - 1 );
		    
			t--;
		}

	}

	private static void printSubStr(String str, int low, int high) 
	{
		// TODO Auto-generated method stub
		for( int i = low; i <= high; ++i )
	        System.out.print(str.charAt(i));
	
		System.out.println();
	}
}