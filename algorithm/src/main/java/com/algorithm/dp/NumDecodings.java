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
        if(s == null || s.length() == 0 || s.charAt(0) == '0') return 0;

        /**状态定义*/
        char[] charArray = s.toCharArray();
        int[] dp = new int[s.length() + 1];
        dp[0]=1; //一个数时，只有一个接


//        int n = s.length();
//        if (n == 0 || s.charAt(0) == '0')     return 0;
//        int[] dp = new int [n + 1];
//        dp[0] = 1;
//        dp[1] = 1;

        /**
         * 分解为子问题，
         * 1、前一个为0的情况，
         * 2、前一个不为0的情况
         * 3、当前字符是否为0的情况
         * 4、当前字符是否不为0的情况
         */
        for(int i = 1; i < charArray.length; i++){
            if(charArray[i] == '0'){
                dp[i] = dp[i - 1];
            }

            if(charArray[i - 1] == '0'){
                dp[i] = dp[i - 1] ;
            } else{
                if(charArray[i - 1] == '1'){
                    dp[i] += dp[i - 1] + dp[i - 2];
                } else if(charArray[i - 1] == '2'){
                    if(charArray[i] <= 6){
                        dp[i] = dp[i - 1] + dp[i - 2];
                    }
                } else{
                    dp[i] = dp[i - 2];
                }
            }


            if (s.charAt(i - 2) == '1' || s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6') {
                dp[i] += dp[i - 2];
            }

            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
        }

        return dp[s.length()];
    }

    public int numDecodings1(String s) {
        if ("0".equals(s) || s.charAt(0) == '0') {
            return 0;
        }
        //dp[i]表示到字符串s下标i处时最多有几种解码方式
        int[] dp = new int[s.length()];
        //动态方程
        if (s.charAt(0) != '0') {
            dp[0] = 1;
        }
        for (int i = 1; i < s.length(); i++) {
            //无法解析的情况
            if (s.charAt(i) == '0' && (s.charAt(i - 1) > '2' || s.charAt(i - 1) == '0')) {
                return 0;
                //当前后2位是10或20
            } else if (s.charAt(i) == '0' && (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2')) {
                if (i > 1) {
                    dp[i] = dp[i - 2];
                } else {
                    dp[i] = 1;
                }
                //当前后2位是21-26或11-19
            } else if ((s.charAt(i - 1) == '2' && s.charAt(i) > '0' && s.charAt(i) <= '6') || (s.charAt(i - 1) == '1')) {
                if (i > 1) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else {
                    dp[i] = dp[i - 1] + 1;
                }
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[s.length() - 1];
    }


    public static void main(String[] args) {
        String s = "226";
        NumDecodings numDecodings = new NumDecodings();
        int result = numDecodings.numDecodings(s);
        System.out.println(result);
    }
}
