package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public boolean hasDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();

    int n = nums.length;
    for(int i = 0; i<n; i++) {
      if(!set.add(nums[i])) {
        return true;
      }
    }
    return false;
  }
}
