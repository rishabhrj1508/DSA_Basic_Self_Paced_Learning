/**
 * Finddigit
 */
public class Finddigit {

    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,4,6};
        int unique = 0;
        for (int i : arr) {
            unique = unique^i;
        }
        System.out.println(unique);
    }
}