//Find the Maximum Product of Two Elements in an Array
package array;
import java.util.*;
public class Advance6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+ " elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // Initialize the two largest elements
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        // Find the two largest elements in the array
        for(int i=0;i<n;i++) {
            if(arr[i]>max1) {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2) {
                max2=arr[i];
            }
        }

        //calculate the maximum product
        int maxProduct=max1*max2;

        System.out.println("Maximum product:"+maxProduct);
    }
}
