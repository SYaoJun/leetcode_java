package com.cmbchina.leetcode.offer;

import java.util.*;


public class Solution {
    public int cutRope(int target) {
        /*最多出现两个2*/
        if(target <= 3) return target-1;
        int ans = 1;
        if(target%3==1) {
            ans *= 4;
            target-=4;
        }
        if(target%3==2){
            ans*=2;
            target-=2;
        }
        while(target != 0){
            ans *=3;
            target -=3;
        }
        return ans;
    }
}