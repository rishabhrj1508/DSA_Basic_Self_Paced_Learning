/**
 * OddEven cheching using Bitwise
 */
public class OddEven {
    public static void main(String[] args) {
        int n = 68;
        if((n&1) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("False");
        }   
    }
}