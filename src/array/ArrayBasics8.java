//Write a Java program to find the average of all elements in an array of integers.
package array;
import java.util.*;
public class ArrayBasics8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        int sum=0;
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            sum=sum+arr1[i];
        }

        double avg=sum/n;
        System.out.println("Average of elemnets:"+avg);
    }
}
