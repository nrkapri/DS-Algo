package javaProj.ds;

public class BST {
	
	Node root;
	class Node
	{
		int data ;
		Node left;
		Node right;
	
		Node(int x)
		{
			data=x;
			left=null;
			right=null;
		}
	}

	
	BST()
	{
		root =null;
	}
	
	void push (int data)
	{
		if (root ==null )
		{
			root = new Node(data);
			return;
		}
		
		Node temp=root;
		while(true)
		{
			System.out.println("data is :"+data);
			
			if (temp==null)
			{
				temp=new Node(data);
				inOrder();
				return;
			}
			
			System.out.println(":"+temp.data);
			
			
			if(data<=temp.data)
			{
				System.out.println("left");
				if (temp.left==null)
				{
					temp.left=new Node(data);
					inOrder();
					return;
				}
				temp=temp.left;
				
			}
			else
			{
				System.out.println("right");
				if (temp.right==null)
				{
					temp.right=new Node(data);
					inOrder();
					return;
				}

				temp=temp.right;
				
			}
		}
		
	}

	
	void inOrderUtil(Node temp)
	{
		if(temp==null) return ;
		inOrderUtil(temp.left);
		System.out.print("x: "+temp.data);
		inOrderUtil(temp.right);
	}
	
	void inOrder()
	{
		inOrderUtil(root);
		System.out.println("");
	}
	
	public static void main(String[] args) {

BST tr=new BST();
tr.push(9);

tr.push(3);
tr.push(2);
tr.push(5);
tr.push(4);


tr.inOrder();

	}

}
