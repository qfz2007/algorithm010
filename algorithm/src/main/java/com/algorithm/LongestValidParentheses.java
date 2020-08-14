package com.algorithm;

import com.algorithm.util.AlgorithmUtil;

/**
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *
 * 示例 1:
 *
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 *
 * 示例 2:
 *
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 *
 * https://leetcode-cn.com/problems/longest-valid-parentheses
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        String s= "(()";
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        int result = longestValidParentheses.longestValidParentheses(s);
        AlgorithmUtil.println(result);
    }

}