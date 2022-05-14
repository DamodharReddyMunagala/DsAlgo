package com.geeks.practice.arrays;

public class PivotIndex {
  public static int pivotIndex(int[] nums) {

    int[] leftSumArray = new int[nums.length];
    int[] rightSumArray = new int[nums.length];

    leftSumArray[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      leftSumArray[i] = leftSumArray[i - 1] + nums[i];
    }

    rightSumArray[nums.length - 1] = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0 ; i--) {
      rightSumArray[i] = rightSumArray[i + 1] + nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      if(leftSumArray[i] == rightSumArray[i]) {
        return i + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    PivotIndex.pivotIndex(new int[]{-1,-1,-1,-1,-1,0});
  }
}
