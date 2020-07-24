package com.algorithm;

import com.algorithm.util.AlgorithmUtil;
import com.algorithm.util.TreeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 您需要在二叉树的每一行中找到最大的值。
 *
 * 示例：
 *
 * 输入:
 *
 *           1
 *          / \
 *         3   2
 *        / \   \
 *       5   3   9
 *
 * 输出: [1, 3, 9]
 *
 * https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row
 */
public class LargestValues {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return result;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1,3,2,5,3,null,9};
        TreeNode root = TreeUtil.getTreeNode(nums);
        LargestValues largestValues = new LargestValues();
        List<Integer> result = largestValues.largestValues(root);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
