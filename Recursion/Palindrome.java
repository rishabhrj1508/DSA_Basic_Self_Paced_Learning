public class Palindrome {


    static int sum = 0;
    static void reverse(int n){

        if (n==0) {
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse(n/10);

    }

    static boolean palindrome(int n){
        if (n == reverse(n)) {
            return true;
        }
    }

    public static void main(String[] args) {
        palindrome(121);
    }
    
}
