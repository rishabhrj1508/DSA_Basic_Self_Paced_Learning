public class ReversePrinting {

    static void reverse(int n){
        if (n<1) {
            return;
        }
        System.out.println(n);
        reverse(n-1);
    }
    public static void main(String[] args) {
        reverse(5);
    }
    
}
