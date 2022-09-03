/*
Best Approach -- Reversal Algorithm

class LeftroatebyD
{ 
    static void leftRotate(int arr[], int d, int n)
    {
    	reverse(arr, 0, d - 1);
    	reverse(arr, d, n - 1);
    	reverse(arr, 0, n - 1);
    }

    static void reverse(int arr[], int low, int high)
    {
    	while(low < high)
    	{
    		int temp = arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;
    		low++;
    		high--;
    	}
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;
       System.out.println("Before Rotation");
       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
       System.out.println();
       leftRotate(arr, d, n);
       System.out.println("After Rotation");
       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    } 
}
 */

//Naive Approach

public class LeftRotatebyDplaces {
    static void leftrotateOne(int a[] , int n){
        int temp = a[0];
        for (int i = 0; i < n-1; i++) {
            a[i] = a[i+1];
        }
        a[n-1] = temp;
    }

    static void leftRotatebyD(int a[],int n,int d){
        for (int i = 0; i < d; i++) {
            leftrotateOne(a, n);
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int d = 2;

        System.out.println("Before:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        leftRotatebyD(a, a.length,d);
        System.out.println("After:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
    }
}

/*
Efficeint Method

void leftRoatebyD(int a[],int n ,int d){
    int temp[d];
    for(int i=0;i<d;i++){
        temp[i]=a[i];
    }

    for(int i=d;i<n;i++){
        a[i-d]=a[i];
    }

    for(int i=0;i<d;i++){
        a[n-d+1]=temp[i];
    }
}

*/
