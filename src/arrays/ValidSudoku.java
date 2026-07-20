package arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
  public boolean isValidSudoku(char[][] board) {

    int n = board.length;
    // check rows
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      int j = 0;
      while (j < n) {
        char ch = board[i][j];
        if (!isValid(set, ch)) {
          return false;
        }
        j++;
      }
      set.clear();
    }

    // check columns
    set.clear();
    for (int i = 0; i < n; i++) {
      int j = 0;
      while (j < n) {
        char ch = board[j][i];
        if (!isValid(set, ch)) {
          return false;
        }
        j++;
      }
      set.clear();
    }

    // check 3*3 boxes
    int rowStart = 0;
    int rowEnd = 2;

    while (rowEnd < n) {
      int colStart = 0;
      int colEnd = 2;
      while (colEnd < n) {
        set.clear();
        if (!isValidBox(rowStart, rowEnd, colStart, colEnd, set, board)) {
          return false;
        }

        colStart += 3;
        colEnd += 3;
      }
      rowStart += 3;
      rowEnd += 3;
    }

    return true;

  }

  private boolean isValidBox(int rowStart, int rowEnd, int colStart, int colEnd, Set<Character> set, char[][] board) {
    for (int i = rowStart; i <= rowEnd; i++) {
      for (int j = colStart; j <= colEnd; j++) {
        char ch = board[i][j];
        if (!isValid(set, ch)) {
          return false;
        }
      }
    }

    return true;
  }

  private boolean isValid(Set<Character> set, char ch) {
    if (ch == '.') {
      return true;
    }

    if (!set.add(ch)) {
      return false;
    }

    int num = ch - '0';
    return num >= 1 && num <= 9;
  }
}
