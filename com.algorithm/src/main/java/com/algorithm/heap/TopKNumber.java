package com.algorithm.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 给定一个非空的整数数组，返回其中前 k 最大的元素。
 */
public class TopKNumber {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        PriorityQueue priorityQueue = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer  o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });
        for(int number : nums){
            priorityQueue.add(number);
        }

        for(int i = 0; i < k; i++){
            result[i] = (int)priorityQueue.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,5,34,65,46,6, 57};
        int k = 2;
        int[] result = TopKNumber.topKFrequent(nums, k);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i : result){
            stringBuilder.append(i).append(",");
        }

        System.out.println(stringBuilder.toString());
    }
}

