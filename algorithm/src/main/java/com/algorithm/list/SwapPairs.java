package com.algorithm.list;

import com.algorithm.define.ListNode;
import com.algorithm.util.AlgorithmUtil;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode result = null;
        return  result;
    }

    public static void main(String[] args) {
        ListNode head = null;
        SwapPairs swapPairs = new SwapPairs();
        ListNode result = swapPairs.swapPairs(head);
        AlgorithmUtil.println(result);
    }
}
