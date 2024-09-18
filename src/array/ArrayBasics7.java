// Write a Java program to copy all elements from one array to another.
package array;
import java.util.*;
public class ArrayBasics7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2=new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Copy of elements:");
        for(int i=0 ; i<n ; i++) {
            arr2[i]=arr1[i];
            System.out.print(arr2[i]+" ");
        }


    }
}
