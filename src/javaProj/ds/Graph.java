package javaProj.ds;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	int V;
	ArrayList <Integer> adj[];	 
	
	Graph(int v)
	{
		V=v;
		adj=new ArrayList[v];
		for(int i=0;i<V ;i++)
		{
			adj[i]=new ArrayList<Integer>();
			
		}
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	
	
	
	void BFS (int s)
	{
		boolean visited[]= new boolean[V];
		
		LinkedList<Integer> queue=new LinkedList<Integer>();
		
		visited[s]=true;
		
		queue.add(s);
		
		while(!queue.isEmpty())
		{
			int x=queue.pop();
			
			System.out.println(" "+x);
			
			for(int a:adj[x])
			{
				if(!visited[a])
				{
					visited[a]=true;
					queue.add(a);
				}
			}
			
//			Iterator<Integer> i =adj[x].listIterator();
//			while (i.hasNext())
//			{
//				int n=i.next();
//				if(!visited[n])
//				{
//					visited[n]=true;
//					queue.add(n);
//				}
//			}
		}
	}
	
	
	void DFS(int s)
	{
	
		boolean visited[]=new boolean[V];
		
		LinkedList<Integer>stack=new LinkedList<Integer>();
		
		stack.add(s);
		
		while(!stack.isEmpty())
		{
			int x=stack.pop();
			
			System.out.print (" "+x );
			visited[x]=true;
			
			Iterator<Integer> i=adj[x].listIterator();
			
			while(i.hasNext())
			{
				int n=i.next();
				if(!visited[n])
				{
					visited[n]=true;
					stack.push(n);
				}	
			}
			
		}
	}
	
	public static void main(String[] args) {

		 Graph g = new Graph(4);

	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        
	        
	        for(int i=0;i<g.V;i++)
	        {
	        	g.adj[i].sort(new Comparator<Integer>()
	        			{
	        		@Override
                    public int compare(Integer a, Integer b) {
	        			if(a==b)
	        				return 0;
	        			if (a>b)
	        				return -1;
	        			else return 1;
	        		}

	        			});
	        }
	        
	        g.BFS(2);
	        
	        g.DFS(2);
	}

}
