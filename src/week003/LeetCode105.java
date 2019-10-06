package week003;

public class LeetCode105 {

/**
 * LeetCode105题用前序遍历和中序遍历重建二叉树
 * 前序遍历：根节点-->左子树---->右子树
 * 中序遍历：左子树-->根节点---->右子树
 * 思路：前序遍历第一个节点是根节点，在中序遍历找到该节点，中序左边都是左子树，右边是右子树	
 * @param args
 */
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		//首先定义一颗树
		TreeNode root =new TreeNode(0);
		//根节点
		root.val = preorder[0];	
		int i=0;
		//去中序遍历查找根节点所在的位置
		for(i=0;i<inorder.length;i++){
			if(preorder[0]==inorder[i]){
				int rootIndex=i;
			}
		}
		//放入左子树
		TreeNode rootValues =new TreeNode(0);
		for(int j=1;j<preorder.length-i;j++){
			rootValues.setLeft(preorder[j] );
		}
		return null;
		        
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//人肉建树
//		TreeNode root = new TreeNode(1);
//		root.setLeft(new TreeNode(2));
//		root.setRight(new TreeNode(2));
//		root.getLeft().setLeft(new TreeNode(3));
//		root.getLeft().setRight(new TreeNode(4));
//		root.getRight().setLeft(new TreeNode(4));
//		root.getRight().setRight(new TreeNode(3));
		int[] preorder={3,9,20,15,7};
		int[] inorder={9,3,15,20,7};
		LeetCode105 test = new LeetCode105();
		System.out.println(test.buildTree(preorder, inorder));
	}
}
