package com.algorithm.two.pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。

 注意：答案中不可以包含重复的三元组。

 示例：

 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

 满足要求的三元组集合为：
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 * https://leetcode-cn.com/problems/3sum/
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3) return result;

        /**这里排序的目的是为了过滤重复元素*/
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            this.getList(nums, i, result);
        }

        return result;
    }

    private void getList(int[] nums, int j, List<List<Integer>> result){
        int m = nums.length - 1;
        for(int i = j + 1; i < nums.length; i++){
            if(i >= m){
                break;
            }

            int temp = nums[i] + nums[m];
            if(temp == -nums[j]){
                List<Integer> list = new ArrayList<>();
                list.add(nums[j]);
                list.add(nums[i]);
                list.add(nums[m]);
                result.add(list);
            }

            m--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        nums = new int[]{-1,0,1,2,-1,-4};
        nums = new int[]{0,0,0,0};
        nums = new int[]{1,-1,-1,0};

        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(nums);
        if(result != null && result.size() > 0){
            for(List<Integer> list : result){
                StringBuilder builder = new StringBuilder();
                for (int i : list){
                    builder.append(i).append(",");
                }

                System.out.println(builder.toString());
            }
        }
    }
}
