package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElementUsingHeap {

  record Pair(int num, int count) {
  }

  public int[] topKFrequent(int[] nums, int k) {
    Queue<Pair> queue = new PriorityQueue<>((a, b) -> Integer.compare(b.count(), a.count()));

    Map<Integer, Integer> countMap = new HashMap<>();

    for (int num : nums) {
      countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    countMap.forEach((key, v) -> {
      queue.offer(new Pair(key, v));
    });

    int[] result = new int[k];

    int j = 0;
    while (j < k) {
      result[j] = queue.poll().num();
      j++;
    }

    return result;
  }
}
