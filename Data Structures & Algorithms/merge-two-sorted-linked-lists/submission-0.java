/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
      ListNode head = null;
      ListNode curr = null;
      if(list1 == null && list2 != null) return list2;
      if(list1 != null && list2 == null) return list1;

      if(list1 == null && list2 == null) return null;

      while(list1 != null && list2 != null)
      {
        if(list1.val <= list2.val)
        {
          if(head == null)
          {
           head = new ListNode(list1.val);
           curr = head;
          }
          else
          {
            head.next = new ListNode(list1.val, list1.next);
            head = head.next;
          }
          list1 = list1.next;
        }
        else
        {
          if(head == null)
          {
           head = new ListNode(list2.val);
           curr = head;
          }
          else
          {
            head.next = new ListNode(list2.val, list2.next);
            head = head.next;
          }
          list2 = list2.next;
        }
      }

      if(list1 == null && list2 != null)
      {
        while(list2 != null)
        {
          head.next = new ListNode(list2.val, list2.next);
          list2 = list2.next;
          head = head.next;

        }

      }

      if(list1 != null && list2 == null)
      {
        while(list1 != null)
        {
          head.next = new ListNode(list1.val, list1.next);
          list1 = list1.next;
          head = head.next;
        }

      }

      return curr;  

       
    }
}