import java.util.*;
import java.lang.*;
import java.io.*;

class JumpigNumbers {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n=input.nextInt();

			ArrayList<String> ar= new ArrayList<String>();
			for(int i=0;i<=n;i++)
			{
				if(isJumpingNumber(i))
				{
					ar.add(new Integer(i).toString());
				}
			}

			Collections.sort(ar);

			for(String s:ar)
			{
				System.out.print(s+" ");
			}
			System.out.println();
			t--;
		}

	}

	private static boolean isJumpingNumber(int i) {
		// TODO Auto-generated method stub

		if(i<10) return true;
		String s= new Integer(i).toString(); 

		for(int j=0;j<s.length()-1;j++)
		{
			if(Math.abs(s.charAt(j)-s.charAt(j+1))!=1)
			{
				return false;
			}
		}

		return true;
	}
}