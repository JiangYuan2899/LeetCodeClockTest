package week003;

public class LeetCode105 {

/**
 * LeetCode105����ǰ���������������ؽ�������
 * ǰ����������ڵ�-->������---->������
 * ���������������-->���ڵ�---->������
 * ˼·��ǰ�������һ���ڵ��Ǹ��ڵ㣬����������ҵ��ýڵ㣬������߶������������ұ���������	
 * @param args
 */
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		//���ȶ���һ����
		TreeNode root =new TreeNode(0);
		//���ڵ�
		root.val = preorder[0];	
		int i=0;
		//ȥ����������Ҹ��ڵ����ڵ�λ��
		for(i=0;i<inorder.length;i++){
			if(preorder[0]==inorder[i]){
				int rootIndex=i;
			}
		}
		//����������
		TreeNode rootValues =new TreeNode(0);
		for(int j=1;j<preorder.length-i;j++){
			rootValues.setLeft(preorder[j] );
		}
		return null;
		        
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���⽨��
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
