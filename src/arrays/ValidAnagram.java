package arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> map = new HashMap<>();
    int i = 0;

    while(i < s.length()) {
      Character ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
      i++;
    }

    i = 0;

    while(i < t.length()) {
      Character ch = t.charAt(i);
      Integer count = map.get(ch);

      if(count == null || count == 0) {
        return false;
      }

      map.put(ch, count-1);
      i++;
    }

    return map.values().stream().noneMatch(v -> v > 0);
  }
}
