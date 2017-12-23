import java.util.Scanner;

class MaxOnes {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int row=input.nextInt();
			 int col=input.nextInt();
			 
			 int  min =col;
			 int minrow=0;
			 
			 int[][] arr  = new int[row][col];//input.nextInt();
			 for(int i=0;i<row;i++)
			 {
			     for(int j=0;j<col;j++)
			     {
			         arr[i][j]=input.nextInt();
			     }
			 }
			 
			 
			 for(int i=0;i<row;i++)
			 {
			     for(int j=0;j<min;j++)
			     {
			         if(arr[i][j]==1  && min >j)
			         {
			             min=j;
			             minrow=i;
			             break;
			         }
			     }
			 }
			 
			 System.out.println(minrow);
			 
			 t--;
		 }
		
           }
}