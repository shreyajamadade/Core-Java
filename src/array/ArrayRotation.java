package array;
import java.util.*;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,1,3,6,7};

        System.out.println("enter the number of rotation:");
        int rouNum=sc.nextInt();

        for(int j=0;j<rouNum;j++) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
