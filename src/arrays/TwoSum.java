package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    int n = nums.length;

    for (int i = 0; i < n; i++) {
      int rem = target - nums[i];

      Integer idx = map.get(rem);
      if (idx != null) {
        return new int[]{idx, i};
      }

      map.put(nums[i], i);
    }

    return null;
  }
}
