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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        // when fast reach at end means slow is in middle
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while(fast != null && fast.next != null)
        {
            length = length+2;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null && fast.next == null)
        {
            length++;
        }

        if(n > length) return head;
        if(length == n)
        {
            head = head.next;
            return head;
        }

       int size = (length - n)+1; 

       ListNode curr = head;


       int i = 1;
       ListNode prev = null;
       while(i != size)
       {
        i++;
        prev = curr;
        curr = curr.next;
       }
      
       prev.next = curr.next;
       return head;

    }
}
