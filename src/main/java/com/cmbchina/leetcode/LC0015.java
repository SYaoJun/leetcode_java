package com.cmbchina.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC0015 {
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*先排序 枚举一个数 另外两个数用双指针 去重*/
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int j = i+1, k = n-1;
            while(j < k){
                int sum = nums[j] + nums[k] + nums[i];
                if( sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    int t = nums[j];
                    while(j < k && nums[j]==t) j++;
                    t = nums[k];
                    while(j < k && nums[k]==t) k--;
                }
            }
        }
        return res;
    }
}
