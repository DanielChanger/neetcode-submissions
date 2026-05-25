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
        var fast = head;
        var slow = head;
        var slowMove = false;
        while (fast != null && slow != null) {
            fast = fast.next;
            if (fast == slow) {
                return true;
            }
            if (slowMove) {
                slow = slow.next;
                slowMove = false;
            } else {
                slowMove = true;
            }
        }
        return false;
    }
}
