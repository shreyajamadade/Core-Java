package array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,7,8};
        int n=arr.length;

        for(int i=0;i<n-1;i++) {
            if(arr[i+1]-arr[i]!=1) {
                System.out.println("Missing element:"+(arr[i]+1));
                break;
            }
        }
    }
}
// arr[i+1]-arr[i]!=1
//3-2=1