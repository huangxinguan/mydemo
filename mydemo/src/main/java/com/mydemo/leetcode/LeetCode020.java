package com.mydemo.leetcode;

public class LeetCode020 {
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2)
	{
		if(root1 == null) {
			return root2;
		}
		if(root2 == null) {
			return root1;
		}
		dfs(root1, root2);
		return root2;
	}
	
	public void dfs(TreeNode root1, TreeNode root2) {
		
		root2.val += root1.val;
		if(null != root1.left && null != root2.left) {
			dfs(root1.left, root2.left);
		}else if(null == root1.left){
//			return;
		}else {
			root2.left = root1.left;
//			return;
		}
		
		if(null != root1.right && null != root2.right) {
			dfs(root1.right, root2.right);
		}else if(null == root1.right){
//			return;
		}else {
			root2.right = root1.right;
//			return;
		}
		
		
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
