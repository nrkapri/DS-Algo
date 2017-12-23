import java.util.HashMap;
import java.util.Scanner;

class SumEqualsSum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 
		 while (t>0)
		 {
			 int n = input.nextInt();
			 
			 int[] arr= new int[n];
			 for(int i=0;i<n;i++)
			 {
				 arr[i]= input.nextInt();
			 }
			 
//			 Arrays.sort(arr);

			 HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			 for(int i=0;i<n;i++)
			 {
				 for(int j=0;j<n;j++)
				 {
					 if(i==j) continue;
					 if(hm.containsKey(arr[i]+arr[j]))
					 {
						 hm.put(arr[i]+arr[j], 1+hm.get(arr[i]+arr[j]));
					 }
					 else
					 {
						 hm.put(arr[i]+arr[j], 1);
					 }
				 }
			 }
			 
			 boolean answer = false;
			 for(Integer m:hm.values())
			 {
				 if(m>2)answer=true;
			 }
			 
			 if(answer)
				 System.out.println("1");
			 else
				 System.out.println("0");
			 
			 
			 t--;
		 }
		
           }
}