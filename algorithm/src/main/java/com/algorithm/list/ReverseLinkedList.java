package com.algorithm.list;

import com.algorithm.define.ListNode;
import com.algorithm.util.AlgorithmUtil;
import com.algorithm.util.TreeUtil;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode listNode = null;
        return listNode;
    }


    public static void main(String[] args) {
        Integer[] nums = new Integer[]{
                1,2,3,4,5,null
        };
        ListNode head = TreeUtil.generateListNode(nums);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode result = reverseLinkedList.reverseList(head);
        AlgorithmUtil.println(result);
    }
}
