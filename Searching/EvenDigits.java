public class EvenDigits {
    public static void main(String[] args) {

        int[] arr = {3,33,333,43,1,2232};
        System.out.println(evenDigits(arr));

    }

    static boolean even(int i ){

        if (i<0) {
            i = i*-1;
        }

        int count  = 0;
        while(i>0){
            count++;
            i = i/10;
        }
        return count%2==0;

        // String s = i + "";
        // return s.length()%2==0;
    }

    static int evenDigits(int[] arr){
        int count = 0;
        for (int i : arr) {
            if (i==0) {
                return 1;
            }
            if (even(i)) {
                count++;
            }
        }

        return count;
    }
    
}
