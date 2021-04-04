package com.cmbchina.leetcode.lc0415;

import java.util.Collections;

class Solution {
    public String addStrings(String num1, String num2) {
        int c = 0;
        int i = 0, j = 0;
        num1 = new StringBuilder(num1).reverse().toString();
        num2  = new StringBuilder(num2).reverse().toString();
        StringBuilder sb = new StringBuilder();
        while(i < num1.length() || j < num2.length()){
            int a = i < num1.length() ? num1.charAt(i) - '0': 0;
            int b = j < num2.length() ? num2.charAt(j) - '0': 0;
            c += a + b;
            sb.append(c % 10);
            c /= 10;
            if(i < num1.length()) ++i;
            if(j < num2.length()) ++j;
        }
        if(c != 0) sb.append(c);
        sb.reverse();
        return sb.toString();
    }
}
