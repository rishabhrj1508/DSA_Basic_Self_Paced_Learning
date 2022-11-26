public class PassingNumber {
    static void fun(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        // fun(n--); this will do infinite recursion.
        fun(--n);
    }
    public static void main(String[] args) {
        fun(5);
    }
    
}
