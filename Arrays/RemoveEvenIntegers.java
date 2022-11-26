/**
 * RemoveEvenIntegers
 */
public class RemoveEvenIntegers {

    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        print(arr);
        int[] result = removeEven(arr);
        print(result);

        
    }

    static int[] removeEven(int[] arr){
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddcount++;
            }
        }
        int[] result = new int[oddcount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}