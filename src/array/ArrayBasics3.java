//Write a Java program to find the largest element in a given array of integers.
package array;
import java.util.*;
public class ArrayBasics3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array=");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++)   {
            arr[i]= sc.nextInt();
        }

        int largest=arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest element="+largest);
    }
}
