class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Deletefirst {

    static Node delFirst(Node head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
    }

    public static void traversal(Node head){
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
        head = delFirst(head);
        traversal(head);
    }

}
