package com.algorithm.divide.and.conquer;

import com.algorithm.util.AlgorithmUtil;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 实现 pow(x, n) ，即计算 x 的 n 次幂函数。

 示例 1:

 输入: 2.00000, 10
 输出: 1024.00000
 示例 2:

 输入: 2.10000, 3
 输出: 9.26100
 示例 3:

 输入: 2.00000, -2
 输出: 0.25000
 解释: 2-2 = 1/22 = 1/4 = 0.25
 说明:

 -100.0 < x < 100.0
 n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 * https://leetcode-cn.com/problems/powx-n/
 */
public class Power {
    /**
     * 使用使用递归算法实现
     * @param x
     * @param n
     * @return
     */
    public double myPowOneByOne(double x, long n) {
        if(n <= 1) return x;

        double result = myPowOneByOne(x, n - 1) * x;
        return result;
    }

     /**
     * 使用分治算法实现,空间复杂度为O(logn)
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, long n) {
        if(n == 0) return 1d;
        long m = Math.abs(n);
        double result = 0d;

        if(m % 2 == 0){
            result = myPow(x, m / 2);
            result *= result;
        } else{
            result = myPow(x, (m - 1) / 2);
            result = result * result * x;
        }

        if(n < 0){
            result = 1.0 / result;
        }

        result = x < 0 ? 1 / result : result;

        return result;
    }

    /**
     * 迭代+快速幂次
     *
     * @param x
     * @param n
     * @return
     */
    public double quickMul(double x, long n) {
        double result = 1.0;

        long m = n < 0 ? -n : n;
        while (m > 0){
            System.out.println("m="+ m);
            /**这里采用位运算是否进行多乘以一个x*/
            if((m & 1) == 1){
                System.out.println("x="+ x);
                result *= x;
            }

            /** x = x^2x=x*/
            x *= x;

            /**向左移动一位就是相当于除以2*/
            m = m >> 1;
        }

        result = n < 0 ? 1 / result : result;

        return result;
    }

    /**
     * 牛顿迭代法实现
     */
    public void  newtonIteration(){

    }

    public static void main(String[] args) {
        Power power = new Power();
        double result = power.quickMul(2,3);
        AlgorithmUtil.println(result);
    }
}
