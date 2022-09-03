public class Largest {
    static int largest(int arr[],int n){
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        return lar;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(largest(arr, arr.length));
    }
}
