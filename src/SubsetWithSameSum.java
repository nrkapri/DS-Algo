import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Input:
2
4
1 5 11 5
3
1 3 5 

Output:
YES
NO
 */

class SubsetWithSameSum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();


		while (t>0)
		{
			int n = input.nextInt();

			int [] arr = new int [n];

			int sum=0;
			for(int i=0;i<n;i++ )
			{
				arr[i] = input.nextInt();
				sum+=arr[i];
			}

			if (sum%2!=0)
			{
				System.out.println("NO");
				t--;
				continue;
			}

			sum=sum/2;

			boolean[][]  tab= new boolean [n+1][sum+1];

			for (int i =0;i<=n;i++){
				for(int j=0;j<=sum;j++){
					if( j==0)
					{
						tab[i][j]=true;
					}
					else  if (i == 0)
					{
						tab[i][j]=false;
					}
					else
					{
						boolean f1 = false;
						boolean f2 = false;
						if (i-1 >=0 && j-arr[i-1] >=0) f1= tab[i-1][j-arr[i-1]]; 
						if (i-1 >=0 ) f2= tab[i-1][j];
						tab[i][j]= f1 || f2;
					}
				}
			}

			if(tab[n][sum]) {
				System.out.println("YES");
			}else{
				System.out.println("NO");}

			t--;
		}

	}
}