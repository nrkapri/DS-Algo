import java.util.Scanner;

class TypeOfArray {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n=input.nextInt();
			 int [] arr= new int [n];
			 
			 for(int i=0;i<n;i++)
			 {
				 arr[i]=input.nextInt();
			 }
				 
			 int largest=0;
			 int smallest=0;
			 for(int i=0;i<n;i++)
			 {
				 if(arr[i]>arr[largest])
					 largest=i;
				 
				 if(arr[i]<arr[smallest])
					 smallest=i;
			 }
			 
			 System.out.print(arr[largest]+" ");
			 
			 if(largest==0 && smallest==n-1)
			 {
				 System.out.println(2);
			 }
			 else if(largest==n-1 && smallest ==0)
			 {
				 System.out.println(1);
			 }
			 else if(smallest==largest-1)
			 {
				 System.out.println(3);
			 }
			 else
				 System.out.println(4);
			 
			 
			 
			 
			 t--;
		 }
		
           }
}