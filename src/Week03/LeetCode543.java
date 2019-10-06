package week03;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LeetCode543 {
	private int deepestPath = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return deepestPath;
    }
    public int deep(TreeNode node){
        if(node==null){
            return 0;
        }

        int left=deep(node.left);
        int right=deep(node.right);
        deepestPath=Math.max(deepestPath,left+right);
        return Math.max(left,right)+1;
    }
}
