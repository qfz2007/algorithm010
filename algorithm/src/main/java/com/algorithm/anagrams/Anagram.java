package com.algorithm.anagrams;

import com.algorithm.util.AlgorithmUtil;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * https://leetcode-cn.com/problems/valid-anagram/description/
 */
public class Anagram {
    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if(t == null){
            return false;
        }

        if(s == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        int[] map = new int[26];
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        for(char element : arrS){
            map[element - 97]++;
        }


        for(char element : arrT){
            map[element - 97]--;
        }

        for(int i : map){
            if(i != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";

        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram(s, t);
        AlgorithmUtil.println(result);
    }
}

