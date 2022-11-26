public class NumberofSteps {
    public static void main(String[] args) {
        System.out.println(count(8,0));
    }

    static int count(int n , int count){
        if (n==0) {
            return count;
        }
        if (n%2==0) {
            count++;
            return count(n/2,count);
        }
        return count(n-1,++count);
    }
}
