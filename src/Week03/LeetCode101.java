package Week03;

import java.util.Stack;


/**
 * �ж��Ƿ��Ǿ��������
 * ���1Ⱥ��yxc����˼·��ջģ��ݹ飬����������������������������÷�������������ҽ���ͬʱ����2��������Ӧ�ڵ��ֵ���ʱΪ�����������
 * ���2��LeetCode��껭ʦ���룬�����㷨�ṩ����˼·��
 * �ݹ����������1.��Ϊ��ָ���򷵻�true��2.ֻ��һ��Ϊ���򷵻�false
 * �ݹ���̣��ж�����ָ�뵱ǰ�ڵ��Ƿ���ȣ��ж�A����������B���������Ƿ���ȣ��ж�A����������B���������Ƿ����
 * �������������2
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
