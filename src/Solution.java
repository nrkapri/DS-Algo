import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Pairs implements Comparable 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + first+second;
		result = prime * result + second+first;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pairs other = (Pairs) obj;
		if (first == other.first && second == other.second )
			return true;
		if (second == other.first &&  first== other.second )
			return true;
		return false;
	}
	int 	first;
	int 	second ;
	Pairs(int x, int y )
	{
		first=x;
		second=y;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o ==null) return 1;
		Pairs p =(Pairs) o;
		if(this.first==p.first &&  this.second==p.second) return 0;
		if(this.first==p.second&&  this.second==p.first) return 0;

		return 1;
	}
}

public class Solution {
	public static int findPairs(int[] nums, int k) {

		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

		HashSet<Integer> s = new HashSet<Integer>();

		Arrays.sort(nums);

		for(int i=0;i<nums.length;i++)
		{
			hm.put(nums[i], i);
			//			s.add(nums[i]);
		}


		//    

		HashSet<Pairs> rp = new HashSet<Pairs>();

		int res=0;
		for(int i=0;i<nums.length;i++)
		{
			if(hm.containsKey(nums[i]+k) &&  hm.get(nums[i]+k)!=i)
			{
				rp.add(new Pairs(nums[i],nums[i]+k));
			}
		}


		//		for(Pairs p: rp)
		//		{
		//			if(rp.contains(new Pairs(p.second,p.first)))
		//			{
		//				rp.remove(new Pairs(p.second,p.first));
		//			}
		//		}

		return rp.size();
	}


	//	 public static int change(int amount, int[] coins) {
	//		 
	//		 return changeUtils(amount,coins,coins.length-1);
	//	    }

	public static int change(int amount, int[] coins) {
		//	return changeUtils(amount,coins,coins.length-1);
		int [][] table= new int[amount+1][coins.length+1];

		for(int i=0;i<coins.length+1;i++)
		{
			table[0][i]=1;
		}

		for(int  i=1;i<amount+1;i++)
		{
			for(int j=0;j<coins.length	;j++)
			{
				int x= i-coins[j]>=0 ?table[i-coins[j]][j]:0;
				int y= j>=1?table[i][j-1]:0; 
				table[i][j]=x+y;
			}
		}


		return table[amount][coins.length];
	}


	private static int changeUtils(int amount, int[] coins, int length) {
		// TODO Auto-generated method stub
		if(length<0) return 0;
		if(amount==0 ) return 1;
		if(amount<0 ) return 0;

		return  changeUtils(amount-coins[length],coins,length) +
				changeUtils(amount,coins,length-1) ;
	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();

		Arrays.sort(candidates);
		ArrayList<Integer> al=new ArrayList<Integer> (); 
		CSUtil(ret,al,candidates,target,candidates.length);

		HashSet<String> hs = new HashSet<String>();

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(List<Integer> a:ret)
		{
			//ArrayList<Integer> tl= new ArrayList<Integer> (); 
			String s="";
			for(Integer x: a)
			{
				s+=x;
			}
			System.out.println(s);
			if(!hs.contains(s))
			{
				res.add(a);
			}
			hs.add(s);
		}

		List<List<Integer>> res1 = new ArrayList<List<Integer>>();
		for(List<Integer> a: res)
		{
			a.sort(null);
			res1.add(a);
		}

		return res1;
	}


	private static void CSUtil(List<List<Integer>> ret, ArrayList<Integer> al, int[] candidates, int target, int length) {
		// TODO Auto-generated method stub
		if(target<0) return;

		if(length<=0) return;

		ArrayList<Integer> nal= new ArrayList<Integer>(al);
		
		System.out.println("nayan:");
		for(Integer a:nal)
		{
			System.out.print(a+ " ");
		}
		System.out.println();
		if(target==candidates[length-1]) 
		{
			System.out.println(target);
			nal.add(candidates[length-1]);
			ret.add(nal);
			return;
		}


		CSUtil(ret,nal,candidates,target,length-1);

		nal.add(candidates[length-1]);
		CSUtil(ret,nal,candidates,target-candidates[length-1],length-1);

	}


	public static void main (String [] args)
	{
		int[] c= {10, 1, 2, 7, 6, 1, 5};
		List<List<Integer>> ret=combinationSum2(c,8);

		System.out.print("Nayan");
		//		int[] coins = { 3,5,7,8,9,10,11};
		//		System.out.println(change(500,coins));


		//		int[]  nums = {3,1,4,1,5};
		//		System.out.print(findPairs(nums,0));
	}
}