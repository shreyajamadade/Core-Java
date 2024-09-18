//Write a Java program to check if two arrays are equal.
package array;
import java.util.*;
public class ArrayBasics10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter array size of arr1 and arr2:");
        int n=in.nextInt();
        int m=in.nextInt();

        if (n != m) {
            System.out.println("Arrays are not equal sizes are different.");
            return; // Exit the program since sizes are different
        }

        int arr1[]=new int[n];
        int arr2[]=new int[m];

        System.out.println("Enter array elements of arr1:"+n);
        for(int i=0;i<n;i++) {
            arr1[i]=in.nextInt();
        }

        System.out.println("Enter array elements of arr2:"+m);
        for(int i=0;i<m;i++){
            arr2[i]=in.nextInt();
        }

        if(Arrays.equals(arr1,arr2)) {
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
