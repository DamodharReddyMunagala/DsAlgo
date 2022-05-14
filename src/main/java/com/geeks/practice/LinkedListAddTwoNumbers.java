package com.geeks.practice;

public class LinkedListAddTwoNumbers {

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode finalNode = new ListNode();
    var dummy = finalNode;

    int carryForward = 0;

    while (l1.next != null && l2.next != null) {
      int sum = carryForward + l1.val + l2.val;
      carryForward = sum / 10;
      finalNode.next = new ListNode(sum % 10);
      finalNode = finalNode.next;

      l1 = l1.next;
      l2 = l2.next;
    }

    while(l1.next != null) {
      int sum = carryForward + l1.val;
      carryForward = sum / 10;
      finalNode.next = new ListNode(sum % 10);
      finalNode = finalNode.next;

      l1 = l1.next;
    }

    while (l2.next != null) {
      int sum = carryForward + l2.val;
      carryForward = sum / 10;
      finalNode.next = new ListNode(sum % 10);
      finalNode = finalNode.next;

      l2 = l2.next;
    }

    return dummy.next;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {

    int[] arr = new int[]{2,3,3};
    int[] arr1 = new int[]{5,6};
    int[] arr2 = new int[]{1,2,3,4,5};
    ListNode l1 = new ListNode();
    var dummy1 = l1;
    ListNode l2 = new ListNode();
    var dummy2 = l2;
    ListNode l3 = new ListNode();
    var dummy3 = l3;

    for (int i = 0; i < arr.length; i++) {
      l1.next = new ListNode(arr[i]);
      l1 = l1.next;
    }

    for (int i = 0; i < arr1.length; i++) {
      l2.next = new ListNode(arr1[i]);
      l2 = l2.next;
    }

    for (int i = 0; i < arr2.length; i++) {
      l3.next = new ListNode(arr2[i]);
      l3 = l3.next;
    }

    addTwoNumbers(dummy1, dummy2);

    LinkedListRemoveNthFromEnd.removeNthFromEnd(dummy3.next, 1);

    MergeTwoSortedLinkedLists.mergeTwoLists(dummy1.next, dummy2.next);

  }
}
