/**
 * PrintNto1
 */
public class PrintNto1 {

    static void print(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        print(5);
    }
}