class MyStack {
    int arr[];
    int cap;
    int top;

    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return (top == -1);
    }
}

public class Arrays_Implementation {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
    }

}
