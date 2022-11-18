public class XORrange {
    public static void main(String[] args) {
        //range xor of a till b

        int a = 1113;
        int b = 1119;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        //TLE for large input
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 = ans2 ^ i;
        }
        System.out.println(ans2);
        
    }

    //this will give xor from 0 to a
    static int xor(int a){
        if (a%4 == 4) {
            return a;
        }
        if (a%4 == 1) {
            return 1;
        }
        if (a%4==2) {
            return (a+1);
        }
        return 0;
    }
    
}
