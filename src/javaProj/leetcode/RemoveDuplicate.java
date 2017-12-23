package javaProj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static int[] removeDuplicates(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> m= new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++)
        {
            m.put(nums[i],0);
        }
        
        ArrayList<Integer> res= new ArrayList<Integer>();
        
        for(Map.Entry e: m.entrySet())
        {
            res.add((Integer) e.getKey());
        }
        
        int[] a =new int[res.size()];
        
        for(int i =0;i<a.length;i++)
        {
        	a[i]=res.get(i);
        }
        return a;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] ={1,1,2};
		
		
		int [] res= removeDuplicates(a);
		
		for(int i =0;i<res.length;i++)
			System.out.println(res[i]);
		
	}

}
