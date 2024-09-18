package array;
import java.util.*;
public class SmallBigNumber {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,7,6,8,2};

        Arrays.sort(arr);
        int temp;
        System.out.println("Sorted array:");
        for(int i=1;i<arr.length-1;i+=2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
