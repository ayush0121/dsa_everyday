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
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode curr=head;
        int count=1;
        while(curr.next!=null){
            curr=curr.next;
            count++;
            
        }
        curr.next=head;
        k=k%count;
        for(int i=0;i<count-k;i++){
            curr=curr.next;

        }
        head=curr.next;
        curr.next=null;
        return head;

        
        
    }
}