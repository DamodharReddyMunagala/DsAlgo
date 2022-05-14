package com.geeks.practice;

public class ContainerWithMostWater {

  public static int maxArea(int[] height) {

    int left = 0;
    int right = height.length - 1;
    int maxArea = Math.min(height[left], height[right]) * (right - left);

    while (left < right) {
      if (height[left] < height[right]) {
        left++;
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
      } else if (height[right] < height[left]){
        right--;
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
      }else {
        break;
      }

    }

    return Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
  }

  public static void main(String[] args) {
    ContainerWithMostWater.maxArea(new int[]{1,3,2,5,25,24,5});
  }
}
