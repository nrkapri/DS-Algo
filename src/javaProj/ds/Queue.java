package javaProj.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Queue {

	LinkedList<Integer> list; 
	
	Queue()
	{
		list=new LinkedList<Integer>(); 
	}
	
	boolean isEmpty()
	{
		return !(list.size()>0);
	}
	
	void push(Integer a)
	{
		list.add(a);
	}
	
	Integer pop()
	{
		if (isEmpty()) return -1;
		Integer x=list.get(0);
		list.remove(0);
		return x;
	}
	
	Integer getFront()
	{
		if (isEmpty()) return -1;
		return list.get(0);
	}
	
	
	public static void main(String[] args) {

		Queue st=new Queue();
//		StringBuffer sb=new StringBuffer(System.in);
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));	
		while (true)
		{
			System.out.println("Stack :");
			System.out.println("  1. push");
			System.out.println("  2. pop");
			System.out.println("  3. isEmpty");
			System.out.println("  4. front");
			System.out.println("  5. Exit");
			int a=0;
			try {
				a = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}

			switch (a)
			{
			case 1:
				System.out.println("        Enter number:");
				int x=0;
				try {
					x = Integer.parseInt(br.readLine());
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
				st.push((Integer)x);
				break;
			case 2:
				System.out.println("Popped int:"+st.pop());
				break;
			case 3:
				System.out.println("isempty:"+st.isEmpty());
				break;
			case 4:
				System.out.println("top:"+st.getFront());
				break;
			case 5:
				System.out.println("exiting ..");
				return;
			}
		}
		
		
		
		
		
	}

}
