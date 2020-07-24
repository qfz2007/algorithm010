package com.algorithm.array;

import com.algorithm.util.AlgorithmUtil;

/**
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * https://leetcode-cn.com/problems/reverse-integer/
 */
public class Reverse {
    /**
     * 转换成字符串处理的方式比较low,实际上仍然使用数字进行处理
     * @param x
     * @return
     */
    public int reverse(int x) {
        long y = Math.abs(x);
        StringBuilder resultBuilder = new StringBuilder();
        if(y == 0) return 0;

        String[] arr = String.valueOf(y).split("");
        if(arr.length > 0){
            for(int i = arr.length - 1; i >= 0; i--){
                if(arr[i].equalsIgnoreCase("0") && arr[i - 1].equalsIgnoreCase("0")){
                    continue;
                }

                resultBuilder.append(arr[i]);
            }
        }

        Integer result = Integer.valueOf(resultBuilder.toString());
        return result * (x > 0 ? 1 : -1);
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        long result = reverse.reverse(1534236469);
        AlgorithmUtil.println(result);
    }
}
