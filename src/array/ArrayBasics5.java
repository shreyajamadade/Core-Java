
//Write a Java program to search for a specific element in an array and print its index.
// If the element is not found, print a message saying so.
package array;

import java.util.Scanner;

public class ArrayBasics5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array=");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched:");
        int search = sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index:" + i);
                break;
            }
        }

        //if the loop completes and no match was found
        if (i==n) {
            System.out.println("Element not found");
        }
    }
}
