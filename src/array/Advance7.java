//Merge Two Sorted Arrays
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Advance7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter first size of array:");
        int n1=in.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter first array elements:");
        for(int i=0;i<n1;i++) {
            arr1[i]=in.nextInt();
        }

        System.out.println("Enter second size of array:");
        int n2=in.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter second array elements:");
        for(int i=0;i<n2;i++) {
            arr2[i]=in.nextInt();
        }

        //merged the two sorted arrays
        int mergedArray[]=new int[n1+n2];
        int i=0,j=0,k=0;

        //merge arrays until one is exhausted
        while(i<n1 && j<n2) {
            if(arr1[i] < arr2[j]) {
                mergedArray[k]=arr1[i];
                i++;
                k++;
            }
            else {
                mergedArray[k]=arr2[j];
                j++;
                k++;
            }
        }

        //copy remaining elements from arr1,if any
        while(i<n1) {
            mergedArray[k]=arr1[i];
            i++;
            k++;
        }

        //copy remaining elemnts in from arr2,if any
        while(j<n2) {
            mergedArray[k]=arr2[j];
            j++;
            k++;
        }

        //print the merged sorted array
        System.out.println("Merged sorted array:"+ Arrays.toString(mergedArray));

    }
}
