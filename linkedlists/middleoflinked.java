class Node{
    int data;
    Node next;
    Node(int key){
        data=key;
        next=null;
    }
}
public class middleoflinked {
    public static Node  middlenode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node (20);
        head.next.next=new Node (30);
        head.next.next.next=new Node (40);
        middleoflinked ll=new middleoflinked();
        ll.middlenode(head);
        Node middleNode=middleoflinked.middlenode(head);
        System.out.println(middleNode.data);
    }
   
}
