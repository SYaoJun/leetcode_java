package com.cmbchina.leetcode.lc0103;

import org.springframework.data.relational.core.sql.In;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val,TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean flag = true;
        List<List<Integer>> lists = new ArrayList<>();
        if(root==null) return lists;
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(queue.size() > 0){
            int len = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < len; i++){
                TreeNode t = queue.remove();
                list.add(t.val);
                if(t.left != null) queue.add(t.left);
                if(t.right != null) queue.add(t.right);
            }
            if(!flag){
                Collections.reverse(list);
            }
            flag = !flag;
            lists.add(list);
        }
        return lists;
    }
}
