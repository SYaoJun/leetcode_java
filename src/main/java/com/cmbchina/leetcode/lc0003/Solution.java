package com.cmbchina.leetcode.lc0003;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] hash = new int[256];
        int res = 0;
        for(int i = 0, j = 0; i < s.length(); i++){
            hash[s.charAt(i)]++;
            while(hash[s.charAt(i)] > 1){
                hash[s.charAt(j++)]--;
            }
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}
