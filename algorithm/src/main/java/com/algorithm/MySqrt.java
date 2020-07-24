package com.algorithm;

import com.algorithm.util.AlgorithmUtil;

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 *
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *
 * https://leetcode-cn.com/problems/sqrtx
 */
public class MySqrt {
    public int mySqrt(int x) {
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        int x = 4;
        MySqrt mySqrt = new MySqrt();
        int result = mySqrt.mySqrt(x);
        AlgorithmUtil.println(result);
    }
}
