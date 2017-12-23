import java.util.Scanner;

class MinEggDrop {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n= input.nextInt();
			 int k= input.nextInt();
	    
	         int[][] table= new int[n+1][k+1];
	         
	         for(int i=1;i<k+1;i++)
	            table[1][i]=1;
	            
	            
	            for(int i=2;i<n+1;i++)
	            {
	                for(int j=1;j<k+1;j++)
	                {
	                    table[i][j]=Math.min(table[i-1][j-1],table[i-1][j])+1;
	                    
	                    GFGUtils.printarr(table,n+1,k+1);
	                }
	            }
	            
	            System.out.println(table[n][k]);
			 t--;
		 }
		
           }
}