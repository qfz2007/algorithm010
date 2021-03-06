package com.algorithm;

/**
 * 编写一个程序，通过已填充的空格来解决数独问题。
 *
 * 一个数独的解法需遵循如下规则：
 *
 *     数字 1-9 在每一行只能出现一次。
 *     数字 1-9 在每一列只能出现一次。
 *     数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 * 空白格用 '.' 表示。
 *
 * 一个数独。
 *
 * 答案被标成红色。
 *
 * Note:
 *
 *     给定的数独序列只包含数字 1-9 和字符 '.' 。
 *     你可以假设给定的数独只有唯一解。
 *     给定数独永远是 9x9 形式的。
 *
 * https://leetcode-cn.com/problems/sudoku-solver
 */
public class SolveSudoku {
    public void solveSudoku(char[][] board) {

    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}
        };

        SolveSudoku solveSudoku = new SolveSudoku();
        solveSudoku.solveSudoku(board);
    }
}
