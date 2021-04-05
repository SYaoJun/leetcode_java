package com.cmbchina.leetcode.lc0235;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val){
            TreeNode t = p;
            p = q;
            q = t;
        }
        if(root.val >= p.val && root.val <= q.val) return root;
        if(root.val >= q.val) return lowestCommonAncestor(root.left, p, q);
        else return lowestCommonAncestor(root.right, p, q);
    }
}
