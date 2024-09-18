package array;

public class ShiftZero {
    public static void main(String[] args) {
        int arr[]={1,0,2,4,-1,0,6,0,-5,1,8,0};
        int n=arr.length;
        int newArr[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){ //first array
            if(arr[i]!=0) {
                newArr[j]=arr[i];
                j++; //second array move forward +1
            }
        }

        for(int i=j;i<n;i++) {
            arr[i]=0;
        }

        for(int i=0;i<n;i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
