package week01;
/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *你可以假设数组中不存在重复的元素。
 *你的算法时间复杂度必须是 O(log n) 级别。
 * @author lenovo
 * Oct 6, 2019
 */
public class LeetCode33 {
//	public int search(int[] nums, int target) {
//        int lo = 0;
//        int hi = nums.length - 1;
//
//        while (lo < hi) {
//            int mid = (lo + hi) / 2;
//            // 当[0,mid]有序时,向后规约条件
//            if (nums[0] <= nums[mid] && (target > nums[mid] || target < nums[0])) {
//                lo = mid + 1;
//                // 当[0,mid]发生旋转时，向后规约条件
//            } else if (target > nums[mid] && target < nums[0]) {
//                lo = mid + 1;
//            } else {
//                hi = mid;
//            }
//        }
//        return lo == hi && nums[lo] == target ? lo : -1;
//    }
	public static int search(int[] nums, int target) {
		if(nums.length==0){
		                return -1;
		            }
	    int left=0;
	    int right=nums.length-1;
	    int mid = 0;
	        while(left<=right){
	             mid=left+(right-left)/2;
	             if(target==nums[mid]){
	                 return mid;
	             }
	            if(nums[left]<=nums[mid]){
	                //前半部分
	                if(target>=nums[left]&&target<nums[mid]){
	                    right=mid-1;
	                }else{
	                    left=mid+1;
	                }
	            }else{
	                if(target<=nums[right]&&target>nums[mid]){
	                    left=mid+1;
	                }else{
	                    right=mid-1;
	                }
	           }
	        }
	        return -1;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=0;
		int [] arr={4,5,6,7,0,1,2};
		System.out.println(search(arr,  target));
	}
}
