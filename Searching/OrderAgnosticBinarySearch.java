public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9};
        int[] arr2 = {3,3,3,3,3,3,3,3,3};
        System.out.println(binarysearch(arr,9));
        System.out.println(binarysearch(arr2, 3));
        
    }

    static int binarysearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        if (arr[start] < arr[end]) {

            while(start<=end){
                int mid = start + (end-start/2);
                
                if (arr[mid] == target) {
                    return mid;
                }
                else if (arr[mid] > target) {
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }
            return -1;
        }
        else if (arr[start]>arr[end]) {
            while(start<=end){
                int mid = start + (end-start/2);
                
                if (arr[mid]>target) {
                    start = mid+1; 
                }
                else if(arr[mid]<target){
                    end = mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        else{
            if (target == arr[start]) {
                return start;
            }
        }
        return -1;
    }
}
