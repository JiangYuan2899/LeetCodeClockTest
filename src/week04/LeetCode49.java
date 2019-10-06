package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode49 {
	 public List<List<String>> groupAnagrams(String[] strs) {
		    HashMap<String, List<String>> hash = new HashMap<>();
		    for (int i = 0; i < strs.length; i++) {
		        char[] s_arr = strs[i].toCharArray();
		        //����
		        Arrays.sort(s_arr);
		        //ӳ�䵽 key
		        String key = String.valueOf(s_arr); 
		        //��ӵ���Ӧ������
		        if (hash.containsKey(key)) {
		            hash.get(key).add(strs[i]);
		        } else {
		            List<String> temp = new ArrayList<String>();
		            temp.add(strs[i]);
		            hash.put(key, temp);
		        }

		    }
		    return new ArrayList<List<String>>(hash.values()); 
		}
}
