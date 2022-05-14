package com.geeks.practice.arrays;

public class LargestNumberAtleastTwice {
  public static int dominantIndex(int[] nums) {
    int largest = 0;
    int secondLargest = 0;
    int largestIndex = 0;

    if (nums.length == 1) {
      return 0;
    }

    for (int i = 0; i < nums.length; i++) {
      if (largest < nums[i]) {
        largestIndex = i;
        largest = nums[i];
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (secondLargest < nums[i] && i != largestIndex) {
        secondLargest = nums[i];
      }
    }

    if ((2*secondLargest) <= largest && secondLargest != 0) {
      return largestIndex;
    }
    return -1;
  }

  public static void main(String[] args) {
    LargestNumberAtleastTwice.dominantIndex(new int[]{3,6,1,0});
  }
}
