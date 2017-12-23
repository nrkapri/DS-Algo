import java.util.Scanner;

class StockBuySell {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n=input.nextInt();
			 
			 int[] arr= new int[n];
			 
			 for(int i=0;i<n;i++)
			 {
				arr[i]= input.nextInt(); 
			 }
			 
			int i=0;
			boolean found=false;
			 while(i<n-1)
			 {
				// 1. Find Local Minima 
				 while((i<n-1)&& arr[i+1]<=arr[i])
					 i++;
			
				 if(i==n-1) break;
				 
				 int minima=i;
				 //2. Find Local maxima
				 i++;
				 
				 while((i<n) && (arr[i]>=arr[i-1]))
					 i++;
				 
				 int maxima=i-1;
				 
				 //3. Add both minima and maxima as buying and selling point 
				 found=true;
				 System.out.print("("+minima+" "+maxima+") ");
				 //do the same for rest of the array
			 }
			 if(!found)
				 System.out.print("No Profit");
			 
			 
			 System.out.println();
			 t--;
		 }
		
           }
}