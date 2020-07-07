package com.algorithm.two.pointer;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和（近半年内，亚马逊考查此题达到 216 次、字节跳动 147 次、谷歌 104 次，Facebook、苹果、微软、腾讯也在近半年内面试常考）
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * https://leetcode-cn.com/problems/two-sum/description/
 */
public class TwoSum {
    /**
     * 使用双指针实现
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumByPoint(int[] nums, int target){
        int twoSum[] = new int[2];
        return twoSum;
    }

    /**
     * 使用map实现
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> result = new HashMap<>();
        int twoSum[] = new int[2];

        if(nums.length >= 3){
            for(int i = 0, length = nums.length; i < length; i++){
                int element = nums[i];

                if(!result.containsKey(element)){
                    result.put(element, i);
                }

                if(result.containsKey(target - element)){
                    twoSum[0] = result.get(target - element);
                    twoSum[1] = i;
                }
            }
        }

        return twoSum;
    }
}
