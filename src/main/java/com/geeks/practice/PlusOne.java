package com.geeks.practice;

public class PlusOne {
  public int[] plusOne(int[] digits) {

    int[] finalArray = new int[digits.length + 1];
    int carryForward = 1;
    for (int i = digits.length - 1; i >= 0 ; i--) {
      if(digits[i] == 9 && carryForward == 1) {
        finalArray[i+1] = 0;
      } else if (carryForward == 1) {
        finalArray[i+1] = digits[i] + 1;
        carryForward = 0;
      } else {
        finalArray[i+1] = digits[i];
      }
    }
    if(carryForward == 1) {
      finalArray[0] = 1;
      return finalArray;
    }
    int[] newArray=new int[finalArray.length-1];
    System.arraycopy(finalArray,1,newArray,0,finalArray.length-1);

    return newArray;
  }
}
