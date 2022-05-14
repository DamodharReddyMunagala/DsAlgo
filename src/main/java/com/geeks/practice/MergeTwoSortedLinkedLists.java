package com.geeks.practice;

import com.geeks.practice.LinkedListAddTwoNumbers.ListNode;

public class MergeTwoSortedLinkedLists {
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode finalList = new ListNode();
    ListNode dummy = finalList;

    while (list1 != null && list2 != null) {
      if(list1.val <= list2.val) {
        dummy.next = new ListNode(list1.val);
        dummy = dummy.next;
        list1 = list1.next;
      } else {
        dummy.next = new ListNode(list2.val);
        dummy = dummy.next;
        list2 = list2.next;
      }
    }

    while(list1 != null) {
      dummy.next = new ListNode(list1.val);
      dummy = dummy.next;
      list1 = list1.next;
    }

    while (list2 != null) {
      dummy.next = new ListNode(list2.val);
      dummy = dummy.next;
      list2 = list2.next;
    }

    return finalList.next;
  }
}
