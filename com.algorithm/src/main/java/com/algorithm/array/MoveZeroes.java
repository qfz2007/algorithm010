package com.algorithm.array;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * https://leetcode-cn.com/problems/move-zeroes/
 * 双指针分为双向双指针，快慢指针
 */
public class MoveZeroes {
    /**
     *
     * 采用双指针(这里采用的是双向双指针)实现，但是不确保按照顺序移动，是无序的，时间复杂度为O(n)
     * 采用的是向前移动非0的元素
     * @param nums
     */
    public void moveZeroesNoOrder(int[] nums) {
        if(nums != null && nums.length > 0){
            int j = 0;
            for(int i = nums.length - 1; i > 0; i--){
                if(nums[j] != 0 ) {
                    j++;
                }

                if(i > j){
                    if(nums[j] == 0 && nums[i] != 0){
                        nums[j] = nums[i];
                        nums[i] = 0;
                        j++;
                    }
                }
            }
        }
    }

    /**
     * 使用双指针实现(采用快慢指针)，确保移动后的非0元素顺序保持不变,同时达到O(n)的时间复杂度
     * 需要注意是不为0，而不是为正整数
     * @param nums
     */
    public void moveZeroesOrder(int[] nums) {
        if(nums != null && nums.length > 0){
            int j = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    if(nums[j] == 0){
                        nums[j] = nums[i];
                        nums[i] = 0;
                    }
                }

                if(nums[j] != 0){
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,2,4,0,0,3,0,5,1,0};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroesOrder(nums);
        System.out.println(nums.length);
    }
}
