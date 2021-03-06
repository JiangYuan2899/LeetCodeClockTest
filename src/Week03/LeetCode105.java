package week03;

import java.util.HashMap;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LeetCode105 {
	int pre_index=0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        // build a hashmap value -> its index
        int idx = 0;
        for (Integer val : inorder){
          idx_map.put(val, idx++);
        }
        return helper(0, inorder.length);
    }
    public TreeNode helper(int in_left,int in_right){
        if(in_left==in_right){
            return null;
        }
        int root_val = preorder[pre_index];
        TreeNode root = new TreeNode(root_val);
        int index = idx_map.get(root_val);
        pre_index++;
        root.left = helper(in_left, index);
        root.right = helper(index + 1, in_right);
        return root;
    }
}
