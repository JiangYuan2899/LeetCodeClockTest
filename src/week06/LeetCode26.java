package week06;

import java.util.*;

//ʱ����ʱ100ms���е��������Ż�
public class LeetCode26 {
	//����ȥ�س��ȣ������޸�ԭ������ֵ
    public int removeDuplicates(int[] nums) {
        //����һ������  
        List list = new ArrayList();  
        int j=0;
        //�����������������Ԫ��  
        for(int i=0;i<nums.length;i++){  
            //�����������û����ͬ��Ԫ�ز������  
            if(!list.contains(nums[i])){
                list.add(nums[i]); 
                nums[j] = nums[i];
                j++;
            }  
        }  
        //toArray()�����᷵һ��������������Ԫ�ص�Object��������  
        Object[] newArr  = list.toArray();  
        return newArr.length ; 
    }
}
