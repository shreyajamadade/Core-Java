//Write a Java program to sort an array of integers in ascending order.
package array;

import java.util.*;

public class ArrayBasics6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted in ascending order:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
