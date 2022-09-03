class Searching{
    static int search(int arr[],int n,int key){
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key = 3;
        System.out.println(search(arr, arr.length, key));

    }
}