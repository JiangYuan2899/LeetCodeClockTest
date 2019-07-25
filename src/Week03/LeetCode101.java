package Week03;

import java.util.Stack;

import Week03.LeetCode98.TreeNode;

/**
 * ÅÐ¶ÏÊÇ·ñÊÇ¾µÏñ¶þ²æÊ÷
 * @author lenovo
 * Jul 25, 2019
 */
public class LeetCode101 {
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root,root);
	}
	 public  boolean isMirror(TreeNode root1,TreeNode  root2){
		if(root1==null||root2==null){
			return false;
		}
		if(root1==null&&root2==null){
			return true;
		}
		if(root1.left==root2.right||root1.right==root2.left){
			return true;
		}else{
			 return false;
		}
	}
}
