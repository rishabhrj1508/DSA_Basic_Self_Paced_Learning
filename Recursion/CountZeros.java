public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(102301010, 0));
    }

    static int count(int n , int count){
        if (n==0) {
            return count;
        }
        int rem = n%10;
        if(rem==0){
            count++;
        }
        return count(n/10,count);
    }
    
}
