public class Prime {

    static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        else{
            int c = 2;
            while (c*c<=n) {
                if (n%c==0) {
                    return false;
                }
                c++;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i <= n; i++) {
            
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    
}
