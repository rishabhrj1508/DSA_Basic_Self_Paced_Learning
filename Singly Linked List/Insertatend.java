class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class Insertatend {

    static Node insertAtEnd(Node head,int x){
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
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
        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        traversal(head);
    }
    
}
