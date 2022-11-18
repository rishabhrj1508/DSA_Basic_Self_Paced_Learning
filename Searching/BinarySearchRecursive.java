public class BinarySearchRecursive {
    static int binarySearchRecursive(int a[] , int x , int low , int high){
        if (low>high) {
            return -1;
        }
        int mid = (low+high)/2;
        if (a[mid] == x) {
            return mid;
        }
        else if (a[mid] > x) {
            return binarySearchRecursive(a, x, low, mid-1);
        }
        else{
            return binarySearchRecursive(a, x, mid+1, high);
        }


    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int ans = binarySearchRecursive(a, 4, 0, a.length-1);
        System.out.println(ans);
        
    }
    
}
