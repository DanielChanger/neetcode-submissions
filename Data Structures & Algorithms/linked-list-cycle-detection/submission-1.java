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
        var node = head;
        boolean hasCycle = false;
        ListNode cyclePoint = null;
        while (node != null) {
            if (node.val >= 1000) {
                hasCycle = true;
                cyclePoint = node;
                break;
            }
            node.val += 1000;
            node = node.next;
        }
        node = head;
        int i = 0;
        while (node != null) {
            node.val -= 1000;
            node = node.next;
            if (node == cyclePoint) {
                if (i == 1) {
                    break;
                }
                i++;
            }
        }
        return hasCycle;
    }
}
