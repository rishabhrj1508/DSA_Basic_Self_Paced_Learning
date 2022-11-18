class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}


class Creation{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        System.out.println(head.data);
    }
}