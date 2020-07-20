package com.algorithm.dp;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 * https://leetcode-cn.com/problems/minimum-path-sum/
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */

/**
 * 思考动态规划问题的四个步骤
 * 1、问题拆解，找到问题之间的具体联系
 * 2、状态定义
 * 3、递推方程推导
 * 4、实现
 */
public class MinPathSum {
    /**
     * 使用动态规划实现最小路径，时间复杂度为O(n^2)
     * @param grid
     * @return
     */
    /**
     * 状态定义：
     *
     *     设 dpdpdp 为大小 m×nm \times nm×n 矩阵，其中 dp[i][j]dp[i][j]dp[i][j] 的值代表直到走到 (i,j)(i,j)(i,j) 的最小路径和。
     *
     * 转移方程：
     *
     *     题目要求，只能向右或向下走，换句话说，当前单元格 (i,j)(i,j)(i,j) 只能从左方单元格 (i−1,j)(i-1,j)(i−1,j) 或上方单元格 (i,j−1)(i,j-1)(i,j−1) 走到，因此只需要考虑矩阵左边界和上边界。
     *
     *     走到当前单元格 (i,j)(i,j)(i,j) 的最小路径和 === “从左方单元格 (i−1,j)(i-1,j)(i−1,j) 与 从上方单元格 (i,j−1)(i,j-1)(i,j−1) 走来的 两个最小路径和中较小的 ” +++ 当前单元格值 grid[i][j]grid[i][j]grid[i][j] 。具体分为以下 444 种情况：
     *
     *     当左边和上边都不是矩阵边界时： 即当i≠0i \not= 0i​=0, j≠0j \not= 0j​=0时，dp[i][j]=min(dp[i−1][j],dp[i][j−1])+grid[i][j]dp[i][j] = min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]dp[i][j]=min(dp[i−1][j],dp[i][j−1])+grid[i][j] ；
     *     当只有左边是矩阵边界时： 只能从上面来，即当i=0,j≠0i = 0, j \not= 0i=0,j​=0时， dp[i][j]=dp[i][j−1]+grid[i][j]dp[i][j] = dp[i][j - 1] + grid[i][j]dp[i][j]=dp[i][j−1]+grid[i][j] ；
     *     当只有上边是矩阵边界时： 只能从左面来，即当i≠0,j=0i \not= 0, j = 0i​=0,j=0时， dp[i][j]=dp[i−1][j]+grid[i][j]dp[i][j] = dp[i - 1][j] + grid[i][j]dp[i][j]=dp[i−1][j]+grid[i][j] ；
     *     当左边和上边都是矩阵边界时： 即当i=0,j=0i = 0, j = 0i=0,j=0时，其实就是起点， dp[i][j]=grid[i][j]dp[i][j] = grid[i][j]dp[i][j]=grid[i][j]；
     *
     * 初始状态：
     *
     *     dpdpdp 初始化即可，不需要修改初始 000 值。
     *
     * 返回值：
     *
     *     返回 dpdpdp 矩阵右下角值，即走到终点的最小路径和。
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        /**状态定义*/
        int[][] dp = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                try{
                    /**状态转移方程*/
                    if(i == 0 && j == 0){
                        dp[i][j] = grid[i][j];
                    } else if(i == 0 && j > 0){
                        dp[i][j] = dp[i][j - 1] + grid[i][j];
                    } else if(i > 0 && j == 0){
                        dp[i][j] = dp[i - 1][j] + grid[i][j];
                    } else{
                        dp[i][j] = Math.min(dp[i - 1][j] + grid[i][j], dp[i][j - 1] + grid[i][j]);
                    }
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }

        System.out.println("dp结果：");
        for(int i = 0; i < dp.length; i++){
            StringBuilder stringBuilder = new StringBuilder();

            for(int j = 0; j < dp[i].length; j++){
                stringBuilder.append(dp[i][j]).append(" ");
            }

            System.out.println(stringBuilder.toString());
        }

        /**定义结果*/
        return dp[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        for(int i = 0; i < grid.length; i++){
            StringBuilder stringBuilder = new StringBuilder();

            for(int j = 0; j < grid[i].length; j++){
                stringBuilder.append(grid[i][j]).append(" ");
            }

            System.out.println(stringBuilder.toString());
        }

        MinPathSum minPathSum = new MinPathSum();
        int result = minPathSum.minPathSum(grid);
        System.out.println(result);
    }
}