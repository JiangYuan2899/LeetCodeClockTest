package Week03;
/**
 * ÊÖ¶¯±éÀúÊ÷
 * @author lenovo
 * Jul 25, 2019
 */
public class TreeCreator {
	public TreeNode createSampleTree(){
		TreeNode root =new TreeNode('A');
		root.setLeft(new TreeNode('B'));
		root.getLeft().setLeft(new TreeNode('D'));
		root.getLeft().setRight(new TreeNode('E'));
		root.getLeft().getRight().setRight(new TreeNode('G'));
		root.setRight(new TreeNode('C'));
		root.getRight().setRight(new TreeNode('F'));
		return root;
	}
}
