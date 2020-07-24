package com.algorithm.backtracking;

import com.algorithm.util.AlgorithmUtil;

import java.util.*;

/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 *
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 * https://leetcode-cn.com/problems/permutations-ii/
 */
public class PermuteUnique {
    /**
     * 解题思路,使用回溯+剪枝
     * 1. 先进性初始化，按照各个元素为第一个元素，初始化一个map
     * 2. 然后采用递归，以后面的元素逐个组合
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }

        /**先进行初始化*/
        Map<Integer, List<Integer>> resultMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!resultMap.containsKey(nums[i])){
                resultMap.put(nums[i], new ArrayList<>());
            }

            resultMap.get(nums[i]).add(nums[i]);
            this.recursionPermuteUnique(nums, i, resultMap);
        }


        return result;
    }

    public void recursionPermuteUnique(int[] nums, int index, Map<Integer, List<Integer>> resultMap){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[index]){
                resultMap.get(nums[index]).add(nums[i]);
                recursionPermuteUnique(nums, i, resultMap);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        PermuteUnique permuteUnique = new PermuteUnique();
        List<List<Integer>> result = permuteUnique.permuteUnique(nums);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
