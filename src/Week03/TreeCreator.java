package Week03;
/**
 * ÊÖ¶¯±éÀúÊ÷
 * @author lenovo
 * Jul 25, 2019
 */
public class TreeCreator {
	public TreeNode createSampleTree(){
		TreeNode root =new TreeNode('5');
		root.setLeft(new TreeNode('1'));
//		root.getLeft().setLeft(new TreeNode('D'));
//		root.getLeft().setRight(new TreeNode('E'));
//		root.getLeft().getRight().setRight(new TreeNode('G'));
		root.setRight(new TreeNode('4'));
		root.getLeft().setLeft(new TreeNode('3'));
		root.getRight().setRight(new TreeNode('6'));
		return root;
	}
}
