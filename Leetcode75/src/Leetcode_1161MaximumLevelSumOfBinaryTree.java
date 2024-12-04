import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_1161MaximumLevelSumOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(7);
		root.right = new TreeNode(0);

		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(-8);

		System.out.println(maxLevelSum(root));

	}
	
	public static int maxLevelSum(TreeNode root) {

        if(root==null)return 0;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        int ans=1;
        int maxVal=Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int n=q.size();
            int sum=0;
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;

                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
           
           if(sum>maxVal){
                maxVal=sum;
                ans=level;
            }
           level++;
        }
        return ans;
    }

}
