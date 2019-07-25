package Week03;

import java.util.ArrayList;
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
	 * The root node's value is 5 but its right child's value is 4.
	 *
	 * Definition for a binary tree node.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public boolean isValidBST(TreeNode root) {
			double inorder = -Double.MAX_VALUE;
			Stack<TreeNode> stack = new Stack();
			// 判断是否为空
			if (root == null) {
				return true;
			}
			if (isValidBST(root.left)) {
				if (inorder < root.val) {
					return true;
				}
			}
			if (isValidBST(root.right)) {
				if (inorder > root.val) {
					return true;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("isValidBST");
	}

}
