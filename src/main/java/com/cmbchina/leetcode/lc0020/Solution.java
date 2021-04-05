package com.cmbchina.leetcode.lc0020;

import java.util.HashMap;
import java.util.LinkedList;

class Solution {
    private static final HashMap<Character, Character> map = new HashMap(){{
        put('[',']');
        put('{','}');
        put('(',')');
        put('?','?');

    }};
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList(){{add('?');}};

        for(Character c: s.toCharArray()){
           if(map.containsKey(c)) stack.addLast(c);
           else if(map.get(stack.removeLast()) != c) return false;
       }
        return stack.size()==1;
    }
}