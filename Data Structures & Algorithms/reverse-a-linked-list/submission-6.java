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
    public ListNode reverseList(ListNode head) {
        return reverseList(null, head);
    }

    private static ListNode reverseList(ListNode prev, ListNode head) {
        if (head == null) {
            return prev;
        }
        var next = head.next;
        head.next = prev;
        return reverseList(head, next);
    }
}
