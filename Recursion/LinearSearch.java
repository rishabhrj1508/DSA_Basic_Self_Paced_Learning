public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(search(arr, 0, 0));
    }

    static boolean search(int arr[] , int element, int index){
        if (element == arr.length) {
            return false;
        }
        return arr[index]==element || search(arr, element, index+1);
    }
    
}
