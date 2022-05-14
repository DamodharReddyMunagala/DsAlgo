package com.geeks.practice;

import com.geeks.practice.LinkedListAddTwoNumbers.ListNode;

public class LinkedListRemoveNthFromEnd {

  public static ListNode removeNthFromEnd(ListNode head, int n) {

   ListNode dummy = new ListNode();

   dummy.next = head;
   ListNode first = head;
   int length = 0;
   while (first != null) {
     length++;
     first = first.next;
   }
   length = length - n;
   first = dummy;
   while (length > 0) {
     length--;
     first = first.next;
   }
   first.next = first.next.next;
   return dummy.next;
   
  }

}
