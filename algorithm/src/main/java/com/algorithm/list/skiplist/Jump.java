package com.algorithm.list.skiplist;

import com.algorithm.util.AlgorithmUtil;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 * 示例:
 *
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 *
 * https://leetcode-cn.com/problems/jump-game-ii
 *
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 */

class Jump {
    /**
     * 使用跳跃表实现
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int count = 0;
        int target = nums.length - 1;
        while(target > 0){
            int i = 0;
            while(i < nums.length - 1){
                if(i + nums[i] >= target){
                    target = i;
                    count++;
                    break;
                }

                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums=  new int[]{2,3,1,1,4};
        Jump jump = new Jump();
        int result = jump.jump(nums);
        AlgorithmUtil.println(result);
    }
}