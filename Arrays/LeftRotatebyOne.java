public class LeftRotatebyOne {
    static void leftRotatebyOne(int a[],int n){
        int temp = a[0];
        for (int i = 0; i < n-1; i++) {
            a[i] = a[i+1];
        }
        a[n-1]=temp;
    }
    public static void main(String[] args) {
        int a[] = {30,5,20};
        System.out.println("Before:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        leftRotatebyOne(a, a.length);
        System.out.println("After:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
    
}
