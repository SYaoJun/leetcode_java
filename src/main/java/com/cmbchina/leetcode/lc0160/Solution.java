package com.cmbchina.leetcode.lc0160;


import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while(headA != headB){
            if(headA != null) headA = headA.next;
            else headA = p;

            if(headB != null) headB = headB.next;
            else headB = q;
        }
        return headA;
    }
}
