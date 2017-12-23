package javaProj.ds;

public class Trie {
	static final int ALPHABETSIZE =26;
	TrieNode head=null;

	class  TrieNode {
		TrieNode children[];
		boolean isLeaf;


		TrieNode()
		{
			children=new TrieNode[ALPHABETSIZE];
			for(int i=0;i<ALPHABETSIZE;i++)
			{
				children[i]=null;
			}
			isLeaf=false;
		}
	};

	void insert(String s)
	{
		if (s==null ||  s.isEmpty()) return;
		
		if(head==null)
		{
			head=new TrieNode();
		}
		TrieNode current=head;
		for(int i=0;i<s.length();i++)
		{
			if(current.children[s.charAt(i)]==null)
			{
				TrieNode temp= new TrieNode();
				current.children[s.charAt(i)]=temp;
				current=temp;
			}
			else
			{
				current=current.children[s.charAt(i)];
			}
		}
		current.isLeaf=true;
		
	}

	boolean search(String s)
	{
		return false;
	}

	public static void main(String[] args) {

		Trie t=new Trie();
		t.insert("the");
		t.insert("their");
		t.insert("there");
		t.insert("any");
		t.insert("answer");
		t.insert("bye");
	}

}
