package javaProj.ds;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> arr;
	
	Heap()
	{
		arr= new ArrayList<Integer>();
	}
	
	
	void heapify(int i)
	{
		int size =arr.size();
		int largest =i;
		int lc=2*i+1;
		int rc=2*i+2;
		
		if(lc<size  && arr.get(lc)>arr.get(largest))
		{
			largest=lc;
		}
		
		if(rc<size &&  arr.get(rc) >arr.get(largest))
		{
			largest=rc;
		}
		
		
		
		if(largest!=i)
		{
			int t=arr.get(i);
			arr.set(i,arr.get(largest));
			arr.set(largest, t);
			
			
			heapify(largest);
		}
	}
	
	
	void heapSort()
	{
		for(int i=arr.size()/2 -1 ;i>=0;i--)
		{
			heapify(i);
		}
		
		for(int i =n-1 ;i >=0;i--)
		{
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
