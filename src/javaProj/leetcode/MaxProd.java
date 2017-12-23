package javaProj.leetcode;
public class MaxProd {
	public static int maxProduct(int[] nums) {
		int n=nums.length;
		int []  table = new int[n+1];
		table[0]=1;
		for(int i =1;i<=n;i++)
		{
			
			int max=-99999;
			for(int j=0;j<i;j++)
			{
				System.out.println("i,j:"+i+","+j);
				if (max< table[j]*nums[i-1])
				{
					max=table[j]*nums[i-1];
				}
			}
			table[i]=max;
		}
		int max=nums[0];
		for(int i =1;i<=n;i++)
		{
			System.out.println(table[i]);
			if (max< table[i])
			{
				max=table[i];
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
			int[] arr={2,3,-2,4};
			System.out.println(maxProduct(arr));
	}

}
