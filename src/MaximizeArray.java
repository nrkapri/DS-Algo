import java.util.HashMap;
import java.util.Scanner;

class MaximizeArray {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n=input.nextInt();

			int[] arr1= new int[n];
			int[] arr2= new int[n];

			for(int i=0;i<n;i++)
			{
				arr1[i]=input.nextInt(); 
			}

			for(int i=0;i<n;i++)
			{
				arr2[i]=input.nextInt(); 
			}

			int i=0;
			int j=0;

			HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();

			int count=0;
			while(i<n && j<n)
			{
				if(arr1[i]>arr2[j])
				{
					if(!hm.containsKey(arr1[i]))
					{
						hm.put(arr1[i], 0);
						System.out.print(arr1[i]+" ");
					count++;
					if(count==n)
							break;
					}

					i++;
				}
				else if(arr1[i]<arr2[j])
				{
					if(!hm.containsKey(arr2[i]))
					{
						hm.put(arr2[i], 0);
						System.out.print(arr2[i]+" ");
						count++;
						if(count==n)
								break;
					}
					j++;
				}
				else
				{
					if(!hm.containsKey(arr1[i]))
					{
						hm.put(arr1[i], 0);
						System.out.print(arr1[i]+" ");
						count++;
						if(count==n)
								break;
					}
					i++;j++;
				}
			}

			while(i<n && count!=n)
			{
				if(!hm.containsKey(arr1[i]))
				{
					hm.put(arr1[i], 0);
					System.out.print(arr1[i]+" ");
					count++;
					if(count==n)
							break;
				}
				i++;
			}

			while(j<n && count!=n)
			{
				if(!hm.containsKey(arr2[j]))
				{
					hm.put(arr2[j], 0);
					System.out.print(arr2[j]+" ");
					count++;
					if(count==n)
							break;
				}
				j++;
			}

			t--;
		}

	}
}