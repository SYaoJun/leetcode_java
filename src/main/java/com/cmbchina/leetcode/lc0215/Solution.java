package com.cmbchina.leetcode.lc0215;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*快排的思路 从小到大排序后的第k大，也就是从左往右的第n-k+1个数*/
        int n = nums.length;
        int u = n-k+1;
        return quick_sort(nums, 0, n-1, u);
    }
    int quick_sort(int[] nums, int l, int r, int u){
        if(l == r) return nums[l];
        int x = nums[l+r>>1];
        int i = l-1, j = r+1;
        while(i < j){
            while(nums[++i] < x);
            while(nums[--j] > x);
            if(i < j){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        int left = j - l + 1;
        if(left >= u) return quick_sort(nums, l, j, u);
        else return quick_sort(nums, j+1, r, u-left);
    }
}