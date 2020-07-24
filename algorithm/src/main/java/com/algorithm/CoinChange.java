package com.algorithm;

import com.algorithm.util.AlgorithmUtil;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 *
 *
 * 示例 1:
 *
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 *
 * 示例 2:
 *
 * 输入: coins = [2], amount = 3
 * 输出: -1
 *
 *
 *
 * 说明:
 * 你可以认为每种硬币的数量是无限的。
 *
 * https://leetcode-cn.com/problems/coin-change
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        int[] coins = new int[]{
                1, 2, 5
        };
        int amount = 11;
        CoinChange coinChange = new CoinChange();
        int result = coinChange.coinChange(coins, amount);
        AlgorithmUtil.println(result);
    }
}
