class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class Insertatposition {

    static Node insertAtPos(Node head , int data , int pos){
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos -2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
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
        insertAtPos(head, 35, 4);
        traversal(head);

    }
    
}
