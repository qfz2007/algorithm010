package com.algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
 * 我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 * 丑数的因子也是丑数
 */
public class NthUglyNumber {
    public static int nthUglyNumber(int n) {
        int[] number = new int[n];
        number[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for(int i = 1; i < n; i++){
            int x2 = number[i2] * 2;
            int x3 = number[i3] * 3;
            int x5 = number[i5] * 5;

            int result = Math.min(x2, x3);
            result = Math.min(x5, result);
            number[i] = result;

            if(number[i] == x2){i2++;}
            if(number[i] == x3){i3++;}
            if(number[i] == x5){i5++;}
        }

        return number[n - 1];
    }
}
