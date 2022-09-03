public class IntegerPrinting {

    static void printInteger(int n){
        if (n==0) {
            return;
        }
        printInteger(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printInteger(5);
    }
    
}
