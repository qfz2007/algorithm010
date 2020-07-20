package com.algorithm.two.pointer;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 *
 *
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 *
 *
 *
 * 示例：
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {
    /**
     * 获取最大面积, 使用双指针夹逼，双指针夹逼优先考虑while方式，for循环存在局限性
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        if(height.length < 2) return  0;

        int result = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            if(i <= j){
                int temp = Math.min(height[j], height[i]) * (j - i);
                result = Math.max(temp, result);
            }

            if ((height[i] < height[j])) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        MaxArea maxArea = new MaxArea();
        int result = maxArea.maxArea(height);
        System.out.println(result);
    }
}
