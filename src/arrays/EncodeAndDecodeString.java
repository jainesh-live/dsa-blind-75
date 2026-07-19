package arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
  public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String str : strs) {
      sb.append(str.length()).append("#").append(str);
    }

    return sb.toString();
  }

  public List<String> decode(String str) {
    int i = 0;
    int j = 0;
    int n = str.length();

    List<String> list = new ArrayList<>();

    while (i < n) {
      j = i;
      while (str.charAt(j) != '#') {
        j++;
      }

      int len = Integer.parseInt(str.substring(i, j));
      j++;

      list.add(str.substring(j, j + len));
      i = j + len;
    }
    return list;
  }
}
