
public class Leetcode_437PathSumIII {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);

		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);

		root.left.right.right = new TreeNode(1);

		root.right.right = new TreeNode(11);

		System.out.println(pathSum(root, 8));

	}

	public static int pathSum(TreeNode root, int targetSum) {

		int count = 0;
		if (root == null)
			return 0;
		count += helper(root, targetSum, 0);
		count += pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
		return count;

	}

	private static int helper(TreeNode root, int targetSum, long curSum) {
		int count = 0;
		if (root == null)
			return 0;
		curSum += root.val;
		if (curSum == targetSum)
			count++;
		count += helper(root.left, targetSum, curSum);
		count += helper(root.right, targetSum, curSum);
		return count;
	}

}
