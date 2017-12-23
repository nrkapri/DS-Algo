import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

class CountElementsALEQinB {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n = input.nextInt();
			 
			 Integer [] b=new Integer[n];
			 int [] a= new int [n];
			 
			 for (int i=0;i<n;i++)
			 {
				 a[i]= input.nextInt();
			 }
			 for (int i=0;i<n;i++)
			 {
				 b[i]= input.nextInt();
			 }

//			 Arrays.sort(b);
			  Arrays.sort(b, new Comparator <Integer>()
					  {
				  		
						@Override
						public int compare(Integer a, Integer b) {
							
							if(a>b)return -1;
							else if(a<b) return 1;
							return 0;
						}
					  });
			 
			 
			  for(int i=0;i<n;i++)
			  {
				  if(i>0)
				  {
					  System.out.print(",");
				  }
				  System.out.print(Arrays.binarySearch(b, a[i]));
			  }
			 System.out.println("");
//			 int [] maxsofar=new int [n];
//			 for (int i=0;i<n;i++)
//			 {
//				 b[i]= input.nextInt();
//				 if(i==0) {
//				 maxsofar[i]=b[i];
//				 }
//				 else
//					 maxsofar[i]=maxsofar[i]>b[i]?maxsofar[i]:b[i];
//			 }
			 

			 
			 
			 t--;
		 }
		
           }
}