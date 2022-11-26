import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,4,5};
       
        System.out.println(search(arr,4,0,0));
    }
    
    
    static ArrayList<Integer> search(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = search(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
