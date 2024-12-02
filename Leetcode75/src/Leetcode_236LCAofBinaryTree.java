
public class Leetcode_236LCAofBinaryTree {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(5);
		root.left.left=new TreeNode(6);
		root.left.right=new TreeNode(2);
		root.left.right.left=new TreeNode(7);
		root.left.right.right=new TreeNode(4);
		
		root.right=new TreeNode(1);
		root.right.left=new TreeNode(0);
		root.right.right=new TreeNode(8);
		
		
		TreeNode lca=lowestCommonAncestor(root,root.left,root.right);
		
		System.out.println(lca.val);

	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);//5
        TreeNode right=lowestCommonAncestor(root.right,p,q);//1
        if(left==null)return right;
        else if(right==null)return left;
        else return root;
    }
}
