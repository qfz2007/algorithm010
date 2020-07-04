package com.algorithm.recursive.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 * https://leetcode-cn.com/problems/climbing-stairs/
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
public class ClimbStairs {
    private Map<Integer, Integer> countMap = new HashMap<>();

    /**
     * 不带缓存的斐波那契数列的递归计算
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n <= 2){return n;}
        return climbStairs(n -1) + climbStairs(n - 2);
    }

    /**
     * 带缓存的斐波那契数列的递归计算
     * @param n
     * @return
     */
    public int climbStairsCache(int n) {
        if(n <= 2){return n;}

        if(countMap.containsKey(n)){
            return countMap.get(n);
        } else{
            int result = climbStairs(n -1) + climbStairs(n - 2);
            countMap.put(n, result);
            return result;
        }
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        int count = climbStairs.climbStairs(2);
        System.out.println("count="+ count);
    }
}
