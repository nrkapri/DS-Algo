import java.util.*;
import java.lang.*;
import java.io.*;

class NextGreaterNumber {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t>0)
		{
			int n=input.nextInt();

			nextGreaterNumber(n);

			t--;
		}

	}



	private static void nextGreaterNumber(int n) {
		// TODO Auto-generated method stub
		if(n<12) {
			System.out.println("not possible");
			return;
		}

		String s= new String();

		s+=n;
		int length =s.length();
		int[] arr = new int [length];
		length--;
		int num=n;
		while(n>0)
		{
			arr[length--]=n%10;
			n=n/10;
		}

		nextPermutation(arr,num);

	}



	public static void nextPermutation(int[] nums,int n) {
		if(nums == null || nums.length<2)
			return;

		int p=0;            
		for(int i=nums.length-2; i>=0; i--){
			if(nums[i]<nums[i+1]){
				p=i;
				break;
			}    
		}

		int q = 0;
		for(int i=nums.length-1; i>p; i--){
			if(nums[i]> nums[p]){
				q=i;
				break;
			}    
		}

		if(p==0 && q==0){
			reverse(nums, 0, nums.length-1);


			int newnum=0;
			for(int i=0;i<nums.length;i++)
			{
				newnum=newnum*10+nums[i];
			}

			if (newnum>n)
			{
				System.out.println(newnum);
			}
			else
			{
				System.out.println("not possible");
			}


			return;
		}

		int temp=nums[p];
		nums[p]=nums[q];
		nums[q]=temp;

		if(p<nums.length-1){
			reverse(nums, p+1, nums.length-1);
		}

		int newnum=0;
		for(int i=0;i<nums.length;i++)
		{
			newnum=newnum*10+nums[i];
		}

		if (newnum>n)
		{
			System.out.println(newnum);
		}
		else
		{
			System.out.println("not possible");
		}

	}

	public static void reverse(int[] nums, int left, int right){
		while(left<right){
			int temp = nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
}