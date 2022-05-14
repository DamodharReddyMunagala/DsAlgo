package com.geeks.practice;

import java.util.ArrayList;
import java.util.List;

public class FindMissingRanges {
  public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> missingRanges = new ArrayList<>();

    if (nums.length < 2) {
      return missingRanges;
    }

    if (nums[0] > lower) {
      int second = nums[0] - 1;
      if(second - lower != 0) {
        missingRanges.add(String.format("%s->%s", lower, second));
      } else {
        missingRanges.add(String.format("%s", lower -1));
      }
    }

    for (int i = 1; i < nums.length - 1; i++) {
      if (nums[i] != nums[i+1]) {
        int second = nums[i+1] - 1;
        int first = nums[i] + 1;
        if(second - first != 0) {
          missingRanges.add(String.format("%s->%s", first, second));
        } else {
          missingRanges.add(String.format("%s", first));
        }
      }
    }

    if (nums[nums.length - 1] != upper) {
      int second = upper;
      int first = nums[nums.length - 1] + 1;
      if(second - first != 0) {
        missingRanges.add(String.format("%s->%s", first, second));
      } else {
        missingRanges.add(String.format("%s", first -1));
      }
    }
    return missingRanges;
  }
}
