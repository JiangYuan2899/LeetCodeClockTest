package Week03;

public class BinaryTreePreorder {
	//当建立好二叉树类后可以创建二叉树实例，并实现二叉树的先根遍历，中根遍历，后根遍历，代码如下：
		 public static void preOrder(BinaryTree root){  //先根遍历
		  if(root!=null){
		   System.out.print(root.data+"-");
		   preOrder(root.left);
		   preOrder(root.right);
		  }
		 }
		 public static void inOrder(BinaryTree root){     //中根遍历
		  if(root!=null){
		   inOrder(root.left);
		   System.out.print(root.data+"--");
		   inOrder(root.right);
		  }
		 }		 
		 public static void postOrder(BinaryTree root){    //后根遍历
		  if(root!=null){
		   postOrder(root.left);
		   postOrder(root.right);
		   System.out.print(root.data+"---");
		  }
		 }
		 public static void main(String[] str){
//		  int[] array = {12,76,35,22,16,48,90,46,9,40};
//		  BinaryTree root = new BinaryTree(array[0]);   //创建二叉树
//		  TreeNode root = new TreeNode(array[0]);
//		  for(int i=1;i<array.length;i++){
//		   root.insert(root, array[i]);       //向二叉树中插入数据
//		  }
//		  System.out.println("先根遍历：");
//		  preOrder(root);
//		  System.out.println();
//		  System.out.println("中根遍历：");
//		  inOrder(root);
//		  System.out.println();
//		  System.out.println("后根遍历：");
//		  postOrder(root);
		  TreeNode root =new TreeNode('5');
		  root.setLeft(new TreeNode('1'));
		  root.setRight(new TreeNode('4'));
		  root.getLeft().setLeft(new TreeNode('3'));
	      root.getRight().setRight(new TreeNode('6'));
		  
		  LeetCode98 test =new LeetCode98();
		  Boolean b=test.isValidBST(root);
		  System.out.println(b);
		 }
}
