package week05;

import java.util.*;

public class LeetCode90 {
	  //����
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	    List<List<Integer>> ans = new ArrayList<>();
	    ans.add(new ArrayList<>());// ��ʼ��������
	    Arrays.sort(nums);
	    int start = 1; //�����½�Ŀ�ʼλ��
	    for (int i = 0; i < nums.length; i++) {
	        List<List<Integer>> ans_tmp = new ArrayList<>();
	        // ����֮ǰ�����н��
	        for (int j = 0; j < ans.size(); j++) {
	            List<Integer> list = ans.get(j);
	            //��������ظ����֣����������оɽ�
	            if (i > 0 && nums[i] == nums[i - 1] && j < start) {
	                continue;
	            }
	            List<Integer> tmp = new ArrayList<>(list);
	            tmp.add(nums[i]); // ������������
	            ans_tmp.add(tmp);
	        }

	        start = ans.size(); //�����½�Ŀ�ʼλ��
	        ans.addAll(ans_tmp);
	    }
	    return ans;
	}
}
