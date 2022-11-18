class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class SortedInsert {

    static Node sortedInsert(Node head, int x) {
        Node temp = new Node(x);
        Node curr = head;
        if (curr == null) {
            return temp;
        }
        if (curr.data > x) {
            temp.next = curr;
            return temp;
        }
        while (curr.next.data < x && curr.next != null) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

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
        head.next.next.next = new Node(40);
        head = sortedInsert(head, 35);
        traversal(head);

    }
}
