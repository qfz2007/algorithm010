package com.algorithm.anagrams;

import com.algorithm.util.AlgorithmUtil;

import java.util.*;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * 说明：
 *
 *     所有输入均为小写字母。
 *     不考虑答案输出的顺序。
 * https://leetcode-cn.com/problems/group-anagrams/
 */
public class GroupAnagrams {
    /**
     * @param strs
     * @return
     * @author
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        Map<String, List<String>> resultMap = new HashMap<>();

        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String key = new String(charArray);
            if(!resultMap.containsKey(key)){
                resultMap.put(key, new ArrayList<>());
            }

            resultMap.get(key).add(str);
        }

        Iterator<Map.Entry<String, List<String>>> iterator = resultMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, List<String>> entry = iterator.next();
            List<String> strList = entry.getValue();
            resultList.add(strList);
        }

        return resultList;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = GroupAnagrams.groupAnagrams(strs);
        AlgorithmUtil.println(Collections.singletonList(result));
    }
}
