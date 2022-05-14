package com.geeks.practice;

import java.util.Scanner;

public class MinMaxArrayElement {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int noOfTestCases = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < noOfTestCases; i++) {
      int arraySize = Integer.parseInt(scanner.nextLine());

      int[] intArray = new int[arraySize];
      String nextLine = scanner.nextLine();

      String[] elements  = nextLine.split(" ");

      for (int j = 0; j < elements.length; j++) {
        intArray[j] = Integer.parseInt(elements[j]);
      }


      int minEle = intArray[0];

      int maxEle = intArray[0];

      for (int j = 1; j < intArray.length; j++) {

        if (minEle > intArray[j]) {
          minEle = intArray[j];
        }

        if (maxEle < intArray[j]) {
          maxEle = intArray[j];
        }
      }

      System.out.println(maxEle + " " + minEle);
    }
  }
}
