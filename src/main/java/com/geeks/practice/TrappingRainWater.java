package com.geeks.practice;

public class TrappingRainWater {
  public static int trap(int[] height) {

    int left = 0;
    int right = height.length - 1;
    int result = 0;

    int left_max = 0;
    int right_max = 0;
    while (left < right) {
      if (height[left] <= height[right]) {
        if(height[left] >= left_max) {
          left_max = height[left];
        }
        result += left_max - height[left];
        left++;
      } else {

        if (height[right] >= right_max) {
          right_max = height[right];
        }
        result += right_max - height[right];
        right--;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(TrappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
  }
}
