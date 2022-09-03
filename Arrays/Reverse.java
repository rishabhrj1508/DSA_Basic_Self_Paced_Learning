public class Reverse {

    static void reverseArray(int a[] , int n){
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int n = 6;
        System.out.println("Before Reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("After Reversing: ");
        reverseArray(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
