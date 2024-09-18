//Write a Java program to declare and initialize an integer array with 5 elements, and print all the elements using a for loop.

package array;
import java.util.*;
public class ArrayBasics1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+ " elements:");
         for (int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }

        System.out.println("the elements are:");
         for (int i=0;i<n;i++) {
             System.out.print(arr[i] +" ");
         }
    }
}
