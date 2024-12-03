
public class Leetcode_1372LongestZigzagPathinBinaryTree {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(1);
		root.right=new TreeNode(1);
		
		root.left.right=new TreeNode(1);
		root.left.right.left=new TreeNode(1);
		root.left.right.right=new TreeNode(1);
		
		root.left.right.left.right=new TreeNode(1);
		
		System.out.println(longestZigZag(root));

	}
	
	private static int maxZigZag=0;
    public static int longestZigZag(TreeNode root) {
        if(root==null)return 0;

        traverse(root.left,true,1);
        traverse(root.right,false,1);
        return maxZigZag;
    }

    private static void traverse(TreeNode node, boolean isLeft,int length){
        if(node==null)return;
        maxZigZag=Math.max(maxZigZag,length);

        if(isLeft){
            traverse(node.right,false, length+1);
            traverse(node.left,true, 1);
        }else{
            traverse(node.left,true,length+1);
            traverse(node.right,false,1);
        }

    }

}
