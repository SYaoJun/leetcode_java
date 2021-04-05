package com.cmbchina.leetcode.lc0121;

class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            res = Math.max(res, prices[i]- minValue);
            minValue = Math.min(minValue, prices[i]);
        }
        return res;
    }
}
