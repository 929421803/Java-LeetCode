package com.wanghy.test.demo;

/**
 * @Author ：WangHY
 * @date ：Created in 15:26 2019/4/23
 * @Description：
 */
public class GongGongZuXian {

	static class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// LCA 问题，查阅相关资料
		if (root == null) {
			return root;
		}
		if (root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null) {
			return root;
		} else if (left != null) {
			return left;
		} else if (right != null) {
			return right;
		}
		return null;
	}


	public TreeNode getGGZX(TreeNode root, TreeNode left, TreeNode right) {
		if (root == null) {
			return root;
		}
		if (root == left || root == right) {
			return root;
		}
		TreeNode l = getGGZX(root.left, left, right);
		TreeNode r = getGGZX(root.right, left, right);

		if (l != null && r != null) {
			return root;
		} else if (l != null) {
			return l;
		} else if (r != null) {
			return r;
		}
		return null;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		GongGongZuXian zuXian = new GongGongZuXian();
		zuXian.getGGZX(node1, node3, node4);
	}


}
