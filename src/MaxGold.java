import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class MaxGold {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 int m= input.nextInt();
			 
			 int[][] arr= new int [n][m];
			 
			 int[][] table=new int [n+1][m+1];
			 
			 
			 for(int i=0;i<n;i++)
			 {
				 for(int j=0;j<m;j++)
				 {
					 arr[i][j]=input.nextInt();
				 }
			 }
			 
			 
			 for(int i=1;i<m+1;i++)
			 {
				 for(int j=1;j<n+1;j++)
				 {
					 int x=0;
					 int y=0;
					 int z=0;
					 if(i-1>=0)x=table[j][i-1];
					 if(j-1>0 &&  i-1>=0)y=table[j-1][i-1];
					 if(j+1<n+1 &&  i-1>=0)z=table[j+1][i-1];
					 
					 table[j][i]=Math.max(Math.max(x,y),z)+arr[j-1][i-1];
				//	 printarr(table,n+1,m+1);
				 }
			 }
			 
			 int max =0;
			 for(int i=1;i<n+1;i++)
			 {
				 if(table[i][m]>max)
					 max=table[i][m];
			 }
			 
			 //printarr(arr,n,m);
			 //printarr(table,n+1,m+1);
			 System.out.println(max);
			 t--;
		 }
		
           }

	private static void printarr(int[][] arr, int n, int m) {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nArray is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println("  ");
		}
	}
}