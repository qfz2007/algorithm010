package com.algorithm.backtracking;

import com.algorithm.util.AlgorithmUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 *
 * 示例:
 *
 * 输入: n = 4, k = 2
 * 输出:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * https://leetcode-cn.com/problems/combinations
 */
public class Combine {
    private List<List<Integer>> combineList = new ArrayList<>();
    private int n;
    private int k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;

        this.backtrack(1, new LinkedList<>());

        return combineList;
    }

    public void backtrack(int first, LinkedList<Integer> curr){
        if(curr.size() == k){
            combineList.add(new LinkedList<>(curr));
            return;
        }

        for(int i = first; i <= this.n; i++){
            /**作为第一个元素*/
            curr.add(i);

            /**回溯下一个数字的可能组合*/
            this.backtrack(i + 1, curr);

            /**移除掉刚才已经回溯过的数字，进行下一个数字的回溯*/
            curr.removeLast();
        }
    }

    public static void main(String[] args) {
        Combine combine = new Combine();
        List<List<Integer>> result = combine.combine(4,2);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
