package com.algorithm;

import com.algorithm.util.AlgorithmUtil;

/**
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 *
 * 示例:
 *
 * 输入:
 *
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 *
 * 输出: 4
 *
 * https://leetcode-cn.com/problems/maximal-square
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        char[][] matrix = new char[][]{
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0},
        };
        MaximalSquare maximalSquare = new MaximalSquare();
        int result = maximalSquare.maximalSquare(matrix);
        AlgorithmUtil.println(result);
    }
}
