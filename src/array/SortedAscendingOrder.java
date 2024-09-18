package array;
import java.util.*;
public class SortedAscendingOrder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size=in.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter elements "+size);
        for(int i=0;i<size;i++) {
            arr[i]=in.nextInt();
        }

        boolean isSorted=true;
        for(int i=0;i<size-1;i++) {
            if(arr[i] > arr[i+1]){
               isSorted=false;
               break;
            }
        }

        if(isSorted) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
