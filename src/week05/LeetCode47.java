package week05;
import java.util.*;
public class LeetCode47 {
	List<List<Integer>>list;
    int []nums;
    public List<List<Integer>> permuteUnique(int[] nums) {
        this.nums=nums;
        list=new ArrayList<>();
        //�мǱ���Ҫ�����򰡣���������������ֻ�����ڵĲſ�����ȣ��ſ����ж�ȥ������������
        Arrays.sort(nums);
        List<Integer>ll=new ArrayList<>();
        boolean []flag=new boolean[nums.length];
        dfs(ll,flag,0);
        return list;
    }
    public void dfs(List<Integer>ll,boolean[]flag,int length){
        if(length==nums.length)
        {
            list.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            //���λ���ù���
            if(flag[i])
                continue;
            //i-1��i��ֵ��ȣ���i-1û���ù���֮����ܻᱻ�þͲ����ظ���flag��i-1��=false��ȡ��ȵ���������ߵ��Ǹ�����ll�ĵ�һ��������flag��i-1��=true����ȡ��ȵ��������ұߵ��Ǹ�����ll�ĵ�һ������Ҳ����˵�ֱ�ȡ��һ�к͵ڶ��С�
            if(i>0&&nums[i-1]==nums[i]&&flag[i-1]==false)
            {
                continue;
            }
            ll.add(nums[i]);
            flag[i]=true;
            dfs(ll,flag,length+1);
            ll.remove(ll.size()-1);
            flag[i]=false;
        }
    }
}
