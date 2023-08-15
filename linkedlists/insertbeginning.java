
//making of the class named node .
class Node{
    int data;
    Node next;
    Node(int key){
        data=key;
        next=null;

    }
}

//making another linkedlist class in which we will make a printlist function to print the elements of the linkedlist
class linkedlist{
    Node head;
    public void insertatbegin(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;

    }
    public void printlist(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data+"");
            temp=temp.next;
            
        }
    }
}
    public class insertbeginning{
        public static void main(String[] args) {
            linkedlist list=new linkedlist();
            list.insertatbegin(30);
            list.insertatbegin(20);
            list.insertatbegin(10);
            list.printlist();
            
        }
    }