package Week03;

public class BinaryTreePreorder {
	//�������ö����������Դ���������ʵ������ʵ�ֶ��������ȸ��������и�����������������������£�
		 public static void preOrder(BinaryTree root){  //�ȸ�����
		  if(root!=null){
		   System.out.print(root.data+"-");
		   preOrder(root.left);
		   preOrder(root.right);
		  }
		 }
		 public static void inOrder(BinaryTree root){     //�и�����
		  if(root!=null){
		   inOrder(root.left);
		   System.out.print(root.data+"--");
		   inOrder(root.right);
		  }
		 }		 
		 public static void postOrder(BinaryTree root){    //�������
		  if(root!=null){
		   postOrder(root.left);
		   postOrder(root.right);
		   System.out.print(root.data+"---");
		  }
		 }
		 public static void main(String[] str){
//		  int[] array = {12,76,35,22,16,48,90,46,9,40};
//		  BinaryTree root = new BinaryTree(array[0]);   //����������
//		  TreeNode root = new TreeNode(array[0]);
//		  for(int i=1;i<array.length;i++){
//		   root.insert(root, array[i]);       //��������в�������
//		  }
//		  System.out.println("�ȸ�������");
//		  preOrder(root);
//		  System.out.println();
//		  System.out.println("�и�������");
//		  inOrder(root);
//		  System.out.println();
//		  System.out.println("���������");
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
