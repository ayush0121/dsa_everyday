
class Node {
    int data;
    Node next;
    Node prev;

    Node(int key) {
        this.data = key;
        next = null;
        prev = null;
    }
}

public class insertdll {

    public static Node insertbegin(Node head, int data) {
        Node temp = new Node(10);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;

    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        printlist(head);
        head = insertbegin(head, 5);
        printlist(head);
    }

}
