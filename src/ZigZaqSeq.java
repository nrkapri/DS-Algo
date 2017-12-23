import java.util.Scanner;

class ZigZaqSeq {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			int n=input.nextInt();
			
			int[][] arr=new int [n][n];
			
			int[][] table=new int [n+1][n+1];
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=input.nextInt();
				}
			}
			
			for(int i=1;i<n+1;i++)
			{
				for(int j=1;j<n+1;j++)
				{
					//int x=0;
					//int y=0;
					
					//if(i-1>=0 && j-1 >=0)x=table[i-1][j-1];
					//if(i-1>=0 &&j+1<n+1) y=table[i-1][j+1];
					
					table[i][j]=maxrow(table,i,j,n)+arr[i-1][j-1];
					//GFGUtils.printarr(table, n+1,n+1);
				}
			}
			
			int max =0;
			 for(int i=1;i<n+1;i++)
			 {
				 if(table[n][i]>max)
					 max=table[n][i];
			 }
			
			 //GFGUtils.printarr(arr, n,n);
			 //GFGUtils.printarr(table, n+1,n+1);
			System.out.println(max);
			 t--;
		 }
		
           }

	private static int maxrow(int[][] table, int i, int j,int n) {
		// TODO Auto-generated method stub
	
		int max=0;
		
		for(int x=0;x<n+1;x++)
		{
			if(x==j) continue;
			if(table[i-1][x]>max)
				max=table[i-1][x];
		}
		return max;
	}
}