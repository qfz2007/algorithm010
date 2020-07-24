package com.algorithm.heap;

import com.algorithm.util.AlgorithmUtil;

import java.util.*;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 *
 * 示例 2:
 *
 * 输入: nums = [1], k = 1
 * 输出: [1]
 *
 *
 *
 * 提示：
 *
 *     你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 *     你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 *     题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。
 *     你可以按任意顺序返回答案。
 * https://leetcode-cn.com/problems/top-k-frequent-elements/
 */
public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> frequentMap = new HashMap<>();
        for(int number : nums){
            if(!frequentMap.containsKey(number)){
                frequentMap.put(number, 0);
            }

            frequentMap.put(number, frequentMap.get(number) + 1);
        }

        PriorityQueue priorityQueue = new PriorityQueue(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer>  o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().intValue() - o1.getValue().intValue();
            }
        });

        Iterator<Map.Entry<Integer, Integer>> iterator = frequentMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> entry = iterator.next();
            priorityQueue.add(entry);
        }

        for(int i = 0; i < k; i++){
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>)priorityQueue.poll();
            result[i] = entry.getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,5,34,65,46,6, 57};
        int k = 2;
        int[] result = TopKFrequent.topKFrequent(nums, k);
        AlgorithmUtil.println(result);
    }
}