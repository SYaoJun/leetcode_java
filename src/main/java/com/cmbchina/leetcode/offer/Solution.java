package com.cmbchina.leetcode.offer;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param matrix char字符型二维数组
     * @param word string字符串
     * @return bool布尔型
     */
    public boolean hasPath (char[][] matrix, String word) {
        // write code here
        if(matrix.length==0) return false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(dfs(matrix, word, 0, i, j)) return true;
            }
        }
        return false;
    }
    int [] dx ={1,-1,0,0};
    int [] dy ={0,0,1,-1};
    boolean dfs(char[][] matrix, String word, int u, int x, int y){
        if(x < 0 || x >= matrix.length || y < 0 || y >= matrix[x].length) return false;
        if(matrix[x][y] != word.charAt(u)) return false;
        if(u == word.length()-1) return true;
        char c = matrix[x][y];
        matrix[x][y]='*';
        for(int i = 0; i < 4; i++){
            if(dfs(matrix, word, u+1,dx[i]+x, dy[i]+y)) {
                return true;
            }
        }
        matrix[x][y] = c;
        return false;
    }
}