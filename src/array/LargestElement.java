package array;
import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter elements size: ");
        int size=in.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter elements:"+size);
        for(int i=0;i<size;i++) {
            arr[i]=in.nextInt();
        }

        int largest=arr[0];//consider first element largest
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>largest) {
                largest=arr[i];
            }
        }

        System.out.println("Largest element:"+largest);
    }
}
