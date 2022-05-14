package com.geeks.practice;

import java.util.Objects;

public class LongestSubStringWithoutRepeatingCharacters {
  public static int lengthOfLongestSubstring(String s) {

    int[] chars = new int[128];

    int left = 0;
    int right = 0;
    int res = 0;

    while(right < s.length()) {
      char c = s.charAt(right);
      chars[c]++;

      while (chars[c] > 1) {
        char l = s.charAt(left);
        chars[l]--;
        left++;
      }

      res = Math.max(res, right - left + 1);

      right++;
    }

    return res;
  }

  public static void main(String[] args) {
    System.out.println(LongestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
  }
}


/*int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;*/