package com.geeks.practice;

public class MinMeetingRooms {
  public static int minMeetingRooms(int[][] intervals) {
    int minValue = intervals[0][0];
    int maxValue = 0;

    for (int i = 0; i < intervals.length; i++) {
      for (int j = 0; j < intervals[i].length; j++) {
        if (intervals[i][j] < minValue) {
          minValue = intervals[i][j];
        } else if (intervals[i][j] > maxValue) {
          maxValue = intervals[i][j];
        }
      }
    }

    int[] maxArr = new int[maxValue+1];

    for (int i = 0; i < intervals.length; i++) {
      int countMeter = intervals[i][0];
      while(countMeter < intervals[i][1]) {
        maxArr[countMeter]++;
        countMeter++;
      }
    }

    int maxFinal = 0;

    for (int i = 0; i < maxArr.length; i++) {
      if (maxFinal < maxArr[i]) {
        maxFinal = maxArr[i];
      }
    }

    return maxFinal;

  }

  public static void main(String[] args) {
    MinMeetingRooms.minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}});
  }
}
