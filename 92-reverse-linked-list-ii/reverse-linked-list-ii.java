class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode temp = head;
        ListNode before = null;

        int pos = 1;

        while (pos < left) {
            before = temp;
            temp = temp.next;
            pos++;
        }

        ListNode prev = null;
        ListNode curr = temp;

        while (pos <= right) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;

            pos++;
        }

        if (before != null) {
            before.next = prev;
        } else {
            head = prev;
        }

        temp.next = curr;

        return head;
    }
}