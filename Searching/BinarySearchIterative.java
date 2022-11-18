public class BinarySearchIterative {

    static int binarySearchIterative(int a[], int x){
        int size = a.length;
        int low = 0;
        int high = size-1;
        int mid;
        while (low<=high) {
            mid = (low+high)/2;
            if (a[mid] == x) {
                return mid;
            }
            else if(a[mid] < x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {5,15,25};
        int ans = binarySearchIterative(a,25);
        System.out.println(ans);

    }
}