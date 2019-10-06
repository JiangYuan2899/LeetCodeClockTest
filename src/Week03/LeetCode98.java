package week03;

import java.util.Stack;


/**
 * 打卡活动，每周10道LeetCode算法题第98题 打卡地址：www.acwing.com
 * 
 * @author lenovo Jul 24, 2019
 */
public class LeetCode98 {
	/**
	 * 98. Validate Binary Search Tree Given a binary tree, determine if it is a
	 * valid binary search tree (BST). Assume a BST is defined as follows: The
	 * left subtree of a node contains only nodes with keys less than the node's
	 * key. The right subtree of a node contains only nodes with keys greater
	 * than the node's key. Both the left and right subtrees must also be binary
	 * search trees. Example 1: 2 / \ 1 3 Input: [2,1,3] Output: true Example 2:
	 * 5 / \ 1 4 / \ 3 6 Input: [5,1,4,null,null,3,6] Output: false Explanation:
	 * The root node's value is 5 but its right child's value is 4. 验证二叉树
	 * Definition for a binary tree node.
	 */
	// public static class TreeNode {
	// int val;
	// TreeNode left;
	// TreeNode right;
	//
	// TreeNode(int x) {
	// val = x;
	// }
	// }
	public boolean isValidBST(TreeNode root) {
		// double inorder = -Double.MAX_VALUE;
		// // 判断是否为空
		// if (root == null) {
		// return true;
		// }
		// if (isValidBST(root.left)) {
		// if (inorder < root.val) {
		// inorder=root.val;
		// return isValidBST(root.right);
		// }
		// }
		// return false;
		Stack<TreeNode> stack = new Stack();
		TreeNode p = root;
		TreeNode pre = null;
		while (p != null || !stack.isEmpty()) {
			while (p != null) {
				stack.push(p);
				p = p.left;
			}
			p = stack.pop();
			if (pre != null && pre.val >= p.val) {
				return false;
			}
			pre = p;
			p = p.right;
//			return false;
		}
		return true;
	}

	public static void main(String[] str) {
		TreeNode root = new TreeNode(5);
		root.setLeft(new TreeNode(1));
		root.setRight(new TreeNode(4));
		root.getRight().setLeft(new TreeNode(3));
		root.getRight().setRight(new TreeNode(6));

		LeetCode98 test = new LeetCode98();
		Boolean b = test.isValidBST(root);
		System.out.println(b);
	}
}