import java.util.*;
import java.lang.*;
import java.io.*;
//then you solve it with DP
class LCS3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		input.nextLine();
		
		while (t>0)
		{
			String x= input.nextLine();
			String y= input.nextLine();
			String z= input.nextLine();

			System.out.println(LCS3(x,x.length(),y,y.length(),z,z.length()));
			
			t--;
		}

	}

	private static int LCS3(String x, int i, String y, int j, String z, int k) {
		// TODO Auto-generated method stub
		if(i<=0 || j<=0||k<=0) return 0;
		
		if(x.charAt(i-1)==y.charAt(j-1) && x.charAt(i-1)==z.charAt(k-1))
		{
			return LCS3(x,i-1,y,j-1,z,k-1)+1;
		}
		else
		{
			return Math.max(Math.max(LCS3(x,i,y,j,z,k-1), LCS3(x,i,y,j-1,z,k)), LCS3(x,i-1,y,j,z,k));
		}
		
	}
}