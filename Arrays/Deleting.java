public class Deleting {
    static int delete(int arr[],int n,int x){
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n) {
            return n;
        }

        for (int j = i; j < n-1; j++) {
            arr[j] = arr[j+1];
        }
        return n-1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5} , n = 5 , x = 2;

        System.out.println("Before Deletion:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        n = delete(arr, n, x);

        System.out.println("After deletion:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
