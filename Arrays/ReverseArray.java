public class ReverseArray {

    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr);
        int[] ans = reverse(arr, 0, arr.length-1);
        print(arr);  
    }

    

    static int[] reverse(int[] arr,int start,int end){
        int temp =0;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    
}
