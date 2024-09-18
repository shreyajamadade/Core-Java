//Write a Java program to find the sum of all elements in a given integer array.
package array;
import java.util.*;
public class ArrayBasics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array=");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++)   {
            arr[i]= sc.nextInt();
        }

        int sum=0;
        for (int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of elements="+sum);
    }
}
