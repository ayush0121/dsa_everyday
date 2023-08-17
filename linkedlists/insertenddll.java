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

public class insertenddll {

    public static Node inseratend(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static void printlist(Node head) {
        Node curr1 = head;
        while (curr1 != null) {
            System.out.print(curr1.data + " ");
            curr1 = curr1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        printlist(head);
        head = inseratend(head, 5);
        printlist(head);
    }

}
