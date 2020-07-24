package com.algorithm;

import com.algorithm.util.AlgorithmUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * 说明：解集不能包含重复的子集。
 * https://leetcode-cn.com/problems/subsets/
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{
                1,2,3
        };
        Subsets subsets = new Subsets();
        List<List<Integer>> result = subsets.subsets(nums);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
