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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        int sum = 0;
        ListNode temp = new ListNode(0);
        ListNode curr = temp;

        while(l1 != null || l2 != null || remainder !=0 ){
            
            int x = 0;
            int y =0;

            if (l1 != null){
                x= l1.val;
                l1=l1.next;
              
            }
            else{
                x = 0;
            }
            if (l2 != null){
                y= l2.val;
                l2=l2.next;
                
            }
            else{
                y = 0;
            }
            
            
            sum = x+y+remainder;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            remainder = sum/10;
        }
        return temp.next;
    }
}