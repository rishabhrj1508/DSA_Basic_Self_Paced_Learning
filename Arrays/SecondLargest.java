import java.util.Scanner;

public class SecondLargest {

    static int secondlargest(int a[], int n) {
        int largest = 0;
        int res = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[largest]) {
                res = largest;
                largest = i;
            } else if (a[i] != a[largest]) {
                if (res == -1 || a[i] > a[res])
                    res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = secondlargest(a, n);
        System.out.println(a[pos]);
        sc.close();

    }

}