package com.cmbchina.leetcode.lc0102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode(int val) {
         this.val = val;
     }

     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //BFS size取的是下一层的总数
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        while(queue.size() != 0){
            int len = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < len; i++){
                TreeNode t =queue.remove(); //removeFirst
                list.add(t.val);
                if(t.left != null) queue.add(t.left);
                if(t.right != null) queue.add(t.right);
            }
            res.add(list);
        }
        return res;
    }
}
