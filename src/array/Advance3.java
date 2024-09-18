//Find the Missing Number in an Array
package array;
import java.util.*;
public class Advance3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+ " elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int expectedSum=(n+1)*(n+2)/2;

        int actualSum=0;
        for(int i=0;i<n;i++) {
            actualSum=actualSum+arr[i];
        }

        int missingNumber=expectedSum-actualSum;

        System.out.println("Missing number:"+missingNumber);
    }
}



/*
// XOR of all numbers from 1 to n+1
        int xor1 = 0;
        for (int i = 1; i <= n + 1; i++) {
            xor1 ^= i;
        }

        // XOR of all elements in the array
        int xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor2 ^= arr[i];
        }

        // The missing number is the XOR of xor1 and xor2
        int missingNumber = xor1 ^ xor2;
 */