public class MoveZeroestoEnd {
    static void moveZeroestoEnd(int a[],int n){
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != 0) {
                    int temp = a[i];
                    a[i] = a[count];
                    a[count] = temp;
                    count++;
                }
            }
        }


    public static void main(String[] args) {
        int a[]={8,5,0,10,0,20};
        moveZeroestoEnd(a, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
