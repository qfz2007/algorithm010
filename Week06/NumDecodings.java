package com.algorithm.dp;

/**
 *一条包含字母 A-Z 的消息通过以下方式进行了编码：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 *
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 * 示例 1:
 *
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 *
 * 示例 2:
 *
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 * https://leetcode-cn.com/problems/decode-ways/
 */
public class NumDecodings {
    /**
     * 使用动态规划进行处理，将字符串转换为二维数组
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];

        if(s == null || s.length() == 0 || s.charAt(0) == '0') return 0;

        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i - 1] != 0){
                if(charArray[i - 1] == 1){
                    dp[i] += dp[i - 1] + 1;
                } else if(charArray[i - 1] == 2){
                    if(charArray[i] <= 6){
                        dp[i] += dp[i - 1] + 1;
                    }
                } else{
                    dp[i] += dp[i - 1];
                }
            } else{
                if(charArray[i] != 0){
                    if(charArray[i - 1] == 1){
                        dp[i] += dp[i - 1];
                    }

                    if(charArray[i - 1] == 2){
                        dp[i] += dp[i - 1];
                    }
                }
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        String s = "226";
        NumDecodings numDecodings = new NumDecodings();
        int result = numDecodings.numDecodings(s);
        System.out.println(result);
    }
}
