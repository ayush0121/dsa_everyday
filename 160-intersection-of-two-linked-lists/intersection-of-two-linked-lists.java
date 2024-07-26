/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        int ac=0;
        int bc=0;
        while(a!=null){
            ac++;
            a=a.next;
        }
        while(b!=null){
            bc++;
            b=b.next;
        }
        while(ac>bc){
            ac--;
            headA=headA.next;
        }
        while(ac<bc){
            bc--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
        
    }
}