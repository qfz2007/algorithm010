package com.algorithm.backtracking;

import com.algorithm.util.AlgorithmUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 * https://leetcode-cn.com/problems/permutations
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        Permute permute = new Permute();
        List<List<Integer>> result = permute.permute(nums);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
