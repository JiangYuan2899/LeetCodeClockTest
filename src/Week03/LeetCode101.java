package Week03;

import java.util.Stack;


/**
 * 判断是否是镜像二叉树
 * 题解1群主yxc给出思路：栈模拟递归，左子树采用中序遍历，右子树采用反中序遍历，当且仅当同时遍历2棵子树对应节点的值相等时为镜像二叉树。
 * 题解2：LeetCode灵魂画师牧码，画解算法提供解题思路：
 * 递归结束条件：1.都为空指针则返回true；2.只有一个为空则返回false
 * 递归过程：判断两个指针当前节点是否相等；判断A的右子树与B的左子树是否相等，判断A的左子树与B的右子树是否相等
 * 下面代码采用题解2
 */
public class LeetCode101 {
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root,root);
	}
	 public  boolean isMirror(TreeNode root1,TreeNode  root2){
		if(root1==null&&root2==null){
			return true;
		}
		if(root1==null||root2==null){
			return false;
		}		
		return (root1.val==root2.val)
	    &&isMirror(root1.getLeft(), root2.getRight())
	    &&isMirror(root1.getRight(), root2.getLeft());
	 }
	 public static void main(String[] str) {
			TreeNode root = new TreeNode(1);
			root.setLeft(new TreeNode(2));
			root.setRight(new TreeNode(2));
			root.getLeft().setLeft(new TreeNode(3));
			root.getLeft().setRight(new TreeNode(4));
			root.getRight().setLeft(new TreeNode(4));
			root.getRight().setRight(new TreeNode(3));

			LeetCode101 test = new LeetCode101();
			Boolean b = test.isSymmetric(root);
			System.out.println(b);
		}
}
