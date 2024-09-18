package array;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Advance2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+ " elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //index number
        System.out.println("Enter k element:");
        int k=sc.nextInt();

        //Temporary Array and Store the Last k Elements
        int[] temp=new int[n];
        for(int i=0;i<k;i++) {
            temp[i] = arr[i];
        }

        //Shift Remaining Elements
        int x=k;
        for(int i=0;x<n;i++) {
            arr[i] = arr[x++];
        }

        //Copy the Elements from temp to the End of the Array
        x=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[x++];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

/*
            int arr[]={2,1,3,6,7};
            int temp=arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
        }
            arr[arr.length-1]=temp;
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
        }
 */

