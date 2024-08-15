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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            // Special case: if there's only one node, return null (no nodes left)
            return null;
        }
        
        // Use two pointers: slow and fast
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast pointer 2 steps and slow pointer 1 step each time
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        prev.next = slow.next;
        
        return head;
        
    }
}