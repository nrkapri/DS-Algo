package javaProj.ds;

import java.util.LinkedList;

public class LinkedListL {
	Node head=null;

	class Node {
		int data;
		Node next;

		Node(int x)
		{
			data=x;
			next=null;
		}
	};

	private void addEnd(int x)
	{
		if(head==null)
		{
			head=new Node(x);
		}
		else {
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;

			}
			temp.next=new Node(x);
		}
		showlist();
	}

	private void deleteX(int x)
	{
		Node temp=head;
		Node prev=null;
		while(temp!=null)
		{
			if(temp.data==x)
			{
				if(temp==head)
				{
					Node t=temp.next;
					temp.next=null;
					head=t;
				}
				else if (temp.next==null) 
				{
					prev.next=null;
					temp=null;
				}
				else
				{
					prev.next=temp.next;
					temp=null;
				}
				return;
			}
			prev=temp;
			temp=temp.next;
		}

	}

	void reverse()
	{
		Node prev=null;
		Node cur=null;
		Node next=null;
		
		cur=head;
		
		
	}
	
	
	
	
	
	private void showlist()
	{
		Node temp=head;
		if (temp==null)
		{
			System.out.println("Empty List");
			return ;
		}

		while(temp != null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListL list=new LinkedListL();

		list.addEnd(1);
		list.addEnd(2);
		list.addEnd(3);
		list.addEnd(4);
		list.showlist();
		list.deleteX(3);
		list.showlist();
		list.deleteX(4);
		list.showlist();
		
		
		
		LinkedList l= new LinkedList();
		
	}

}
