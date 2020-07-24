package com.algorithm.heap;

import com.algorithm.util.AlgorithmUtil;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
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
 *
 * 给定一个非空的整数数组，返回其中前 k 最大的元素。这个是个人进一步衍生出来的
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
        AlgorithmUtil.println(result);
    }
}

