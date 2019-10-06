package week07;

import java.util.*;

public class LeetCode652 {
	List<TreeNode> res = new ArrayList<TreeNode>();
    Map<String,Integer> map = new HashMap<String,Integer>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if (root == null)
            return res;
        printNode(root);
        return res;
    }

    private String printNode(TreeNode node){
        if(node==null)return "#";

        String val = node.val+printNode(node.left)+printNode(node.right);
        if(map.get(val)==null){
            map.put(val, 1);
        }else if(map.get(val)==1){
            res.add(node);
            map.put(val, 2);
        }
        return val;

    }
}
