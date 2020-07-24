package com.algorithm.two.pointer;

import com.algorithm.util.AlgorithmUtil;

import java.util.*;

/**
 * 209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例: 
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * 进阶:
 *
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */
public class MinSubArrayLen {
    /**
     * 使用双指针实现，时间复杂度O(n)
     * @param s
     * @param nums
     * @return
     */
    public int minSubArrayLen(int s, int[] nums) {
        int minLength = 0;
        if(nums.length == 0){
            return 0;
        }

        int startIndex = 0, endIndex = 0;
        int result = 0;
        for(int i = 0, length = nums.length; i < length; i++){
            result = s - nums[i];

            if(result == 0){

            }

        }

        return minLength;
    }

    public static void main(String[] args) {
        int s = 7; int[] nums = new int[]{
                2,3,1,2,4,3
        };
        MinSubArrayLen minSubArrayLen = new MinSubArrayLen();
        int result = minSubArrayLen.minSubArrayLen(s, nums);
        AlgorithmUtil.println(result);
    }
}
