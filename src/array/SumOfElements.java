package array;
import java.util.*;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=in.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter elements "+size);
        for(int i=0;i<size;i++) {
            arr[i]=in.nextInt();
        }

        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum of all elemnts:"+sum);
    }
}
