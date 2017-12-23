import java.util.*;
import java.lang.*;
import java.io.*;

class LongestCommonSubString {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int lx=input.nextInt();
			 int ly=input.nextInt();
			 
			 input.nextLine();
			 
			 String strx=input.nextLine();
			 
			 String stry=input.nextLine();
			 
			 char[] charx=strx.toCharArray();
			 char[] chary=stry.toCharArray();
			 
			 System.out.println(LCS(charx,chary,lx-1,ly-1));
			 
			 t--;
		 }
		
           }

	private static int LCS(char[] charx, char[] chary, int i, int j) {
		// TODO Auto-generated method stub
		if(i<0||j<0) return 0;
		int max=0;
		for(int k=0;k<i+1;k++)
		{
			for(int l=0;l<j+1;l++)
			{
				int x=LCSrecur(charx,chary,k,l);//Math.max(LCSrecur(charx,chary,k,l-1), LCSrecur(charx,chary,k-1,l));
				if(x>max)
				{
					max=x;
				}
				//System.out.println("k,l,x:"+k+","+l+","+x);
			}
			
		}
		return max;
		
	}

	private static int LCSrecur(char[] charx, char[] chary, int lx, int ly) {
		// TODO Auto-generated method stub
		if(lx<0 || ly<0) return 0;
		
		if(charx[lx]==chary[ly]) 
		{
			return LCSrecur(charx,chary,lx-1,ly-1)+1;
		}
		else
		{
			return 0;
		}
		
		
	}
}