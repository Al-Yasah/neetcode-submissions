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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode dummy = head;
        ListNode p1 = dummy;
        ListNode p2 = dummy.next.next;
        while (p2 != null && p2.next!=null){ 
            if (p1 == p2){
                return true;
            }
            p1 = p1.next;
            p2=p2.next.next;
        }
        return false;
    }
}
