package javaProj.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Stack {

	ArrayList<Integer> data;
	
   Stack ()
   {
	   data=new ArrayList<Integer>();
   }
   
	private void push(Integer a)
	{
		data.add(a);
	}
	
	private Integer top()
	{
	  if (isEmpty()) return -1;
	  return data.get(data.size()-1);
	}
	
	private Integer pop()
	{
		  if (isEmpty()) return -1;
		  Integer popdata= data.get(data.size()-1);
		  data.remove(data.size()-1);
		  return popdata;
	}
	
	private boolean isEmpty()
	{
		
		return !(data.size()>0);
	}
	
	
	public static void main(String[] args) {

		Stack st=new Stack();
//		StringBuffer sb=new StringBuffer(System.in);
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));	
		while (true)
		{
			System.out.println("Queue :");
			System.out.println("  1. push");
			System.out.println("  2. pop");
			System.out.println("  3. isEmpty");
			System.out.println("  4. top");
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
				System.out.println("top:"+st.top());
				break;
			case 5:
				System.out.println("exiting ..");
				return;
			}
		}
	}

}
