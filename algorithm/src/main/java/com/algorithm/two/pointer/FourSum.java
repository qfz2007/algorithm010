package com.algorithm.two.pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 * https://leetcode.com/problems/4sum/
 */
public class FourSum {
    private int length;

    /**
     * 用递归方式实现不断的降低纬度，最终双指针解决两数问题
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length <= 3) return new ArrayList<>();
        length = nums.length;

        /**进行排序操作*/
        Arrays.sort(nums);

        /**四数求和，可适用于3数求和*/
        return kSum(nums, target, 4, 0);
    }

    /**
     * 使用双指针方式去重很重要，很容易遗漏去重
     * @param nums
     * @param target
     * @param k
     * @param index
     * @return
     */
    public List<List<Integer>> kSum(int[]nums, int target, int k, int index){
        ArrayList<List<Integer>> result = new ArrayList<>();
        if(index >= length) {
            return result;
        }

        /**两数求和，双指针夹逼方式*/
        if(k == 2) {
            int i = index, j = length - 1;

            while(i < j) {
                /**两数之和*/
                if(target - nums[i] == nums[j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(target-nums[i]);
                    result.add(temp);

                    /**题目要求去重，因此这里要做去重处理，两端都要去重*/
                    while(i<j && nums[i] == nums[i+1]) i++;
                    while(i<j && nums[j - 1] == nums[j]) j--;
                    i++;
                    j--;
                    /**如果比较小则向右逼近*/
                } else if (target - nums[i] > nums[j]) {
                    i++;
                } else {
                    /**如果有变比较大向左逼近*/
                    j--;
                }
            }
        } else{
            /**length - k + 1,是因为无需遍历到最后的k -1个数，因为如果少了k -1数就无法凑成k个数求和*/
            /**i 从index  开始遍历，是因为递归环节过程中上一层已经遍历的无需重复遍历*/
            for (int i = index; i < length - k + 1; i++) {
                /**递归n减一个数*/
                List<List<Integer>> temp = kSum(nums, target - nums[i], k-1, i + 1);
                if(temp != null){
                    /**递归倒推的结果放在最前面*/
                    for (List<Integer> t : temp) {
                        t.add(0, nums[i]);
                    }
                    result.addAll(temp);
                }

                /**这里也要做去重操作*/
                while (i < length - 1 && nums[i] == nums[i+1]) {
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(nums, target);
        for(List<Integer> list : result){
            StringBuilder stringBuilder = new StringBuilder();
            for(Integer num : list){
                stringBuilder.append(num).append("  ");
            }

            System.out.println(stringBuilder.toString());
        }
    }
}
