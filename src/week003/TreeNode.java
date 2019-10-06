package week003;
/**
 * ÑùÀýÊ÷
 * @author lenovo
 * Jul 24, 2019
 */
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(int preorder) {
		this.left = preorder;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}