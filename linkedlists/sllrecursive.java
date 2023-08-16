public class sllrecursive {
    /*static class Node{
        int data;
        Node next;
        Node(int key){
            data=key;
            next=null;
        }
    }*/


    static class Node {
        int data;
        Node next;
        Node(int key){
            data=key;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        head.next.next=temp2;
        printlist(head);
        
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
    }
    
}
