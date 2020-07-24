package com.algorithm;

import com.algorithm.util.AlgorithmUtil;

/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 *     每行中的整数从左到右按升序排列。
 *     每行的第一个整数大于前一行的最后一个整数。
 *
 * 示例 1:
 *
 * 输入:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * 输出: true
 *
 * 示例 2:
 *
 * 输入:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 13
 * 输出: false
 *
 * https://leetcode-cn.com/problems/search-a-2d-matrix
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50},
        };
        int target = 3;
        SearchMatrix searchMatrix = new SearchMatrix();
        boolean  result = searchMatrix.searchMatrix(matrix, target);
        AlgorithmUtil.println(result);
    }
}
