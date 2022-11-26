//Works on Sorted array

public class BInarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarysearch(arr, 9));
        
    }

    static int binarysearch(int[] arr , int target){
        if (arr.length==0) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start/2);
            if (arr[mid] == target) {
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }
    
}
