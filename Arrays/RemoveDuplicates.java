//Removing Duplicates from the sorted Array and returning the size of the new array.

public class RemoveDuplicates {
    static int removeDuplicates(int a[],int n){
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[res-1]) {
                a[res] = a[i];
                res++;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        int a[] = {1,1,1,2,2,2,2,3,3};
        int res = removeDuplicates(a, a.length);
        System.out.println(res);
    }
    
}
