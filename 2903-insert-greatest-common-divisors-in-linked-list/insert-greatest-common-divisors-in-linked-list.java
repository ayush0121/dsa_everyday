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
    public int gcd(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return b;

    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head, curr=prev.next;
        while(curr!=null){
            ListNode newnode=new ListNode (gcd(prev.val,curr.val));
            prev.next=newnode;
            newnode.next=curr;
            prev=curr;
            curr=curr.next;
        }
        return head;
         
        
    }
}