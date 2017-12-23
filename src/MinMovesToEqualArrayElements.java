
public class MinMovesToEqualArrayElements {

	
	    public static int minMoves(int[] nums) {
	        int move=0;
	        while(true)
	        {
	            if(areallsame(nums))
	                return move;
	            
	            int maxindex=findMaxIndex(nums);
	            
	            increment(nums,maxindex);
	            move++;
	        }
	    
	    }
	    
	    public static boolean areallsame(int[] nums)
	    {
	        int first=nums[0];
	        
	        for(int i=1;i<nums.length;i++)
	        {
	            if(first !=nums[i])return false;
	            
	            first=nums[i];
	        }
	        return true;
	    }
	    
	    public static int findMaxIndex(int[]  nums)
	    {
	        int maxindex=-1;
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]>max)
	            {
	                maxindex=i;
	                max=nums[i];
	            }
	        }
	        return maxindex;
	    }

	    public static void increment(int[] nums,int maxindex)
	    {
	        for(int i=0;i<nums.length;i++)
	        {
	            if(i!=maxindex)
	            {
	                nums[i]++;
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  nums = {1,2147483647};
		System.out.println(minMoves(nums));
		
	}

}
