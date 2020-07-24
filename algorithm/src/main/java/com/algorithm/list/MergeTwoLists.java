package com.algorithm.list;

import com.algorithm.define.ListNode;
import com.algorithm.util.AlgorithmUtil;
import com.algorithm.util.TreeUtil;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 *
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * https://leetcode-cn.com/problems/merge-two-sorted-lists
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        return result;
    }

    public static void main(String[] args) {
        Integer[] nums1 = new Integer[]{
                1,2,4
        };

        Integer[] nums2 = new Integer[]{
                1,3,4
        };
        ListNode l1 = TreeUtil.generateListNode(nums1);
        ListNode l2 = TreeUtil.generateListNode(nums2);

        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode result = mergeTwoLists.mergeTwoLists(l1, l2);
        AlgorithmUtil.println(result);
    }
}
