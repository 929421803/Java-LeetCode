package com.wanghy.test.demo;

/**
 * @Author ：WangHY
 * @date ：Created in 15:26 2019/4/23
 * @Description：
 */
public class GongGongZuXian {

    class TreeNode {
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


}
