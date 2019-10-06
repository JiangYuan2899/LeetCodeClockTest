package week06;

import java.util.*;

//时间用时100ms，有点慢后期优化
public class LeetCode26 {
	//返回去重长度，并且修改原数组数值
    public int removeDuplicates(int[] nums) {
        //创建一个集合  
        List list = new ArrayList();  
        int j=0;
        //遍历数组往集合里存元素  
        for(int i=0;i<nums.length;i++){  
            //如果集合里面没有相同的元素才往里存  
            if(!list.contains(nums[i])){
                list.add(nums[i]); 
                nums[j] = nums[i];
                j++;
            }  
        }  
        //toArray()方法会返一个包含集合所有元素的Object类型数组  
        Object[] newArr  = list.toArray();  
        return newArr.length ; 
    }
}
