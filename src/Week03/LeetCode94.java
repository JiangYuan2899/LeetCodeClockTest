package Week03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {

	private static final TreeNode TreeNode = null;

	/**
	 * 中序遍历二叉树，请使用非递归 如果用递归方法做，我们在处理理每个节点时，要按照 左子树 =>根节点 =>右子树的顺序进
	 * 进阶:递归算法很简单，是否可以使用迭代算法。
	 */
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list =new ArrayList<>();
		Stack<TreeNode> stack =new Stack();
		while(root!=null||!stack.isEmpty()){
			if(root!=null){
				stack.push(root);
				root=root.left;
			}else{
				root=stack.pop();
				list.add(root.val);
				root=root.right;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(inorderTraversal(TreeNode));
	}
}
