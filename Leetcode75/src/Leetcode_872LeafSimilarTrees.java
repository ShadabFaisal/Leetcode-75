import java.util.ArrayList;
import java.util.List;

public class Leetcode_872LeafSimilarTrees {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(5);
		root.left.left=new TreeNode(6);
		root.left.right=new TreeNode(2);
		root.left.right.left=new TreeNode(7);
		root.left.right.right=new TreeNode(4);
		root.right=new TreeNode(1);
		root.right.left=new TreeNode(9);
		root.right.right=new TreeNode(8);
		
		
		TreeNode root2=new TreeNode(3);
		root2.left=new TreeNode(5);
		root2.left.left=new TreeNode(6);
		root2.left.right=new TreeNode(2);
		root2.left.right.left=new TreeNode(7);
		root2.left.right.right=new TreeNode(4);
		root2.right=new TreeNode(1);
		root2.right.left=new TreeNode(9);
		root2.right.right=new TreeNode(8);
		
		System.out.println(leafSimilar(root,root2));
		

	}
	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        helper(list1,root1);
        helper(list2,root2);
        return list1.equals(list2);
    }
    public static void helper(List<Integer> res, TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            res.add(root.val);
            return;
        }
        helper(res,root.left);
        helper(res,root.right);
    }

}
