public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ans = searchinRange(arr, 6, 0, 2);
        System.out.println(ans);
        
    }

    static int searchinRange(int[] arr , int target , int start , int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
}
