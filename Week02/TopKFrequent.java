package Week02;

import java.util.*;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
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
}
