/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      boolean hascycle=false;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            hascycle=true;
        break;
        }
      }

      if(fast==null || fast.next==null){
        return null;
      }
      //step 2: Identifying the start of the cycle
      slow=head;
      while(slow!=fast){
        slow=slow.next;
        fast=fast.next;
      } 
      return slow;
    }
}