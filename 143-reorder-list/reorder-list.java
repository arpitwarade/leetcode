/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        int cut = (len + 1) / 2;
        curr = head;
        ListNode prev = null;
        while (cut-- > 0) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;

        ListNode rev = null;
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = rev;
            rev = curr;
            curr = nxt;
        }

        ListNode p1 = head;
        ListNode p2 = rev;

        while (p1 != null && p2 != null) {
            ListNode n1 = p1.next;
            ListNode n2 = p2.next;

            p1.next = p2;
            if (n1 == null) {
                break;
            }
            p2.next = n1;

            p1 = n1;
            p2 = n2;
        }
    }
}