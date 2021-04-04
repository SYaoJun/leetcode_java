package com.cmbchina.leetcode.lc0912;

class Solution {
    public int[] sortArray(int[] nums) {
        quick_sort(nums, 0, nums.length-1);
        return nums;
    }
    void quick_sort(int[] nums, int l, int r){
        if(l > r) return;
        int x = nums[l + r >> 1];
        int i = l-1, j = r+1;
        while(i < j){
            while(nums[++i] < x);
            while(nums[--j] > x);
            if(i < j){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j]  = t;
            }
        }
        quick_sort(nums, l, j);
        quick_sort(nums, j+1, r);
    }
}