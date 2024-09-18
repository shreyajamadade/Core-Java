package array;

public class Delete {
    public static void main(String[] args) {

        int arr[]={4,2,1,6,7,23,12};

        int n= arr.length;

        int arr1[]=new int[n];

        for(int i=1;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n=n-1;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
