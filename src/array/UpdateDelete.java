package array;
import java.util.*;
public class UpdateDelete {
    public static void main(String[] args) {

        /* Update
        int arr[]=new int [5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=10;
        arr[3]=1;
        int i;
        for(i=3;i>=1;i--){
            arr[i+1]=arr[i];
        }
        arr[i+1]=20;

        for(int j=0;j<5;j++){
            System.out.println(arr[j]+" ");
        }

         */

        //Delete
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        // Input 4 elements
        System.out.println("Enter 4 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the number to delete
        System.out.print("Enter the number to delete: ");
        int numberToDelete = sc.nextInt();

        // Delete the number
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToDelete) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // Optional: Set the last element to a default value if needed
            arr[arr.length - 1] = 0;
        }

        // Determine new size (excluding trailing zeroes)
        int newSize = (index != -1) ? arr.length - 1 : arr.length;

        // Print the modified array without trailing zeroes
        System.out.println("Modified array:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
