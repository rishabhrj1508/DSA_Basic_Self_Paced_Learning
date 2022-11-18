class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class Insertatbegin {

    static Node insertAtBegin(Node head,int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;
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
        head = insertAtBegin(head, 10);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 30);
        traversal(head);
    }
    
}
