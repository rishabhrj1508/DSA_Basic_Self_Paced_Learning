class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class MiddleNode {

    static void middleNode(Node head){
        if (head == null) {
            return;            
        }
        int count = 0;
        Node curr;
        for(curr = head ; curr != null ; curr =curr.next){
            count++;
        }
        curr = head;
        for (int i = 0; i < count/2; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);  
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
        head.next.next.next.next = new Node(50);
        middleNode(head);
        
    }
    
}

/*
    void printmiddle(Node head){
        if(head == null){
            returnl
        }
        Node slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        sout(slow.data);
    }
 */
