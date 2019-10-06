package week07;

public class LeetCode01 {
	public int[] twoSum(int[] nums, int target) {
	      int [] res={};
	        for (int i=0;i<nums.length;i++){
	          for(int j=i+1;j<nums.length;j++){
	            if(nums[j]== target-nums[i]){
	              return new int[] { i, j };
	            }
	          }
	        }
	     throw new IllegalArgumentException("No two sum solution");
	    }
}
