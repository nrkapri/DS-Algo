  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class ConstructBinaryTreeFromInorderandPostOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root=null;
        buildTreeRec(root,inorder,postorder,0,inorder.length-1, 0,postorder.length-1);
        return root;
    }
    
    public void buildTreeRec(TreeNode root,int[] inorder,int[] postorder,int is,int ie, int ps,int pe)
    {
        int midindex = findmidindexinInorder(inorder,postorder,is,ie,ps,pe);
        root=new TreeNode(inorder[midindex]);
        
        int lendindexinp = findlendindexin(inorder[midindex-1],postorder,ps,pe);
        buildTreeRec(root.left,inorder,postorder,is,midindex-1,ps, lendindexinp); 
        buildTreeRec(root.right,inorder,postorder,midindex-1,ie, lendindexinp+1,pe);
    }
    
    
    int findlendindexin(int llast,int[] postorder,int ps,int pe)
    {
        for(int i=ps;i<pe;i++)
        {
            if(postorder[i]==llast)
                return i;
        }
        return -1;
    }
    
    int findmidindexinInorder(int[] inorder, int[]  postorder, int is , int ie, int ps,int pe)
    {
        for(int i=is;i<ie;i++)
        {
            if(inorder[i]==postorder[pe])
                return i;
        }
        
        return -1;
    }
    
    
    public static void main(String[]  args)
    {
    	
    }
}