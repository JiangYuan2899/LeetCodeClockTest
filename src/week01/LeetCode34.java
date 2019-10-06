package week01;
/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *你的算法时间复杂度必须是 O(log n) 级别。
 *如果数组中不存在目标值，返回 [-1, -1]。
 * @author lenovo
 * Oct 6, 2019
 */
public class LeetCode34 {
	public int[] searchRange(int[] nums, int target) {
        int []targetRange={-1,-1};
        int leftindex=searchRangeLeft(nums, target);
        int rightindex=0;
        if (leftindex == nums.length || nums[leftindex] != target) {
            return targetRange;
        }
        for(int i=leftindex;i<nums.length;i++){
            if(target==nums[i]){
                rightindex=i;
            }
        }
        targetRange[0] = leftindex;
        targetRange[1] = rightindex;
        return targetRange;
    }
    public static int searchRangeLeft(int[] nums, int target) {
        int left=0;
        int right=nums.length;
            while(left<right ){
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left ;
        }
}
