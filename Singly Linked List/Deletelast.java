class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Deletelast {

    static Node deleteLast(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        if (curr.next == null) {
            return null;
        } else {
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
            return head;
        }
    }

    public static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        traversal(head);
        deleteLast(head);
        traversal(head);
    }

}
