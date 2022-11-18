class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Traversal {

    static void traversal(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        traversal(head);
    }

}

/*
Recursive Function

    void traversal(Node head){
        if(head == null){
            return;
        }
        sout(head.data);
        traversal(head.next);
    }
 */
