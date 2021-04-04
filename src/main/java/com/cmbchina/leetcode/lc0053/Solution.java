package com.cmbchina.leetcode.lc0053;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum = sum > 0? sum + nums[i] : nums[i];
            res  = Math.max(res, sum);
        }
        return res;
    }
}
