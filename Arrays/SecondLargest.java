import java.util.Arrays;

public class SecondLargest {

    static int secondlargest(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length-2; i >=0; i--) {
            if (arr[i] != arr[arr.length-1]) {
                return arr[i]; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,10,10,10};
        int ans = secondlargest(arr);
        System.out.println(ans);

    }

}