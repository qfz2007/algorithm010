package com.algorithm.anagrams;

public class Anagram {
    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
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
        System.out.println(Anagram.isAnagram(s, t));
    }
}

