package javaProj.leetcode;

public class SortedArraytoBST {

	

	 // Definition for a binary tree node.
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	  TreeNode sortedArrayToBSTUtil(int[] nums, int i , int j) 
	 {
		 if(i>j) return null;
		 int m=(i+j)/2;
		 
		 TreeNode root=new TreeNode(nums[m]);
		 root.left=sortedArrayToBSTUtil(nums,i,m-1);
		 root.right=sortedArrayToBSTUtil(nums,m+1,j);
		 
		 return root;
	 }
	 public   TreeNode sortedArrayToBST(int[] nums) {
			return sortedArrayToBSTUtil(nums,0,nums.length-1);
	    }
	 
	 public void inOrder(TreeNode node)
	 {
		 if(node ==null ) return;
		 
		 inOrder(node.left);
		 System.out.println(node.val);
		 inOrder(node.right);
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		SortedArraytoBST sb= new SortedArraytoBST();
		TreeNode t= sb.sortedArrayToBST(arr);
		sb.inOrder(t);
		
	}

}
