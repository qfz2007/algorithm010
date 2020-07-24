package com.algorithm.stack;

import com.algorithm.util.AlgorithmUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *
 *
 * 示例：
 *
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 *
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * https://leetcode-cn.com/problems/generate-parentheses/
 */
public class GenerateParenthesis {
    /**
     * 使用栈方式进行实现
     * java的栈建议使用Deque来实现，比如继承自linkedlist双端队列
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String>  result =  new ArrayList<>();
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> result = generateParenthesis.generateParenthesis(n);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
