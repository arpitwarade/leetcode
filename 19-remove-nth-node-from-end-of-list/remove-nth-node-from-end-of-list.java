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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int z =0;
        while(curr!=null){
            curr = curr.next;
            z++;
        }  
        curr = head;
        z -= n;
         if (z == 0) {
            return head.next;
        }
        ListNode prev = curr;
        while(z>0){
            prev = curr;
            curr = curr.next;
            z--;
        }
        prev.next = curr.next;
        return head;
    }
}